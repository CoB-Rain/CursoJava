class User {
    double id = Math.random(); //le damos un valor inicial a cada id (aleatorio)
    String name; //propiedad de la clase User

    //metodo saludar de mi clase User.
    //con la palabra reservada "this" hacemos referencia a la clase principal.
    public void saludar() {
        System.out.println("Hola mundo! soy " + this.name);
    }
}