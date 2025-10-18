import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // REFACTORIZACION DEL EJERCICIO REALIZADO ANTERIORMENTE
        // REFACTORIZACION SIGNIFICA CAMBIAR EL CODIGO INTERNO
        // PERO QUE LA APLICACION SE COMPORTE IGUAL QUE ANTES.
        Scanner scanner = new Scanner(System.in);
        String input = "";

        terminal: while (true) {
            mostrarOpciones();
            input = scanner.next().toLowerCase();

            switch (input) {
                case "1":
                    int resultado = calculadora(scanner);
                    System.out.println("El resultado es:");
                    System.out.println(resultado);
                    break;
                case "2":
                    hackearNasa();
                    break;
                case "3":
                    System.out.println("Chao mundo");
                    break terminal;
                default:
                    System.out.println("Comando inválido");
            }
        }
    }

    private static int calculadora(Scanner scanner) {
        System.out.println("Ingrese un número:");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo número:");
        int b = scanner.nextInt();
        return a + b;
    }

    private static void hackearNasa() {
        System.out.println("Hackeando la nasa 😎");
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");
        System.out.println("Nasa hackeada, eres hackerman!");
    }

    private static void mostrarOpciones() {
        System.out.println("Ingresa una opción:");
        System.out.println("1. Calculadora");
        System.out.println("2. Hackear la nasa");
        System.out.println("3. Salir");
    }
}