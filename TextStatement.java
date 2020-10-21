import java.util.Enumeration;

public class TextStatement extends Statement {

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
      return "Rental Record for " + name + "\n";
   }

   private String movieCharge(String title, double charge) {
      return "\t" + title + "\t" + String.valueOf(charge) + "\n";
   }

   private String totalCharge(double charge) {
      return "Amount owed is " + String.valueOf(charge) + "\n";
   }

   private String frequentRenterPoints(int points) {
      return "You earned " + String.valueOf(points) +
          " frequent renter points\n";
   }
}
