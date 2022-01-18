/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.service;

import gt.org.marcos.PortalBackend.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */

public interface ProductoService {
    
    public Producto geteProductoById(Long productoId);
    
    public ArrayList<Producto> getAllProductos();
    
    public Producto createProducto(Producto producto);
    
    public Producto updateProducto(Producto producto);
    
    public void deleteProducto(Long id);
    
    public ArrayList<Producto> getProductosByDistribuidor(Long distribuidorId);
   
}
