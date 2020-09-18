package com.example.curso.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.curso.servicos.exceptions.DatabaseException;
import com.example.curso.servicos.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandartError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {

		String erro = "Recurso nao encontrado";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError err = new StandartError(Instant.now(), status.value(), erro, e.getMessage(),
				request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandartError> database(DatabaseException e, HttpServletRequest request) {

		String erro = "Erro de Banco de Dados";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandartError err = new StandartError(Instant.now(), status.value(), erro, e.getMessage(),
				request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	
}
