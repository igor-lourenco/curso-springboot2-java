package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entidades.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
