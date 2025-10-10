import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /**
         * Crear una calculadora que reciba
         * 2 numeros y luego imprima el resultado de la
         * suma de estos dos numeros
         */
        System.out.println("Esta es una aplicación de calculadora");
        Scanner scanner = new Scanner(System.in);

        int a=0, b=0;
        System.out.println("Ingrese el primer número a sumar:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número a sumar:");
        b = scanner.nextInt();
        int r = a + b;
        System.out.println("El resultado de la suma es de: ");
        System.out.println(r);
    }
}