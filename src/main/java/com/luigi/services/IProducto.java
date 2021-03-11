package com.luigi.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.luigi.model.Producto;

@EnableJpaRepositories
@Repository
public interface IProducto extends JpaRepository<Producto, Integer> {

}
