package com.luigi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luigi.model.Producto;
import com.luigi.services.IProducto;

@RestController
@RequestMapping("/v1/api")
public class Controlador {
	
	@Autowired
	private IProducto repositorio;
	
	@GetMapping
	public List<Producto> getProductos(){
		return repositorio.findAll();
	}
	
	@PostMapping
	public Object saveProductos(@RequestBody Producto p) {
		return repositorio.save(p);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteProducto(@PathVariable int id) {
		repositorio.deleteById(id);
	}
	
	@GetMapping(value = "/{id}")
	public Object getProducto(@PathVariable int id) {
		return repositorio.findById(id);
	}
	
	@PutMapping
	public void updateProducto(@RequestBody Producto p) {
		repositorio.saveAndFlush(p);
	}
}
