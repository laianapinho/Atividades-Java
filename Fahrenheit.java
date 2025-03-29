import java.util.HashMap;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Fahrenheit {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float tempcelsius = scan.nextFloat();
    double fahrenheit = ((9*tempcelsius)/5) + 32;         
    BigDecimal bd = new BigDecimal(fahrenheit).setScale(1, RoundingMode.HALF_UP);
    System.out.println(bd);
    scan.close();
    }
}

