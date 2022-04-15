import java.util.Scanner;

public class Abhi {
	public static void main(String[] args) {
		int Num, Rem, Rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the number : ");
		Num = sc.nextInt();
		while(Num > 0) {
			Rem = Num %10;
			Rev = Rev * 10 + Rem;
			Num = Num /10;
		}
		System.out.format("\n Reverse of entered number is = %d\n", Rev);
	}
}
