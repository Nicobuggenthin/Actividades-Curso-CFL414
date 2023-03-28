public class ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de dolares que quiere pasar a pesos: ");
        double dolares = Double.parseDouble(System.console().readLine());
        int pesos = (int) (dolares * 203.000);
        System.out.printf("%.2f dolares son %d pesos.", dolares, pesos);
      }
    }
