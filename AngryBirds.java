import java.util.Scanner;

public class AngryBirds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double vo = scan.nextDouble();
		double ang = scan.nextDouble();
		double distancia = scan.nextDouble();
		double radians = Math.toRadians(ang);
		double b = Math.sin(2*radians);
		double raio = (vo*vo * b)/9.8;
		double c = Math.abs(raio - distancia);
		if(c <= 0.1) {
			 System.out.println("1");
		}
		else {
			 System.out.println("0");
		}
		scan.close();
	 }
}

