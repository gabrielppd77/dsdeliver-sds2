package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products " // << Para pegar os Produtos relacionados aos pedidos
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC") //ONDE o status do objeto é 0 (PENDING) ordernado pelo MOMENT Ascendente
	List<Order> findOrdersWithProducts();//Escrevendo consultas no JPA
}
