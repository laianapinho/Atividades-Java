import java.util.Scanner;

public class AsciiArt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int numero = scan.nextInt();
		for (int a = 0; a < numero; a++) { 
			for (int b = 0; b < numero-a; b++) { 
				System.out.print("*"); 
			}
			for (int c = 0; c < a * 2;c++) {
				System.out.print(" ");
			}
			for (int d = 0; d < numero-a; d++) { 
				System.out.print("*"); 
			}
		System.out.println();
		}
		scan.close();
	}
}
