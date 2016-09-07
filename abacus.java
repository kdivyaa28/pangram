// import the service interface definitions and their
// helper classes
import xmltoday_delayed_quotes.GetQuote;
import
xmltoday_delayed_quotes.GetQuoteServiceLocator;
public class MyClient {
public static void main(String [] args) throws
Exception {
// get the service from the service locator helper class
// and the physical address is record in this locator help
// class
GetQuoteServiceLocator locator = new
GetQuoteServiceLocator();
GetQuote getQuote = locator.getGetQuote();
 //invoke the service
float result = getQuote.getQuote("Dummy, Inc.");
System.out.println("got result: " + result); 
}
}
