public class Main {
    public static void main(String[] args) {
        //De cada User, guardamos valores que correspondan a su propiedad "name"
        User user = new User();
        user.name = "Nicolas";

        User user2 = new User();
        user2.name = "Felipe";
        //imprimimos los dos user con sus propiedades.
        System.out.println(user.id);
        System.out.println(user2.id);
    }
}