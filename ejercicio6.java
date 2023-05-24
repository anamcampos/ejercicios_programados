// Ejercicio 6= Multiplicaciones del 1 al 10
import java.util.Scanner;

public class Ejercicio5 {

	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int n = scanner.nextInt( );
		while(n<=0){
			System.out.println("Ingrese un número entero mayor a 0");
			 n = scanner.nextInt( );
		}
			for (int i=1;i<=10;i++){
				System.out.println("La multiplicacion de " + n + " por " + i + " es : "+ n * i);
				}
	}
}