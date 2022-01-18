/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.controller;

import gt.org.marcos.PortalBackend.service.ProductoService;
import java.util.List;
import gt.org.marcos.PortalBackend.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author marcos
 */
@RestController
@CrossOrigin("http://localhost:8081")
@RequestMapping(value = "api/portal/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("")
    List<Producto> getProductosList(){
        return productoService.getAllProductos();
    }
    
    @GetMapping("/distribuidor/{distribuidorId}")
    List<Producto> getProductosListByDistribuidor(@PathVariable Long distribuidorId){
        return productoService.getProductosByDistribuidor(distribuidorId);
    }
    
    @GetMapping("/{id}")
    Producto getProductoById(@PathVariable Long id){
        return productoService.geteProductoById(id);
    }
    
    @PostMapping(value = "", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    Producto createProducto(Producto producto){
        return productoService.createProducto(producto);
    }
    
    @PutMapping(value = "", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    Producto updateProducto(Producto producto){
        return productoService.updateProducto(producto);
    }
    
    @DeleteMapping("/{id}")
    void deleteProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
    }
}
