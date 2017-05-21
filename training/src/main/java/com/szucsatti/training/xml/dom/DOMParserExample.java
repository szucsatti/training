package com.szucsatti.training.xml.dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.szucsatti.training.xml.Letter;

public class DOMParserExample {

  private static final String ELEMENT_BODY = "body";

  private static final String ELEMENT_HEADING = "heading";

  private static final String ELEMENT_FROM = "from";

  private static final String ELEMENT_TO = "to";

  private List<Letter> letterList;

  private Document dom;


  public DOMParserExample() {
    letterList = new ArrayList<Letter>();
  }


  public void runExample() {
    parseXmlFile();
    parseDocument();
    printData();
  }


  private void parseXmlFile() {
    //creating factory
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

    try {
      //creating document builder
      DocumentBuilder db = dbf.newDocumentBuilder();
      //creating DOM representation
      dom = db.parse("src/resources/xml/letterWithXSD.xml");
    }
    catch (ParserConfigurationException pce) {
      pce.printStackTrace();
    }
    catch (SAXException se) {
      se.printStackTrace();
    }
    catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }


  private void parseDocument() {
    //the root element
    Element docEle = dom.getDocumentElement();
    //letter node list
    NodeList nl = docEle.getElementsByTagName("letter");

    if (nl != null && nl.getLength() > 0)
      for (int i = 0; i < nl.getLength(); i++) {
        Element el = (Element) nl.item(i);
        Letter e = createLetterFrom(el);
        letterList.add(e);
      }
  }


  private Letter createLetterFrom(final Element element) {
    String to = getText(element, ELEMENT_TO);
    String from = getText(element, ELEMENT_FROM);
    String heading = getText(element, ELEMENT_HEADING);
    String body = getText(element, ELEMENT_BODY);
    Letter letter = new Letter(to, from, heading, body);

    return letter;
  }


  private String getText(final Element element, final String tagName) {
    String textVal = null;
    NodeList nl = element.getElementsByTagName(tagName);

    if (nl != null && nl.getLength() > 0) {
      Element el = (Element) nl.item(0);
      textVal = el.getFirstChild().getNodeValue();
    }
    return textVal;
  }


  private void printData() {
    System.out.println("No of letters '" + letterList.size() + "'.");

    Iterator<Letter> it = letterList.iterator();
    while (it.hasNext())
      System.out.println(it.next());
  }


  public static void main(final String[] args) {
    DOMParserExample dpe = new DOMParserExample();
    dpe.runExample();
  }

}
