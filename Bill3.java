public class Bill3 {
    public static void main(String[] args) {
    String firstName = args[0];
    String secondName = args[1];
    String thirdName = args[2];
    double bill =Double.parseDouble(args[3]) ;
    double amount = bill / 3;

    

    System.out.println("Dear " +firstName + ", " + secondName +" and " + thirdName +": pay " + amount + " Shekels each.");
   
    }
    }
