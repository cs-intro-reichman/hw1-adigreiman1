public class Ascend {

    public static void main(String[] args) {
    double a = Math.random() * 100;
    double b = Math.random()* 100;
    double c = Math.random()* 100;

    double sum = a+b+c;
   double min= Math.min(a,b);
   double theMin= Math.min(min,c );

   double max = Math.max(a,b);
   double theMax = Math.max(max, c);

   
   double middleNum = sum - theMax - theMin;    
   System.out.println((int) theMax +","+(int) middleNum + ","+ (int)theMin );
}
}
