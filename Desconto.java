import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double preco = scan.nextDouble();
		if(preco >= 200) {
			double preconovo = preco * 0.05;
			double precodes = preco - preconovo;
			System.out.printf("%.2f%n",precodes);
		}
		else {
			System.out.printf("%.2f%n",preco);
		}
		scan.close();
	 }
}
