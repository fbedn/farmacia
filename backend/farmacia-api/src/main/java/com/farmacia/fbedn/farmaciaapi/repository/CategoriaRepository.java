package com.farmacia.fbedn.farmaciaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmacia.fbedn.farmaciaapi.model.Categoria;

@Repository //indica que é um repositório
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
