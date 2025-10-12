public class Main {
    public static void main(String[] args){
        // para acceder a una variable debe estar
        // en el mismo bloque de codigo de donde se quiere acceder.
        // a esto se lo llama Alcance.

        String mensaje = "Seco para programar";

        /**
         *         if(true){
         *             String texto = "Hola Mundo";
         *             System.out.println(texto);
         *             if (true){
         *                 System.out.println(texto);
         *             }
         *         }
         *
         *         la variable "texto" esta fuera del alcance de la aplicacion.
         *         por eso no se puede mostrar en pantalla.
         *         👇
         *         System.out.println(texto); <-- ERROR!
         */

        if(true){
            mensaje = "Hola Mundo";
        }
        System.out.println(mensaje);
        System.out.println("fin de aplicación.");
    }
}