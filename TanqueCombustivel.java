import java.util.Scanner;
public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float raio = scan.nextFloat();
		float altura = scan.nextFloat();
		float option = scan.nextFloat();
		if(option == 1) {
			double v = (Math.PI/3)*altura*altura*(3*raio-altura);
			System.out.printf("%.4f%n",v);
		}
		if(option == 2) {
			double vesfera = (4.0/3.0)*Math.PI*raio*raio*raio;
			double vcalota = (Math.PI/3)*altura*altura*(3*raio-altura);
			double vc = vesfera - vcalota;
			System.out.printf("%.4f%n",vc);
		}
		scan.close();
	 }
}
