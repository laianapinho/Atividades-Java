import java.util.Scanner;
public class AnimaisCedulas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n == 2){
			System.out.println("Tartaruga");
		}
		else if(n == 5) {
			System.out.println("Garça");
		}else if(n == 10) {
			System.out.println("Arara");
		}else if(n == 20) {
			System.out.println("Mico-leão-dourado");
		}else if(n == 50) {
			System.out.println("Onça-pintada");
		}else if(n == 100) {
			System.out.println("Garoupa");
		}else {
			System.out.println("erro");
		}
		scan.close();
	 }
}
