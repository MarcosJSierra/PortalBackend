/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.service;

import gt.org.marcos.PortalBackend.model.CanalAutorizado;
import gt.org.marcos.PortalBackend.repository.CanalAutorizadoRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author marcos
 */
public class CanalAutorizadoServiceImp implements CanalAutorizadoService{

    @Autowired
    CanalAutorizadoRepository canalAutRepo;
    
    @Override
    @Transactional(readOnly = true)
    public CanalAutorizado getCanalAutorizadoById(Long Id) {
        return canalAutRepo.findById(Id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<CanalAutorizado> getAllCanalAutroizado() {
        return (ArrayList<CanalAutorizado>) canalAutRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<CanalAutorizado> getCanalAutorizadoByDistribuidor(Long distribuidorId) {
        return null;
    }

    @Override
    @Transactional
    public CanalAutorizado createCanalAutorizado(CanalAutorizado canalAutorizado) {
        return canalAutRepo.save(canalAutorizado);
    }

    @Override
    @Transactional
    public CanalAutorizado updateCanalAutorizado(CanalAutorizado canalAutorizado) {
        return canalAutRepo.save(canalAutorizado);
    }

    @Override
    @Transactional
    public void deleteCanalAutorizado(Long id) {
        CanalAutorizado canal = canalAutRepo.findById(id).orElse(null);
        if(canal != null){
            canalAutRepo.delete(canal);
        }
    }
    
}
