/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.org.marcos.PortalBackend.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Data
@Entity
@Table(name="CanalAutorizado")
public class CanalAutorizado implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private Long codigo;
    
    @Column(name="nombre")
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "distribuidor")
    private Distribuidor distribuidor;

}
