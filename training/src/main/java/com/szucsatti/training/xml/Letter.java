package com.szucsatti.training.xml;

public class Letter {

  private String to;

  private String from;

  private String heading;

  private String body;


  public Letter(final String to, final String from, final String heading, final String body) {
    super();
    this.to = to;
    this.from = from;
    this.heading = heading;
    this.body = body;
  }


  public String getTo() {
    return to;
  }


  public String getFrom() {
    return from;
  }


  public String getHeading() {
    return heading;
  }


  public String getBody() {
    return body;
  }


  public void setTo(final String to) {
    this.to = to;
  }


  public void setFrom(final String from) {
    this.from = from;
  }


  public void setHeading(final String heading) {
    this.heading = heading;
  }


  public void setBody(final String body) {
    this.body = body;
  }


  @Override
  public String toString() {
    return "to: " + to + " from: " + from + " heading: " + heading + " body: " + body;
  }

}
