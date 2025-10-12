public class Main {
    public static void main (String[] args){
        boolean a = true, b = false;

        //operador lógico OR
        boolean c = a || b;

        //operador lógico AND
        boolean d = a && b;

        System.out.println(c);
        System.out.println(d);

        //operador lógico NOT
        boolean x = !a;

        System.out.println(x);
        //-------------------------
        //Ejercicio:

        boolean isAdult = true;
        boolean isActive = false;
        boolean isPremium = true;
        boolean isOn = true;

        String coupon = "chanchito_feliz";

        boolean promo = coupon.equals("ultimate_java") || coupon.equals("chanchito_feliz");
        boolean hasFunds = true;

        boolean canPurchase = isAdult && isActive && hasFunds;
    }
}