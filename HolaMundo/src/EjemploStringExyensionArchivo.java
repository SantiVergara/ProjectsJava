public class EjemploStringExyensionArchivo {
  public static void main(String[] args) {
    
    String archivo = "alguna.imagen.pdf";
    System.out.println("archivo.length() = " + archivo.length());
    System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-2));
    System.out.println("archivo.indexOf('.') = " + archivo.substring(archivo.lastIndexOf('.')+1));

    
  }
}
