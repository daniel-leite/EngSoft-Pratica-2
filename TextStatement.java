public class TextStatement extends Statement {

   protected String name(String name) {
      return "Rental Record for " + name + "\n";
   }

   protected String movieCharge(String title, double charge) {
      return "\t" + title + "\t" + String.valueOf(charge) + "\n";
   }

   protected String totalCharge(double charge) {
      return "Amount owed is " + String.valueOf(charge) + "\n";
   }

   protected String frequentRenterPoints(int points) {
      return "You earned " + String.valueOf(points) +
          " frequent renter points\n";
   }
}
