public class ejercicio6 {
    public static void main(String[] args) {
        int IVA= 21;
        int baseImponible= 30000;
        int precioTotal= ((baseImponible*IVA/100)+baseImponible);
            System.out.println("El precio sin IVA es de "  + baseImponible);
            System.out.println("El precio total con IVA incluido es de " + precioTotal);
    }
}
