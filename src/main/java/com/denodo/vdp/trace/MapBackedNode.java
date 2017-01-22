package com.denodo.vdp.trace;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

public class MapBackedNode implements Node {

	private final String type;
	private final Map<String,JsonNode> attributes;
	public MapBackedNode(String type, Map<String, JsonNode> attributes) {
		super();
		this.type = type;
		this.attributes = attributes;
	}
	@Override
	public String type() {
		return type;
	}
	@Override
	public Map<String, JsonNode> attributes() {
		return attributes;
	}
	
}
