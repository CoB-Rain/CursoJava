import java.util.Arrays;

void main() {
    //con "sout" o con "IO" + tab, podes escribir en consola.
    IO.println("Hello world!");

    String text = "Hola Mundo!";

    int totalCaracteres = text.length();
    IO.println(totalCaracteres);

    String texto = text.replace("Hola","Chao");
    System.out.println(texto);

    System.out.println(texto.endsWith("undo"));
    System.out.println(texto.startsWith("Ch"));
    System.out.println(texto.contains("und"));
    System.out.println(texto.indexOf("Mund"));

    System.out.println(texto.toUpperCase());
    System.out.println(texto.toLowerCase());

    String malo = "    chanchito feliz    ";
    //trim sirve para corregir "strings malos"
    System.out.println(malo.trim());
    System.out.println(malo);

    //caracteres de escape
    String t1 = "C:\\Hola \"Mundo\">";
    String t2 = "Hola \nMundo";
    String t3 = "Hola \tMundo";
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);

    //int[] numeros = new int[5];
    int[] numeros = {0, 1, 2, 3, 4};
    numeros[0] = 5;
    numeros[4] = 7;

    System.out.println(Arrays.toString(numeros));
    System.out.println(numeros.length);
    Arrays.sort(numeros);
    System.out.println(Arrays.toString(numeros));

    //arrays de arrays.

    //int[][] numerosV2 = {{0, 1}, {2, 3}};
    int[][] numerosV2 = new int[3][2];
    numerosV2[0][0] = 5;
    System.out.println(Arrays.deepToString(numerosV2));

    int[][][] numerosV3 = new int[3][2][2];
    numerosV3[0][0][0] = 5;
    System.out.println(Arrays.deepToString(numerosV3));

    //constantes
    //Estp es un comentario de una línea

    /* Escribir todos
     * los comentarios
     * que nosotros queramos*/

    final String empresa = "Hola Mundo Limited";
    //empresa = "Chanchito feliz";
    System.out.println(empresa);

    //operadores aritmeticos
    int a = 2 + 2;
    int b = 2 - 2;
    int c = 3 * 3;
    int m = 4 % 3;
    float d = 10f / 3f;
    double d2 = 10.0 / 3.0;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(m);
    System.out.println(d2);

    int x = 5;
    int y = x++;
    x = x + 5;
    x += 5;
    System.out.println(x);
    System.out.println(y);

    //orden de las operaciones
    /**
     * parentesis
     * potencias
     * multiplicacion
     * division
     * suma
     * resta
     */

    int r = 5 + 3 * 2;
    System.out.println(r);

    /**
     * nomenclatura PEMDAS
     * P = PARENTHESIS
     * E = EXPONENTIAL
     * M = MULTIPLICATION
     * D = DIVISION
     * A = ADD
     * S = SUBSTRACTION
     */

    //forzamos cambiar el orden de ejecución con los parentesis
    r = (5 + 3) * 2;
    System.out.println(r);

    //conversion de tipos de datos

    //esto es una conversion implicita de datos numericos
    byte a1 = 1;
    int b1 = 15;
    int c1 = a1 + b1;
    System.out.println(c1);

    double d1 = 15.15;
    double e1 = a1 + d1;
    System.out.println(e1);
    //orden de tipo de dato numerico del de menos peso al mas peso.
    //byte -> short -> int -> long -> float -> double

    //conversion explicita de datos numericos
    int x1 = 15;
    double y1 = 15.015;
    //int z1 = (int) (x1 + y1);
    int z1 = x1 + (int) y1;
    System.out.println(z1);

    //conversion explicita de datos tipo caracter a numerico.
    String j1 = "1.1";
    int k1 = 5;
    double l1 = Double.parseDouble(j1) + k1;
    System.out.println(l1);

}