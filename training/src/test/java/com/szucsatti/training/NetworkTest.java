package com.szucsatti.training;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import com.szucsatti.training.networksimulator.Network;
import com.szucsatti.training.networksimulator.NetworkInterface;
import com.szucsatti.training.networksimulator.NodeId;
import com.szucsatti.training.networksimulator.RoutingTable;

public class NetworkTest {

	private static final String NETWORK_NAME = "Wireless Mesh Network";
	
	private static final Integer NETWORK_SIZE = 3;
	
	private static final String FIRST_NODE_HOSTNAME = "MSGN456-8";
	
	private static final Integer FIRST_NODE_EXPIRES = 100;

	private static final String LAST_NODE_HOSTNAME = "GBCF456-8";
	
	private static final Integer LAST_NODE_EXPIRES = 550;
	
	private static final String FIRST_NODE_IP_ADDRESS = "192.168.0.5";

	private static final String LAST_NODE_GATEWAY = "192.160.14.254";
	
	private Network classUnderTest;
	
	@Before
	public void setUp(){
		classUnderTest = buildNetwork();
	}
	
	private Network buildNetwork(){
		return null;
	}
	
	@Test
	public void testNetworkName(){
		assertThat(classUnderTest.getName(), is(NETWORK_NAME));
	}
	
	@Test
	public void testNetworkSize(){
		assertThat(classUnderTest.getNodes().size(), is(NETWORK_SIZE));
	}
	
	@Test
	public void getNetworkIpAddress(){
		NodeId nodeId = new NodeId(FIRST_NODE_HOSTNAME, FIRST_NODE_EXPIRES);
		NetworkInterface networkInterface = classUnderTest.getNodeById(nodeId).getNetworkInterfaces().get(0); 
		assertThat(networkInterface.getIpAddress(), is(FIRST_NODE_IP_ADDRESS));
	}
	
	@Test
	public void getRoutingTableGateWay(){
		NodeId nodeId = new NodeId(LAST_NODE_HOSTNAME, LAST_NODE_EXPIRES);
		NetworkInterface networkInterface = classUnderTest.getNodeById(nodeId).getNetworkInterfaces().get(0);
		RoutingTable routingTable = networkInterface.getRoutingTable();
		assertThat(routingTable.getRountingTableEntries().get(1).getGateWay(), is(LAST_NODE_GATEWAY));
	}
}
