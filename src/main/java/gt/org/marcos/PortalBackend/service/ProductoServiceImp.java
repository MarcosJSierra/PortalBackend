/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.service;

import gt.org.marcos.PortalBackend.model.Producto;
import gt.org.marcos.PortalBackend.repository.ProductoRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author marcos
 */
@Service
public class ProductoServiceImp implements ProductoService{

    @Autowired
    public ProductoRepository productoRepo;
    
    
    @Override
    @Transactional(readOnly = true)
    public Producto geteProductoById(Long productoId) {
        return productoRepo.findById(productoId).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Producto> getAllProductos() {
        return (ArrayList<Producto>) productoRepo.findAll();
    }

    @Override
    @Transactional
    public Producto createProducto(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    @Transactional
    public Producto updateProducto(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    @Transactional
    public void deleteProducto(Long id) {
        Producto producto = productoRepo.findById(id).orElse(null);
        if(producto != null){
            productoRepo.delete(producto);
        }
        
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Producto> getProductosByDistribuidor(Long distribuidorId) {
        return productoRepo.queryByDistribuidorId(distribuidorId);
    }
    
}
