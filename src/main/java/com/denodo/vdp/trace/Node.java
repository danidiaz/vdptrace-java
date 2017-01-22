package com.denodo.vdp.trace;

import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

public interface Node {
	public String type();

	public Map<String,JsonNode> attributes();

	default public Optional<JsonNode> attribute(String name) {
		return Optional.ofNullable(attributes().get(name));
	}
}
