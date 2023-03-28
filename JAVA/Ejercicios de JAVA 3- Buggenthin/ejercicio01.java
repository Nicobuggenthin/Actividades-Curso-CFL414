public class ejercicio01 {
    public static void main(String[] args) {
    System.out.print("Por favor, introduce la hora actual (solo hora, sin minutos): ");
    int hora = Integer.parseInt(System.console().readLine());
    if ((hora >= 6)&&(hora <= 12)){
      System.out.print("Buenos días.");
    } 
    else if ((hora >= 13)&&(hora <= 20)){
      System.out.print("Buenas tardes.");
    } 
    else if ((hora >= 21)&&(hora <= 23)){
      System.out.print("Buenas noches.");
    }  
    else if ((hora >= 0)&&(hora <= 5)){
        System.out.print("Buenas noches.");
      }  
    }
}