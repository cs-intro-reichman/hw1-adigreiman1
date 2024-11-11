public class Ascend {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        double a = Math.random() *lim ;
        double b = Math.random()* lim;
        double c = Math.random()* lim;

    double sum = a+b+c;
   double min= Math.min(a,b);
   double theMin= Math.min(min,c );

   double max = Math.max(a,b);
   double theMax = Math.max(max, c);

   
   double middleNum = sum - theMax - theMin;    
   System.out.println((int) theMax +","+(int) middleNum + ","+ (int)theMin );
}
}
