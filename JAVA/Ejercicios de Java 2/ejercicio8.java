public class ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de kilobytes(kB) que quiere pasar a megabytes(MB): ");
        int kilobytes = Integer.parseInt(System.console().readLine());
        double megabytes = kilobytes / 1000.00;
        System.out.printf("%d kilobytes(kB) son %.3f megabytes(MB).", kilobytes, megabytes);
    }
}
