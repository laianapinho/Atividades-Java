import java.util.Scanner;
public class ArteAscii {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int numero = scan.nextInt();
		 for (int a = 0; a < numero ; a++) {
			  for (int b = a; b < numero; b++) {
				 System.out.print("*"); 
			 }
			 System.out.println(); 
			 }
		 for (int i = 1; i <= numero; i++) {
			  for (int j = numero - i; j >= 1; j--) {//imprime espaços
				 System.out.print(""); 
			 }
			 for (int j = 1; j <= i; j++) { //imprime *
				 System.out.print("*"); 
			 }
			 System.out.println(); 
			 }
		 
		 scan.close();
	    }
}