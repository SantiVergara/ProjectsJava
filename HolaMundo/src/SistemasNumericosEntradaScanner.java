import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un número entero");
    //String numeroStr = scanner.nextLine();
    int numeroDecimal = 0;
    try {
      numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
    }catch (Exception e){
      System.out.println("Error !");
      main(args);
      System.exit(0);
    }

    String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
    String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
    String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

    String mensaje = resultadoBinario + "\n";
    mensaje += resultadoOctal + "\n";
    mensaje += resultadoHex;

    System.out.println("Resultado: \n" + mensaje);

  }
}
