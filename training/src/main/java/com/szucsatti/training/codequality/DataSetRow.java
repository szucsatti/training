package com.szucsatti.training.codequality;

import java.util.ArrayList;
import java.util.List;

public class DataSetRow {

  public static List<String> list = new ArrayList<>();


  public String getColumn(final int index) {
    return list.get(index);
  }

}
