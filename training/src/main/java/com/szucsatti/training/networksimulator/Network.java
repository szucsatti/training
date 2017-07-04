package com.szucsatti.training.networksimulator;

import java.util.Collection;

public interface Network {

	String getName();
	
	Collection<Node> getNodes();
	
	Node getNodeById(final NodeId nodeId);
	
	void putNode(final NodeId nodeId, Node node );
	
}
