public class ejercicio7 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de megabytes(MB) que quiere pasar a kilobytes(kB): ");
        double megabytes = Double.parseDouble(System.console().readLine());
        int kilobytes = (int) (megabytes * 1000.00);
        System.out.printf("%.2f megabytes(MB) son %d kilobytes(kB).", megabytes, kilobytes);
    }
}