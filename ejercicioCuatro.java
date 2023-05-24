// Ejercicio 4= Suma, resta, multiplicación y división
import java.util.Scanner;

public class Ejercicio4 {

	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese dos números enteros");
		int n1 = scanner.nextInt();
		while (n1<=0){
			System.out.println("Ingrese un numero entero mayor a 0");
			 n1 = scanner.nextInt();
		}
		int n2 = scanner.nextInt();
		while (n2<=0){
			System.out.println("Ingrese un numero entero mayor a 0");
			n2 = scanner.nextInt();
		}
		int s = n1 + n2;
		int r = n1 - n2;
		int m = n1 * n2;
		int d = n1 / n2;
		System.out.println("La suma es : "+ s);
		System.out.println("La resta es : "+ r);
		System.out.println("La multiplicación es : "+ m);
		System.out.println("La división es : "+ d);
	}
}
