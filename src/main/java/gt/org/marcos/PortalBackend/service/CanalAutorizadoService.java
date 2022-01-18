/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.service;

import gt.org.marcos.PortalBackend.model.CanalAutorizado;
import java.util.ArrayList;
/**
 *
 * @author marcos
 */
public interface CanalAutorizadoService {
    
    public CanalAutorizado getCanalAutorizadoById(Long Id);
    
    public ArrayList<CanalAutorizado> getAllCanalAutroizado();
    
    public ArrayList<CanalAutorizado> getCanalAutorizadoByDistribuidor(Long distribuidorId);
    
    public CanalAutorizado createCanalAutorizado(CanalAutorizado canalAutorizado);
    
    public CanalAutorizado updateCanalAutorizado(CanalAutorizado canalAutorizado);
    
    public void deleteCanalAutorizado(Long id);
}
