import java.awt.*;

public class Main {
    public static void main(String[] args){
        //variables primitivas
        int a = 15, b = a;
        b = 33;
        System.out.println(a);

        //variables por referencia
        Point point1 = new Point();
        Point point2 = point1;
        point2.x = 15;
        System.out.println(point1);

        /**
         * variables por referencia de tipo inmutables:
         * cada vez que nosotros realicemos una operación sobre este
         * nos va a devolver una nueva instancia del objeto.
         */
        String c = new String("Hola Mundo");
        String d = c;
        String e = c.toUpperCase();
        System.out.println(c);
        System.out.println(e);
    }
}