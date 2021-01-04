package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { // Esta forma é para fazer uma consulta SQL
	
	List<Product> findAllByOrderByNameAsc(); //Buscar todo mundo ordernado por nome e em ordem Crescente.
}
