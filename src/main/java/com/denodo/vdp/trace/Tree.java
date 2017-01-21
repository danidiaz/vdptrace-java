package com.denodo.vdp.trace;

import java.util.stream.Stream;

public interface Tree<T> {

	public T root();
	
	public Stream<Tree<T>> children();
	
	public Stream<Tree<T>> descendants();
}
