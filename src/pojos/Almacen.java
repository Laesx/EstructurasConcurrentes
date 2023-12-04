package pojos;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    List<Producto> productos;

    public Almacen(){
        productos = new ArrayList<>();
    }

    public Almacen(Almacen almacen){
        for (int i = 0; i < almacen.productos.size(); i++){
            this.addProducto(almacen.productos.get(i));
        }
    }
    public boolean addProducto(Producto producto){
        boolean added = false;

        if(!existe(producto.getId())) {
            productos.add(producto);
            added = true;
        }

        return added;
    }

    public boolean deleteProducto(int id){
        boolean deleted = false;

        if(existe(id)) {
            productos.remove(id);
            deleted = true;
        }

        return deleted;
    }

    public boolean modifyProducto(Producto producto){
        boolean modified = false;

        if(existe(producto.getId())){
            productos.get(producto.getId()).setDescripcion(producto.getDescripcion());
            productos.get(producto.getId()).setNombre(producto.getNombre());
            modified = true;
        }

        return modified;
    }

    public List<Producto> obtenerCatalogo(){
        return this.productos;
    }

    public void mostrarCatalogo(){
        for(Producto producto : productos){
            System.out.println(producto);
        }
    }

    private boolean existe(int id){
        boolean existe = false;

        for (int i = 0; i < this.productos.size() && !existe; i++)
            if(id == productos.get(i).getId())
                existe = true;

        return existe;
    }
}
