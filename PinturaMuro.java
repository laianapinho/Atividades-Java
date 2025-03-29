import java.util.Scanner;
public class PinturaMuro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 12;
		int b = 3;
		double n = scan.nextDouble();
		double c = 12*3*n;
		double d = c+100;
		System.out.printf("%.1f%n",d);
		scan.close();
	}
}
