import java.util.ArrayList;
import java.util.Scanner;

public class AreaPoligono {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		String[] numeros = entrada.split(" ");
		ArrayList<Double> x = new ArrayList<>();
		ArrayList<Double> y = new ArrayList<>();
		int i = 0;
		while (!numeros[i].equals("-1")) {
			x.add(Double.parseDouble(numeros[i]));
			i++;
		}
		i++;
		while (!numeros[i].equals("-1")) {
			y.add(Double.parseDouble(numeros[i]));
			i++;
		}
		int n = y.size();
		double soma = 0;
		for (int a = 0; a<n; a++) {
			int proximo = (a + 1) % n;
			soma += (x.get(a) *y.get(proximo))-(x.get(proximo) * y.get(a));
		}
		double mult = soma*0.5;
		double multAbs = Math.abs(mult);
		System.out.printf("%.4f\n",multAbs);
	    scanner.close();
	}    
}
