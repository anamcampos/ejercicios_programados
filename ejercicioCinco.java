// Ejercicio 5= Factorial de un número
import java.util.Scanner;

public class ejercicioCinco {

	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int n = scanner.nextInt();

		while (n<=0){
			System.out.println("Ingrese un número positivo");
			n = scanner.nextInt();
		}
		int n2 = n;
		int f = 0;
			for (int i=1;i<=n;i++){
				f = n2 * i;
				System.out.println("El factorial del número es: " + f);
				n2 = n2 - 1;
				}
	}
}
