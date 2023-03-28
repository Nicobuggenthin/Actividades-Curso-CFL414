public class ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de pesos que quiere pasar a dolares: ");
        int pesos = Integer.parseInt(System.console().readLine());
        double dolares = pesos / 203.000;
        System.out.printf("%d pesos son %.2f dolares.", pesos, dolares);
    }
  }