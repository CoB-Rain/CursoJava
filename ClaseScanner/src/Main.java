import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //cada palabra que le asignes a "valor" sera tomada como un Token
        //Ej: si a valor le asignamos "Hola Mundo", lo que hace el metodo next es tomar el primer token "Hola"
        //String valor1 = scanner.next();
        //System.out.println(valor1);

        //con el metodo nextLine lee toda la primera linea que se escribió como Token
        //String valor2 = scanner.nextLine();
        //System.out.println(valor2);

        //Y si lo quiero hacer con byte
        System.out.println("Ingresa tu edad:");
        byte valor3 = scanner.nextByte();
        System.out.println("Tu edad es: ");
        System.out.println(valor3);
    }
}