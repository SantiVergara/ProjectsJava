public class PrimitivosFloat {
  public static void main(String[] args) {

    float realFloat = 0.00000000015F; // 1.5E-10;
    System.out.println("realFloat = " + realFloat);
    System.out.println("flat corresponde en byte a " + Float.BYTES);
    System.out.println("tipo flat corresponde en bits a " + Float.SIZE);
    System.out.println("valor máximo de un flat: " + Float.MAX_VALUE);
    System.out.println("valor mínimo de un flat: " + Float.MIN_VALUE);

    double realDouble = 3.4028235E39;
    System.out.println("realDouble = " + realDouble);
    System.out.println("Double corresponde en byte a " + Double.BYTES);
    System.out.println("tipo Double corresponde en bits a " + Double.SIZE);
    System.out.println("valor máximo de un Double: " + Double.MAX_VALUE);
    System.out.println("valor mínimo de un Double: " + Double.MIN_VALUE);

    var varFlotante = 3.1416;
    System.out.println("realDouble = " + varFlotante);

  }
}
