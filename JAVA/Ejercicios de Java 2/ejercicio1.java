import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.print("Ingrese los 2 numeros que desea multiplicar, separados por un espacio");
        double x1= S.nextDouble();
        double x2= S.nextDouble();
        double multiplicacion=(x1*x2);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
    }
}