public class ejercicio3 {
    public static void main(String[] args) {
        int pesosHora = 250;
        int pesosExtra = 300;
        int totalSalario;
        int horasExtra;
        System.out.print("Ponga la cantidad de horas trabajadas esta semana: ");
        int horasTrabajadas = Integer.parseInt(System.console().readLine());
        if (horasTrabajadas <= 40){
          totalSalario = horasTrabajadas*pesosHora;
          System.out.printf("El salario correspondiente a %d horas de trabajo, son %d pesos", horasTrabajadas, totalSalario);
        } 
        else if (horasTrabajadas > 40){
          horasExtra = horasTrabajadas - 40;
          totalSalario = 40*pesosHora + horasExtra*pesosExtra;
          System.out.printf("El salario correspondiente a %d horas de trabajo, son %d pesos", horasTrabajadas, totalSalario);

    }
    }
}
