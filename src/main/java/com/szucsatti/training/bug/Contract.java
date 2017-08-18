package com.szucsatti.training.bug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Contract {

  private final List<Entry> entryList = new ArrayList<>();

  private Date startDate;
  private Date endDate;

  private static final Comparator<? super Entry> DATE_COMPARATOR = new Comparator<Entry>() {

    @Override
    public int compare(final Entry firstEntry, final Entry secondEntry) {
      return firstEntry.getDate().compareTo(secondEntry.getDate());
    };
  };


  public List<Entry> getEntryList() {
    return entryList;
  }


  public void addEntry(final Entry entry) {
    if (startDate == null || startDate.after(entry.getDate()))
      startDate = entry.getDate();
    if (endDate == null || endDate.before(entry.getDate()))
      endDate = entry.getDate();

    int index = Collections.binarySearch(entryList, entry, DATE_COMPARATOR);
    if (index < 0)
      entryList.add(entry);
    else {
      Entry selectedEntry = entryList.get(index);
      if (selectedEntry != null)
        selectedEntry.aggregate(entry);
    }
  }

}
