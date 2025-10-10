public class Main {
    public static void main(String[] args){
        //valor absoluto de un int
        System.out.println(Math.abs(-15));
        //redondear numeros con coma para arriba.
        System.out.println(Math.ceil(10.0001));
        //redondea para abajo
        System.out.println(Math.floor(10.999));

        //devuelve el valor mas alto
        System.out.println(Math.max(15, 25));
        //devuelve el valor mas bajo
        System.out.println(Math.min(15, 25));

        //redondea a un numero con coma a su numero mas cercano.
        System.out.println(Math.round(15.5));

        //numero random entre 0 y 1
        double random = Math.random();
        System.out.println(random);

        //numero random entre 1 y 100
        System.out.println(random * 100);

        //si lo quiero transformar a entero:
        System.out.println((int)(random * 100));
    }
}