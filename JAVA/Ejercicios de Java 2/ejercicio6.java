public class ejercicio6 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de horas trabajadas esta semana: ");
        int horasTrabajadas = Integer.parseInt(System.console().readLine());
        double salario = horasTrabajadas*250;
        System.out.printf("Tu salario de esta semana es de: %.2f pesos.", salario);
    }
}

