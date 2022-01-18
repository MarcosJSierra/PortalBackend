/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gt.org.marcos.PortalBackend.model.CanalAutorizado;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author marcos
 */
@Repository
public interface CanalAutorizadoRepository extends JpaRepository<CanalAutorizado, Long>{
    
        
    @Query (value = "SELECT * FROM CanalAutorizado WHERE CanalAutorizado.distribuidor = :idDistribuidor", nativeQuery = true)
    ArrayList<CanalAutorizado> queryByDistribuidorId(@Param("idDistribuidor") Long idDistribuidor);
}
