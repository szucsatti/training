package com.szucsatti.training.networksimulator;

import com.szucsatti.generated.networksimulator.RoutingTable;
import com.szucsatti.generated.networksimulator.RoutingTableEntry;

public class RoutingTableExtended extends RoutingTable {

  public RoutingTableExtended() {

  }


  public void addEntry(final RoutingTableEntry entry) {
    getRoutingTableEntry().add(entry);
  }

}
