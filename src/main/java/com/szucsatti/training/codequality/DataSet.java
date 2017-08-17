package com.szucsatti.training.codequality;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

  enum Type {

    VCF,
    MSF;

  }

  private Type type;

  List<DataSetRow> rowCount = new ArrayList<>();


  public Type getType() {
    return type;
  }


  public int getRowCount() {
    return rowCount.size();
  }


  public DataSetRow getRow(final int index) {
    return rowCount.get(index);
  }

}
