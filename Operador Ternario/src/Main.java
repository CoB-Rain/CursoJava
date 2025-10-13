public class Main {
    public static void main(String[] args){
        int edad = 25;
        //operador ternario: sirve para simplificar codigo
        //te ahorras de construir consultas int amplias
        String mensaje = edad > 17 ? "Puede votar" : "No puede votar";

        /*
        if(edad > 17){
            mensaje = "Esta persona puede votar";
        } else {
            mensaje = "Esta persona no puede votar";
        }
        */

        System.out.println(mensaje);
    }
}