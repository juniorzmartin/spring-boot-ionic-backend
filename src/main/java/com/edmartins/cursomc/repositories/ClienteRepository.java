package com.edmartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmartins.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
