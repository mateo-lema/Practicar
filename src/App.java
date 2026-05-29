
import models.Producto;
import controllers.ProductoController;

public class App {

    public static void main(String[] args) throws Exception {
        ProductoController productoController=new ProductoController();
        Producto[] productos=makeProductosList();
        System.out.println("---BUBBLE SORT NAME---");
        productoController.SortByNameBubbleSort(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }

        System.out.println("---INSERTION NAME---");
        productoController.SortByNameInsertion(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }

        System.out.println("---SELECTION NAME---");
        productoController.SortByNameSelection(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }

        System.out.println("---SHELL NAME---");
        productoController.SortByNameShell(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }

        System.out.println("---BUBBLE PRICE---");
        productoController.SortByPriceBubble(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }

        System.out.println("---INSERTION PRICE---");
        productoController.SortByPriceInsertion(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }
        System.out.println("---SELECTION PRICE---");
        productoController.SortByPriceSelection(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }

        System.out.println("---SHELL PRICE---");
        productoController.SortByPriceShell(productos);
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }


    }


    public static Producto[] makeProductosList() {
    Producto[] productos = new Producto[15];

    productos[0] = new Producto("Laptop", 850.50);
    productos[1] = new Producto("mouse", 12.75);
    productos[2] = new Producto("TECLADO", 25.40);
    productos[3] = new Producto("Monitor", 180.99);
    productos[4] = new Producto("impresora", 210.00);
    productos[5] = new Producto("USB", 8.50);
    productos[6] = new Producto("Audifonos", 35.99);
    productos[7] = new Producto("camara", 65.25);
    productos[8] = new Producto("MICROFONO", 42.10);
    productos[9] = new Producto("Parlantes", 55.00);
    productos[10] = new Producto("Tablet", 300.75);
    productos[11] = new Producto("cargador", 18.90);
    productos[12] = new Producto("Router", 45.60);
    productos[13] = new Producto("DISCO DURO", 95.30);
    productos[14] = new Producto("Webcam", 70.00);

    return productos;
}
}