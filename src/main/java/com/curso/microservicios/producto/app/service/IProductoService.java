package com.curso.microservicios.producto.app.service;

import com.curso.microservicios.producto.app.models.entity.Producto;

import java.util.List;

public interface IProductoService {

   public List<Producto> findAll();
   public Producto findProductoById(Long id);

}
