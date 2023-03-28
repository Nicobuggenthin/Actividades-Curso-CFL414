import paquetes.Menus;
import paquetes.Articulos;

public class Deposito {
    public static void main(String[] args) {
        Articulos[]articulos= new Articulos[10];

        for (int i=0; i<10; i++){
            articulos[i]= new Articulos();
        }

        articulos[0]= new Articulos(1, "Gabinete", 0 , 5000, false );
        articulos[1]= new Articulos(2,"Memoria RAM", 0, 2500, false);
        articulos[2]= new Articulos(3,"Fuente de Alimentacion", 0, 7000, false);
        articulos[3]= new Articulos(4, "Microposesadores", 0, 15000,false);
        articulos[4]= new Articulos(5, "Discos Rigidos",0,6000,false);
        articulos[5]= new Articulos(6, "Placa Madre",0,10000,false);
        articulos[6]= new Articulos(7, "Mouses",0,3000,false);
        articulos[7]= new Articulos(8,"Teclados",0,3500,false);
        articulos[8]= new Articulos(9,"Parlantes",0,1000,false);
        articulos[9]= new Articulos(10,"Microfonos",0,1250,false);

        boolean salir= false;

        do{
            paquetes.Menus.menuPrincipal();
            int opcion=Integer.parseInt(System.console().readLine());

            switch (opcion){
                case 1:
                Articulos.verArray(articulos);
                break;

                case 2:
                Articulos.cargarStock(articulos);
                break;

                case 3:
                Articulos.verPrecioUniArticulo(articulos);
                break;

                case 4:
                Articulos.verPrecioTotalArticulos(articulos);
                break;

                case 5:
                Articulos.cargarStock(articulos);
                Articulos.verArray(articulos);

                case 7:
                salir= true;
            }
    }while(salir= true);
    
}
}
