public class EjemploStringMetodos {
  public static void main(String[] args) {

    String nombre = "Santiago";

    System.out.println("nombre.length() = " + nombre.length());
    System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
    System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
    System.out.println("nombre.equals(\"Santiago\") = " + nombre.equals("Santiago"));
    System.out.println("nombre.equals(\"Santiago\") = " + nombre.equals("santiago"));
    System.out.println("nombre.equals(\"Santiago\") = " + nombre.equalsIgnoreCase("santiago"));
    System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Santiago"));
    System.out.println("nombre.equals(\"Santiago\") = " + nombre.compareTo("Andres"));
    System.out.println("nombre.equals(\"Santiago\") = " + nombre.charAt(0));
    System.out.println("nombre.equals(\"Santiago\") = " + nombre.charAt(1));
    System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

    System.out.println("nombre.substring(6) = " + nombre.substring(6));
    System.out.println("nombre.substring(6) = " + nombre.substring(1, 4));
    System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

  }
}
