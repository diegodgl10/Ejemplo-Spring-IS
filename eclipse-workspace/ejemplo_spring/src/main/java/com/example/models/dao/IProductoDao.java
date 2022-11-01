package com.example.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {
	
}
