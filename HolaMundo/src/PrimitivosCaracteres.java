public class PrimitivosCaracteres {
  public static void main(String[] args) {
    char caracter = '\u0040';
    char decimal = 64;
    System.out.println("caracter = " + caracter);
    System.out.println("decimal = " + decimal);
    System.out.println("decimal = caracter : " + (decimal==caracter));

    char simbolo = '@';
    System.out.println("simbolo = " + simbolo);
    System.out.println("simbolo = caracter: " + (simbolo==caracter));

    System.out.println("char corresponde en byte a " + Character.BYTES);
    System.out.println("tipo char corresponde en bits a " + Character.SIZE);
    System.out.println("valor máximo de un char: " + Character.MAX_VALUE);
    System.out.println("valor mínimo de un char: " + Character.MIN_VALUE);



  }
}
