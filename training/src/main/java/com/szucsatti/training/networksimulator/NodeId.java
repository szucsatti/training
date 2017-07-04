package com.szucsatti.training.networksimulator;

public class NodeId {

	private final String hostName;
	
	private final Integer expires;

	public NodeId(final String hostName, final Integer expires) {
		super();
		this.hostName = hostName;
		this.expires = expires;
	}

	public String getHostName() {
		return hostName;
	}

	public Integer getExpires() {
		return expires;
	}
	
}
