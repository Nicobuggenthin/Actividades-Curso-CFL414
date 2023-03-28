public class ejercicio01 {
    public static void main(String[] args) {
    int[] numeros = new int[10];
    int i;
    
    System.out.println("Introduzca 10 números enteros.");
    System.out.println("Toque la tecla Enter después de poner cada número.");

    for (i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nLos números introducidos, al revés, son:");
    for (i = 9; i >= 0; i--) {
      System.out.println(numeros[i]);
        
        }
    }
}
