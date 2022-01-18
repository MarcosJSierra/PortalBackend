/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.service;

import gt.org.marcos.PortalBackend.model.Distribuidor;
import gt.org.marcos.PortalBackend.repository.DistribuidorRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author marcos
 */
@Service
public class DistribuidorServiceImp implements DistribuidorService {
    
    @Autowired
    DistribuidorRepository distribuidorRepo;

    @Override
    @Transactional(readOnly = true)
    public Distribuidor getDistribuidorById(Long id) {
        return distribuidorRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Distribuidor> getAllDistribuidores() {
        return (ArrayList<Distribuidor>) distribuidorRepo.findAll();
    }

    @Override
    @Transactional
    public Distribuidor createDistribuidor(Distribuidor distribuidor) {
        return distribuidorRepo.save(distribuidor);
    }

    @Override
    @Transactional
    public Distribuidor updateDistribuidor(Distribuidor distribuidor) {
        return distribuidorRepo.save(distribuidor);
    }

    @Override
    @Transactional
    public void deleteDistribuidor(Long distribuidorId) {
        Distribuidor distribuidor = distribuidorRepo.findById(distribuidorId).orElse(null);
        if(distribuidor != null){
            distribuidorRepo.delete(distribuidor);
        }
    }
    
}
