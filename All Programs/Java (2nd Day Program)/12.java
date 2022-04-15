public class Main{
    static int f1(int a , int b)
    {
        return a+b;
    }
     static double f1(double a , double b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        int x=f1(2,3);
        double y=f1(2.1,3.1);
        
        System.out.println(x); 
        System.out.println(y); 
    }
}
