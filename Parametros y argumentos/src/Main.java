public class Main {
    public static void main(String[] args) {
        //argumentos que los parametros esperan
        miMetodo("Nicolas", 25);
        miMetodo("Chanchito feliz", 30);
    }

    //parametros -> nombre, edad
    static void miMetodo(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tu edad es: " + edad);
    }
}