package com.curso.microservicios.producto.app.models.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "products")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "price")
    private Double precio;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

}
