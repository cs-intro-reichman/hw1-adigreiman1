public class TimeFormat {
    public static void main(String[] args) {
      
        
        int hours = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[1]); 

        int newHour;
        if (hours == 0) { 
            newHour = 0;
        } else if (hours > 12) { 
            newHour = hours - 12;
        } else {
            newHour = hours;
        }

        
        String minuteStr;
        if (minutes < 10) {
            minuteStr = "0" + minutes;
        }
        else {
            minuteStr = ""+minutes;
        }

        String kindOfTime ;

        if (hours < 12) {
            kindOfTime = "AM";
        } else {
            kindOfTime = "PM";
        }
       
        System.out.println(newHour + ":" + minuteStr + " " + kindOfTime);
    }
}
