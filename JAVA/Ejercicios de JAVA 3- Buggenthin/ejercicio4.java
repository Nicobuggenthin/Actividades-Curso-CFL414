public class ejercicio4 {
    public static void main(String[] args) {
    System.out.print("Introducir la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Introducir la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());

    System.out.print("Introducir la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double promedio = (nota1+nota2+nota3)/3;
    System.out.printf("La media de %.2f, %.2f y %.2f = %.2f", nota1, nota2, nota3, promedio);

    }
}
