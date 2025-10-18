public class Main {
    public static void main(String[] args) {
        //Method overloading significa definir un mismo metodo multiples veces con diferente firma
        //depende de la firma del metodo es el que se ejecutará
        //la firma son la CANTIDAD Y TIPO de parametros que un metodo espera.
        int resultado = suma(12, 25, 45);
        int resultado2 = suma(1,2);
        System.out.println(resultado);
        System.out.println(resultado2);

        String texto = suma();
        System.out.println(texto);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    //metodo overloading.
    static int suma(int a, int b, int c) {
        return a + b + c;
    }

    //segundo metodo overloading
    static String suma() {
        return "Hola mundo";
    }
}