import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        //Codigo de Localidad por pais.
        Locale locale = Locale.forLanguageTag("es-AR");

        //Formato Dinero
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(1099.90);
        System.out.println(result);

        //Formato Porcentaje
        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));
    }
}