import java.util.Enumeration;

public class HtmlStatement extends Statement {

   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = name(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += movieCharge(each.getMovie().getTitle(), each.getCharge());
      }
      //add footer lines
      result += totalCharge(aCustomer.getTotalCharge());
      result += frequentRenterPoints(aCustomer.getTotalFrequentRenterPoints());
      return result;
   }

   private String name(String name) {
      return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
   }

   private String movieCharge(String title, double charge) {
      return title + ": " + String.valueOf(charge) + "<BR>\n";
   }

   private String totalCharge(double charge) {
      return "<P>You owe <EM>" + String.valueOf(charge) + "</EM><P>\n";
   }

   private String frequentRenterPoints(int points) {
      return "On this rental you earned <EM>" + String.valueOf(points) +
          "</EM> frequent renter points<P>";
   }
}
