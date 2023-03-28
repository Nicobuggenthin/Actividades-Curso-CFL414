public class ejercicio4 {
    public static void main(String[] args) {
        String linea;
        System.out.print("Ingrese un numero: ");
        linea=System.console().readLine();
        int primerNumero;
        primerNumero=Integer.parseInt(linea);
        System.out.print("Ingrese otro numero: ");
        linea=System.console().readLine();
        int segundoNumero=Integer.parseInt(linea);
        int suma=primerNumero + segundoNumero;
        int resta= primerNumero - segundoNumero;
        int multi= primerNumero * segundoNumero;
        double division= primerNumero/segundoNumero;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multi);
        System.out.println("El resultado de la division es: " + division);

    }
}