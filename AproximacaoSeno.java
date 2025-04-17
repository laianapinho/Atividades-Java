import java.util.Scanner;

public class AproximacaoSeno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double angulo = scan.nextDouble();
		int k = scan.nextInt();
		double radians = Math.toRadians(angulo);
		double seno = 0;
		for (int i=0; i < k; i++) {
			double numerador =  (Math.pow(radians, 2*i+1));
			double fatorial = 1;
			for (int j = 1; j <= (2 * i + 1); j++) {
			    fatorial *= j;
			}
			double denominador = fatorial ; 
			double result = (numerador)/(denominador) * (Math.pow(-1, i));
			seno += result;
			System.out.printf("%.10f\n",seno);
		}
		scan.close();
	}
}
