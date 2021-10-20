import java.util.Scanner;

public class DetalleFactura {
  public static void main(String[] args) {

    String productDesc = " ";
    int cantidad = 0;

    var scanner = new Scanner(System.in);
    System.out.println("Ingrese descripción del producto ");
    try {
      productDesc = scanner.nextLine();

      System.out.println("Ingrese cantidad del producto ");
      cantidad = scanner.nextInt();
    }catch (Exception e){
      System.out.println("Ingrese un valor correcto");
      main(args);
      System.exit(0);
    }

    String resumen = "Producto: " + productDesc + "\nCantidad: " + cantidad;

    boolean aggNewProduct;
    try {
      System.out.println("¿Desea agregar otro Producto? (1 = Si ó 0 = No)");
      aggNewProduct = scanner.nextBoolean();
      if (aggNewProduct == true){
        resumen += resumen;
      }
    }catch (Exception e){
      System.out.println("Error al agregar nuevo Producto");
    }

    System.out.println("resumen = " + resumen);

  }
}
