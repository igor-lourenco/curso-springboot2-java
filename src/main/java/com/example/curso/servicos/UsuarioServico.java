package com.example.curso.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.entidades.Usuario;
import com.example.curso.repositories.UsuarioRepository;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.get();
	}
	
	public Usuario inserir(Usuario obj) {
		return repository.save(obj);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
}
