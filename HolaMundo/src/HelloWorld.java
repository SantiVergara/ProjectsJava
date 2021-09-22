public class HelloWorld {
    public static void main(String[] args) {
        // Comentario de una línea
        /*
        Este es un comentario
        de varias líneas.
         */
        String name = "Santiago";
        System.out.println("Hola Mundo en Java By: " + name.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if (valor){
            System.out.println("numero = " + numero);
            numero = 10;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = 15;

        String nombre;

        nombre = "Santiago";

        if (numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
    }
}
