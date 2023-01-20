package com.curso.microservicios.producto.app.model.dao;

import com.curso.microservicios.producto.app.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
