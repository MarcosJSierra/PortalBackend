/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gt.org.marcos.PortalBackend.model.Producto;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author marcos
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    @Query (value = "SELECT * FROM Producto WHERE Producto.distribuidor = :idDistribuidor", nativeQuery = true)
    ArrayList<Producto> queryByDistribuidorId(@Param("idDistribuidor") Long idDistribuidor);
}
