package com.denodo.vdp.trace;

import java.util.List;
import java.util.stream.Stream;

public class ArrayBackedTree<T> implements Tree<T> {

	private T node;
	
	private List<Tree<T>> children;

	public ArrayBackedTree(T root, List<Tree<T>> children) {
		super();
		this.node = root;
		this.children = children;
	}

	@Override
	public T root() {
		return node;
	}

	@Override
	public Stream<Tree<T>> children() {
		return children.stream();
	}

	@Override
	public Stream<Tree<T>> descendants() {
		return children.stream().flatMap(tree -> tree.descendants());
	}
}
