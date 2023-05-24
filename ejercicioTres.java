// Ejercicio 3= Perimetro y área de un círculo
import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el radio del cículo para calcular el perímetro y área");
		double r = scanner.nextInt();
		while (r<=0){
			System.out.println("Ingrese el radio mayor a 0");
		 r = scanner.nextInt();
		}
		double p = 2 * 3.14 * r;
		double a = 3.14 * (r * r);
		System.out.println("El perímetro es : "+ p);
		System.out.println("El área es : "+ a);
	}
}