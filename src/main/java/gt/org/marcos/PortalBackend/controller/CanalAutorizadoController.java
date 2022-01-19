/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.controller;

import gt.org.marcos.PortalBackend.service.CanalAutorizadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.org.marcos.PortalBackend.model.CanalAutorizado;
import org.springframework.http.MediaType;

/**
 *
 * @author marcos
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/portal/canalautorizado")
public class CanalAutorizadoController {
    
    @Autowired
    private CanalAutorizadoService canalAutService;
    
    @GetMapping("")
    List<CanalAutorizado> getCanalAutorizadoList(){
        return canalAutService.getAllCanalAutroizado();
    }
    
    @GetMapping("/distribuidor/{distribuidorId}")
    List<CanalAutorizado> getCanalAutorizadoByDistribuidor(@PathVariable Long distribuidorId){
        return canalAutService.getCanalAutorizadoByDistribuidor(distribuidorId);
    }
    
    @GetMapping("/{id}")
    CanalAutorizado getCanalAutorizadoById(@PathVariable Long id){
        return canalAutService.getCanalAutorizadoById(id);
    }
    
    @PostMapping(value = "")
    CanalAutorizado createCanalAutorizado( @RequestBody CanalAutorizado canal){
        return canalAutService.createCanalAutorizado(canal);
    }
    
    @PutMapping(value = "")
    CanalAutorizado updateCanalAutorizado(@RequestBody CanalAutorizado canal){
        return canalAutService.updateCanalAutorizado(canal);
    }
    
    @DeleteMapping("/{id}")
    void deleteCanalAutorizado(@PathVariable Long id){
        canalAutService.deleteCanalAutorizado(id);
    }
    
}
