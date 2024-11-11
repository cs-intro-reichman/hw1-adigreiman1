public class TimeFormat {
    public static void main(String[] args) {
      
        
        String time = args[0];
        
        int hours = Integer.parseInt(""+time.charAt(0) +time.charAt(1) );
        int minuts = Integer.parseInt(""+time.charAt(3) +time.charAt(4) );
       
        if (hours > 12 ) { 
       hours = hours -12;
       

        if ( minuts<= 10) { 
       System.out.println(hours + ":0"+ minuts + " PM");
        }

        else {
            System.out.println(hours + ":" + minuts+ " PM");
        }
    }
    else{
        if ( minuts<= 10) { 
            System.out.println(hours + ":0"+ minuts + " AM");
             }
     
             else {
                 System.out.println(hours + ":" + minuts+ " AM");
             }
    }
    if (hours == 12 ) { 
        if ( minuts<= 10){
        System.out.println(hours + ":0"+ minuts + " PM");
        }

        else {
            System.out.println(hours + ":" + minuts+ " PM");
        }
    }
}
}
       