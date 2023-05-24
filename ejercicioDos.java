// Ejercicio 2= pasar de Celsius a Fahrenheit
import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el grado en Celsius");
		double C = scanner.nextInt();
		double F = (C * 9 / 5 ) + 32;
		System.out.println("Los grados en Fahrenheit son : "+ F);
	}
}