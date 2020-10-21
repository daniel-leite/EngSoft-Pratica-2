public class HtmlStatement extends Statement {

   protected String name(String name) {
      return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
   }

   protected String movieCharge(String title, double charge) {
      return title + ": " + String.valueOf(charge) + "<BR>\n";
   }

   protected String totalCharge(double charge) {
      return "<P>You owe <EM>" + String.valueOf(charge) + "</EM><P>\n";
   }

   protected String frequentRenterPoints(int points) {
      return "On this rental you earned <EM>" + String.valueOf(points) +
          "</EM> frequent renter points<P>";
   }
}
