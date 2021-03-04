package com.jonatas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonatas.cursomc.domain.Pedido;
import com.jonatas.cursomc.repositories.PedidoRepository;
import com.jonatas.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id)   {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! " + id + ", Tipo: " + Pedido.class.getName()));
	
	}
	
}
