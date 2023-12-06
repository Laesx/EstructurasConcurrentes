package pojos;

import java.util.Queue;

public class Almacen {
    private Queue<Producto> productos;

    public Almacen(Queue<Producto> productos) {
        this.productos = productos;
    }

    public boolean addProducto(Producto producto){
        boolean added = false;
        int posicion = existe(productos, producto.getId());
        //Si no existe
        if(posicion == -1) {
            productos.add(producto);
            added = true;
        }

        return added;
    }

    public boolean deleteProducto(int id){
        boolean deleted = false;
        int posicion = existe(productos, id);
        //Si existe
        if(posicion != -1) {
            productos.remove(id);
            deleted = true;
        }

        return deleted;
    }

    public boolean modifyProducto(Producto producto){
        boolean modified = false;

        for(Producto indice: productos){
            if(indice.getId() == producto.getId()){
                indice.setNombre(producto.getNombre());
                indice.setDescripcion(producto.getDescripcion());
                modified = true;
                break;
            }
        }

        return modified;
    }

    public Queue<Producto> obtenerCatalogo(){
        return this.productos;
    }

    public void mostrarCatalogo(){
        for(Producto producto : productos){
            System.out.println(producto);
        }
    }



    public <T> int encontrarPosicion(Queue<Producto> cola, T elementoBuscar) {
        int posicion = 0;

        for (Producto elemento : cola) {
            if (elemento.equals(elementoBuscar)) {
                return posicion;
            }
            posicion++;
        }

        // Si el elemento no se encuentra, devolver -1
        return -1;
    }

    public static int existe(Queue<Producto> cola, int idElementoBuscar) {
        int posicion = 0;

        for (Producto producto : cola) {
            if (producto.getId() == idElementoBuscar) {
                return posicion;
            }
            posicion++;
        }

        // Si el elemento no se encuentra, devolver -1
        return -1;
    }
}
