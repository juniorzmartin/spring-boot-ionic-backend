package com.edmartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmartins.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
