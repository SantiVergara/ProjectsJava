import javax.swing.*;

public class SistemasNumericos {
  public static void main(String[] args) {

    String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
    int numeroDecimal = 0;
    try {
      numeroDecimal = Integer.parseInt(numeroStr);
    }catch (NumberFormatException e){
      JOptionPane.showMessageDialog(null, "Error, ingrese un entero");
      main(args);
      System.exit(0);
    }

    System.out.println("numeroDecimal = " + numeroDecimal);

    String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
    System.out.println(resultadoBinario);

    int numeroBinario = 0b111110100; // con el 0b Java entiende que el entero es un Binario
    System.out.println("numeroBinario = " + numeroBinario);

    String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
    System.out.println(resultadoOctal);

    int numeroOctal = 0764; // el 0 al inicio determina que es un entero octal
    System.out.println("numeroOctal = " + numeroOctal);

    String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
    System.out.println(resultadoHex);

    int numeroHex = 0x1f4; // el 0x indica que es un entero hexadecimal
    System.out.println("numeroHex = " + numeroHex);

    String mensaje = resultadoBinario + "\n";
    mensaje += resultadoOctal + "\n";
    mensaje += resultadoHex;

    JOptionPane.showMessageDialog(null, mensaje);

  }
}
