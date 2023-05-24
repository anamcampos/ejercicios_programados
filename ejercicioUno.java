import java.util.Scanner;

public class ejercicioUno{

    public static void main(String [] args){
        Scanner input= new Scanner (System.in);

        System.out.println("Ingrese un número");
        int num = input.nextInt();

        if (num%2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

    }

}