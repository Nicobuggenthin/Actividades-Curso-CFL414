package paquetes;

public class Articulos {
    private int codigo;
    private String nombre;
    private int stock;
    private int costo;
    private boolean libre= false;

    public Articulos ( int codigo, String nombre, int stock, int costo, boolean libre){
        this.codigo=codigo;
        this.nombre= nombre;
        this.stock= stock;
        this.costo= costo;
        this.libre= libre;
    }

    public Articulos() {
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo( int codigo){
        this.codigo=codigo;
    }

    public int getStock(){
        return stock;
    }
    public void setStock( int stock){
        this.stock=stock;
    }


    public int getCosto(){
        return costo;
    }
    public void setCosto(int costo){
        this.costo=costo;
    }


    /*public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    } */


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }


    public boolean libre(){
        if ((getStock()>0)||(getStock()<101)){
            this.libre=true;
        }
        return libre;
    }
    public void setLibre(boolean libre){
        this.libre=libre;
    }


    //@Override
    public String toString(){
        return "Codigo: " + this.codigo + "\nNombre: "+ this.nombre + "\n Stock disponible: " + this.stock + "\n Precio por unidad: " + this.costo + "\n**************"; 
    }

    public static void verArray(Articulos[]articulos){
        for (Articulos a : articulos){
            System.out.println(a);
        }
    }


    public static void verCostoUnidad(Articulos[] articulos){
        System.out.println("Ingrese el codigo del articulo del que desea saber el precio ");
        int codigoIngresado = Integer.parseInt(System.console().readLine());
        int i = codigoIngresado -1;
            if (codigoIngresado == articulos[i].getCodigo()){
                System.out.println(articulos[i].getCosto());
            }
            }
        
        public static void cargarStock(Articulos[]articulos){
            System.out.println("Ingrese el codigo del articulo del que desea agregar mas stock");
            int codigoIngresado= Integer.parseInt(System.console().readLine());
            int i= codigoIngresado-1;

            if (codigoIngresado!= articulos[i].getCodigo()){
                System.out.println("El codigo ingresado no existe");
            }else{
                System.out.println(articulos[i]);
                System.out.println("Ingrese la cantidad de stock que desea agregar al inventario: ");
                int stockIngresado= Integer.parseInt(System.console().readLine());
                int stockTotal= stockIngresado + articulos[i].getStock();
                if (stockTotal>0 && stockTotal<=100){
                    articulos[i].setStock(stockIngresado + articulos[i].getStock());
                }else{
                    System.out.println("Supero el stock total del desposito, ingrese una cantidad menor");
                }
                }
        }


    public static void verPrecioTotalArticulos(Articulos[]articulos){
        System.out.println("Precio Total de todos los Articulos");
        int i;
        for(i=0; i<10; i++){
            System.out.println("Codigo: " + articulos[i].getCodigo() + "- "+ articulos[i].getNombre()+ "Precio total de los productos: "+ (articulos[i].getStock()*articulos[i].getCosto()));
            System.out.println("*************************");
        }
    }

    public static void verPrecioUniArticulo(Articulos[]articulos){
        System.out.println("Precio por Unidad de los Articulos");
        for (int i=0; i<10; i++){
            System.out.println("Codigo: "+ articulos[i].getCodigo()+ "- "+ articulos[i].getNombre()+" Precio por Unidad "+ articulos[i].getCosto());
            System.out.println("************************");
        }
        System.out.println("--------------------------");
    }
        
    }






