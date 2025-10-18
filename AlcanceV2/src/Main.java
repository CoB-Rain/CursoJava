public class Main {
    public static void main(String[] args) {
        int r = suma(1,2);
        int c = 25;

        System.out.println(r);
    }

    static int suma(int a, int b) {
        //System.out.println(c); NO SE PUEDE ACCEDER A "c" DESDE SUMA! NO ESTA DENTRO DEL METODO MAIN!
        //TAMPOCO SE PUEDE ACCEDER A "r"
        return a + b;
    }

    //NUNCA HACER REFERENCIAS CIRCULARES!! PROHIBIDO
}