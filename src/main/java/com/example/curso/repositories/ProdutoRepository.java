package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entidades.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
