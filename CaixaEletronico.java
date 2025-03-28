import java.util.Scanner;
public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>0 && n%2 == 0) {
			int a = n/50;
			System.out.printf(a + " notas de R$50, ");
			int b = n%50;
			int c = b/10;
			System.out.printf(c+ " notas de R$10 e ");
			int d = b%10;
			int e = d/2;
			System.out.printf(e+ " notas de R$2");
		}
		else {
			System.out.println("Valor Invalido");
		}
		scan.close();
	 }
	
}
