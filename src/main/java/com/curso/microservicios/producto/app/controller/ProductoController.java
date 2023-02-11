package com.curso.microservicios.producto.app.controller;

import com.curso.microservicios.producto.app.models.entity.Producto;
import com.curso.microservicios.producto.app.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService iProductoService;

    @GetMapping("/productos")
    public ResponseEntity<List<Producto>> listarProductos() {
        List<Producto> productos = iProductoService.findAll();
        System.out.println("LISTA DE PRODUCTOS...");
        return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
    }

}
