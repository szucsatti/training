package com.szucsatti.training.collections;

public class IntegerPool {

  public static void main(final String args[]) {
    //    compareIntegers(300, true);
    compareIntegers(30, false);
  }


  public static void compareIntegers(final int value, final boolean enableAutoboxing) {
    Integer iAmEleven = createInteger(value, enableAutoboxing);
    Integer iAmElevenToo = createInteger(value, enableAutoboxing);

    if (iAmEleven == iAmElevenToo)
      System.out.println("same reference");
    if (iAmEleven.equals(iAmElevenToo))
      System.out.println("same value");
  }


  private static Integer createInteger(final int value, final boolean enableAutoboxing) {
    if (enableAutoboxing)
      return value;
    return new Integer(value);
  }

}
