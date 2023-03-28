public class ejercicio2 {
    public static void main(String[] args) { 
    System.out.print("Ingrese el numero del dia(del 1 al 7): ");
    int diaSemana = Integer.parseInt(System.console().readLine());
    switch (diaSemana){
        case 1:
          System.out.print("Domingo");
          break;
        case 2:
          System.out.print("Lunes");
          break;
        case 3:
          System.out.print("Martes");
          break;
        case 4:
          System.out.print("Miercoles");
          break;
        case 5:
          System.out.print("Jueves");
          break;
        case 6:
          System.out.print("Viernes");
          break;
        case 7:
          System.out.print("Sabado");
          break;
        default:
          System.out.print("Ese dia de la semana no existe, ingrese otro numero en un formato valido.");
        }
    }
}