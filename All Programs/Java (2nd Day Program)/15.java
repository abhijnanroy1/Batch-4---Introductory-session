import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        int a, b,c, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        a = sc.nextInt();
        
        System.out.println("Enter the second Number: ");
        b = sc.nextInt();
        
          System.out.println("Enter the  third Number: ");
        c = sc.nextInt();
        
        
        sc.close();
        sum = a + b + c;
        System.out.println("Sum "+sum);
    }
}


