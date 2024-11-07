public class FVCalc {
    public static void main(String[] args) {
        int currentValue= Integer.parseInt(args[0]) ; 
        double percentage= Double.parseDouble(args[1]) ; 
        int years =Integer.parseInt(args[2]) ;

        double rate =percentage /100;

       double futureValue = currentValue * Math.pow(1 + rate,years);
       


       System.out.println("After " + years + " years, "+ currentValue +"$ saved at " + percentage+"% will yield " + (int) futureValue + "$.");
}
}
