import java.util.Scanner;
class Abhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , s=0;
        for (i = 1 ; i<= 10 ; i++){
            i=sc.nextInt();
            s+=i;
        }
        double d = Math.sqrt(s);
        System.out.println(d);
    }
}
