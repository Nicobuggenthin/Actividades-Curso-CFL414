public class ejercicio5 {
    public static void main(String[] args) {
        String linea;
        System.out.print("Ingrese la base: ");
        linea=System.console().readLine();
        int primerNumero;
        primerNumero=Integer.parseInt(linea);
        System.out.print("Ingrese la altura: ");
        linea=System.console().readLine();
        int segundoNumero=Integer.parseInt(linea);
        double perimetro= (primerNumero*2)+ (segundoNumero*2);
        double area= primerNumero*segundoNumero;
        System.out.println("El valor del perimetro es: " + perimetro);
        System.out.println("El valor del area es: " + area);

    }
}
