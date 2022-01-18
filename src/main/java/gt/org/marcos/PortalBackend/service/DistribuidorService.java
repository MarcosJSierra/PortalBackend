/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.service;

import gt.org.marcos.PortalBackend.model.Distribuidor;
import java.util.ArrayList;
/**
 *
 * @author marcos
 */
public interface DistribuidorService {
    
    public Distribuidor getDistribuidorById(Long id);
    
    public ArrayList<Distribuidor> getAllDistribuidores();
    
    public Distribuidor createDistribuidor(Distribuidor distribuidor);
    
    public Distribuidor updateDistribuidor(Distribuidor distribuidor);
    
    public void deleteDistribuidor(Distribuidor distribuidor);
}
