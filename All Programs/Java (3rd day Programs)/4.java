import java.util.*;
class Bill {
    public static int Bill(int a)
    {
        if (a <= 100) {
            return a * 5;
        }
        else if (a <= 200) {
            return (100 * 10)
                + (a - 100)
                      * 10;
        }
        else if (a <= 300) {
            return (100 * 10)
                + (100 * 15)
                + (a - 200)
                      * 20;
        }
     else if (a > 300) {
            return (100 * 10)
                + (100 * 15)
                + (100 * 20)
                + (a - 300)
                      * 25;
        }
        return 0;
    }
    public static void main(String args[])
    {
        int a = 160;
        System.out.println(Bill(a));
    }
}

