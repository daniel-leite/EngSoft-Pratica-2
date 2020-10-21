import java.util.Enumeration;

public abstract class Statement {

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

   protected abstract String name(String name);
   protected abstract String movieCharge(String title, double charge);
   protected abstract String totalCharge(double charge);
   protected abstract String frequentRenterPoints(int points);
}
