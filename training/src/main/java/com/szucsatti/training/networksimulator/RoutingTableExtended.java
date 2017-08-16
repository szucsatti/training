package com.szucsatti.training.networksimulator;

import com.szucsatti.networksimulator.RoutingTable;
import com.szucsatti.networksimulator.RoutingTableEntry;

public class RoutingTableExtended extends RoutingTable{

	public RoutingTableExtended(){
		
	}
	
	public void addEntry(final RoutingTableEntry entry) {
		getRoutingTableEntry().add(entry);
	}

}
