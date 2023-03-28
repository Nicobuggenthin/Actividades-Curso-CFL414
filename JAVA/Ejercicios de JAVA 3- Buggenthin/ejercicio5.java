public class ejercicio5 {
    public static void main(String[] args) {
        String boletin = " ";

        System.out.print("Introducir la primera nota: ");
        double nota1 = Double.parseDouble(System.console().readLine());
    
        System.out.print("Introducir la segunda nota: ");
        double nota2 = Double.parseDouble(System.console().readLine());
    
        System.out.print("Introducir la tercera nota: ");
        double nota3 = Double.parseDouble(System.console().readLine());
    
        double promedio = (nota1+nota2+nota3)/3;

    if (promedio < 5){
        boletin = "insuficiente";
      } else if (promedio < 6){
        boletin = "suficiente";
      } else if (promedio < 7){
        boletin = "bien";
      } else if (promedio < 8){
        boletin = "notable";
      } else if (promedio <= 9){
        boletin = "sobresaliente";
      }
      System.out.printf("La media de %.2f, %.2f y %.2f = %.2f", nota1, nota2, nota3, promedio);
      System.out.printf("\n Su nota en el boletín es: %s.", boletin);
    }
}
