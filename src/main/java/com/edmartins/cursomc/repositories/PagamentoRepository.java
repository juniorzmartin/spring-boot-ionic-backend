package com.edmartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmartins.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
