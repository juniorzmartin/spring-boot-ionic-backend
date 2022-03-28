package com.edmartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmartins.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
