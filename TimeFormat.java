public class TimeFormat {
    public static void main(String[] args) {
      
        
        int time = Integer.parseInt(args[0]);
        
        int hours = Integer.parseInt(""+args[0].charAt(0) +args[0].charAt(1) );
        int minuts = Integer.parseInt(""+args[0].charAt(3) +args[0].charAt(4) );
       
        if (hours > 12 ) { 
       hours = hours -12;
       

        if ( minuts>= 10) { 
       System.out.println(hours + ":0"+ minuts + "PM");
        }

        else {
            System.out.println(hours + ":" + minuts+ "PM");
        }
    }
    else{
        if ( minuts>= 10) { 
            System.out.println(hours + ":0"+ minuts + "AM");
             }
     
             else {
                 System.out.println(hours + ":" + minuts+ "AM");
             }
    }
}
       