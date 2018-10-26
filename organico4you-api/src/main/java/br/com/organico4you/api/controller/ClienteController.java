package br.com.organico4you.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.organico4you.api.model.Cliente;
import br.com.organico4you.api.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping
	public List<Cliente> listar(){
		System.out.println("################################################### passei aqui ################################################### ");
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Cliente buscaByCodigo(@PathVariable Long codigo){
		return clienteRepository.findById(codigo).get();
	}

	
	

}
