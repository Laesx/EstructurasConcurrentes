package tiendaonline;

import pojos.Almacen;
import pojos.Producto;


/**
 * Clase que añade un numero aleatorio de productos al almacen de forma concurrente
 */
public class AddProducto implements Runnable {

    private static Almacen almacen = null;

    /** Constructor de la clase
     * @param almacen Almacen al que se le añadira el producto
     */
    public AddProducto(Almacen almacen) {
        this.almacen = almacen;
    }

    /** Metodo que añade un producto al almacen
     * @param almacen Almacen al que se le añadira el producto
     * @return true si se ha añadido correctamente, false si no se ha podido añadir
     */
    public boolean addProductoEnAlmacen (Almacen almacen) {
        //Genera id, nombre y precio de un producto de forma aleatoria
        Producto producto = new Producto(
                (int) (Math.random() * 100),
                "Producto " + (int) (Math.random() * 100),
                "Descripcion " + (int) (Math.random() * 100));

        return almacen.addProducto(producto);
    }

    @Override
    public void run() {
        boolean check = addProductoEnAlmacen(almacen);
        if(check){
            System.out.println("Producto añadido correctamente");
        } else {
            System.out.println("No se ha podido añadir el producto");
        }
    }

}
