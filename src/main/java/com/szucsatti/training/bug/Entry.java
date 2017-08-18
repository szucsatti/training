package com.szucsatti.training.bug;

import java.io.Serializable;
import java.util.Date;

public class Entry implements Serializable {

  private Date date;

  private Integer id;

  private Double volume;

  private Double rate;


  public Date getDate() {
    return date;
  }


  public Integer getId() {
    return id;
  }


  public Double getVolume() {
    return volume;
  }


  public Double getRate() {
    return rate;
  }


  public void setDate(final Date date) {
    this.date = date;
  }


  public void setId(final Integer id) {
    this.id = id;
  }


  public void setVolume(final Double volume) {
    this.volume = volume;
  }


  public void setRate(final Double rate) {
    this.rate = rate;
  }


  public void aggregate(final Entry entry) {
    volume = entry.getVolume();
  }

}
