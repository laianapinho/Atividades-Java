import java.util.Scanner;
public class DataExtenso{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int datas = scan.nextInt();
		int ano = datas % 10000;
		System.out.printf(ano +  " notas de R$50, ");
		int mes = (datas / 10000) % 100;
		System.out.printf(mes +  " notas de R$50, ");
		int dia = datas / 1000000;
		System.out.printf(dia +  " notas de R$50, ");
		scan.close();
	 }
	
}

