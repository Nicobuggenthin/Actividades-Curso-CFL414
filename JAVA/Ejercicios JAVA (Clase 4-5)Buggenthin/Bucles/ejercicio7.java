
public class ejercicio7 {
    public static void main(String[] args) {
        int intentos=4;
        int contraseña;
        boolean correcto = false;
        do{
            System.out.println("Ingrese la contraseña de su cuenta");
            contraseña=Integer.parseInt(System.console().readLine());
            if(contraseña == 1111){
                correcto = true;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
            }
            intentos--;
            }while((intentos>0)&&(!correcto));
            if(correcto){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }else{
                System.out.println("Lo siento, ha fallado mas de 3 veces, intente mas tarde");
            }
    }
}