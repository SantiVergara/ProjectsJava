public class EjemploStringRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 4000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // <4000 21 ms
            //c += a + b + "\n"; // 38 ms
            sb.append(a).append(b).append("\n"); // 0 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicio));
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
