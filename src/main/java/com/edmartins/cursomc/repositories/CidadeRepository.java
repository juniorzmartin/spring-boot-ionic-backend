package com.edmartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmartins.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
