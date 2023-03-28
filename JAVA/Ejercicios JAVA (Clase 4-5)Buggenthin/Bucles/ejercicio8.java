
public class ejercicio8 {
    public static void main(String[] args){
        System.out.print("Introduzca el numero del que quiere ver la tabla de multiplicar: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
            
        for (int i = 0; i <= 10; i++) {
          System.out.printf("%d x %d = %d\n", numeroIntroducido, i, numeroIntroducido * i);
        }
    }
}