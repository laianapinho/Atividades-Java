import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double d = a + b;
		double e = b + c;
		double f = a + c;
		if((d>c) && (e>a) && (f>b)) {
			double s = (a+b+c)/2;
			double g = s*(s-a)*(s-b)*(s-c);
			double area = Math.sqrt(g);
			System.out.printf("%.2f\n",area);
		}
		else {
			System.out.println("Triangulo invalido");
		}
		scan.close();
	}	
}
