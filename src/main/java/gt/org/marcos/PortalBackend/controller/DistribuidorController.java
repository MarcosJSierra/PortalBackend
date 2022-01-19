/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.controller;

import org.springframework.web.bind.annotation.*;
import gt.org.marcos.PortalBackend.model.Distribuidor;
import gt.org.marcos.PortalBackend.service.DistribuidorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

/**
 *
 * @author marcos
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/portal/distribuidor")
public class DistribuidorController {
    
    @Autowired
    private DistribuidorService distribuidorService;
    
    
    @GetMapping("")
    List<Distribuidor> getDistribuidorList(){
        return distribuidorService.getAllDistribuidores();
    }
    
    @GetMapping("/{id}")
    Distribuidor getDistribuidorById(@PathVariable Long id){
        return distribuidorService.getDistribuidorById(id);
    }
    
    @PostMapping(value = "")
    Distribuidor createDistribuidor(@RequestBody Distribuidor distribuidor){
        return distribuidorService.createDistribuidor(distribuidor);
    }
    
    @PutMapping(value = "")
    Distribuidor updateDistribuidor(@RequestBody Distribuidor distribuidor){
        return distribuidorService.updateDistribuidor(distribuidor);
    }
    
    @DeleteMapping("/{id}")
    void deleteDistribuidor(@PathVariable Long id){
        distribuidorService.deleteDistribuidor(id);
    }
}
