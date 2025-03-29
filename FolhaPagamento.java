import java.util.Scanner;
public class FolhaPagamento {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double quanth = scan.nextDouble();
		int horast = scan.nextInt();
		double salbr = quanth * horast;
		double ir = 0.11 * salbr;
		double inss = 0.08 * salbr;
		double desc = ir + inss;
		double salliq = salbr - desc;
		System.out.printf("Salario Bruto: R$%.2f\n", salbr);
		System.out.printf("IR: R$%.2f\n", ir);
		System.out.printf("INSS: R$%.2f\n", inss);
		System.out.printf("Total de descontos: R$%.2f\n", desc);
		System.out.printf("Salario liquido: R$%.2f\n", salliq);
		scan.close();
	 }
}
