package tiendaonline;

/**
 * Esta clase se ejecutara y crea un almacen e intenta añadir varios productos de forma concurrente al mismo almacen
 */
public class AddProducto implements Runnable {

    //add producto al almacen
    private static Almacen almacen = new Almacen();

    //Metodo que añade el producto al almacen y se le pasa por parametro el almacen
    public void addProductoEnAlmacen (Almacen almacen) {
        //Genera id, nombre y precio de un producto de forma aleatoria
        Producto producto = new Producto(
                (int) (Math.random() * 100),
                "Producto " + (int) (Math.random() * 100),
                (int) (Math.random() * 100));

        almacen.addProducto(producto);
    }

    @Override
    public void run() {
        addProductoEnAlmacen(almacen);
    }

    public static void main(String[] args) {
        // Añade un numero aleatorio de productos al almacen
        for (int i = 0; i < (int) (Math.random() * 100); i++) {
            new Thread(new AddProducto()).start();
        }
    }
}
