package br.com.organico4you.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.organico4you.api.model.Item;
import br.com.organico4you.api.repository.ItemRepository;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/")
	public List<Item> listar(){
		return itemRepository.findAll();
	}
	
	@GetMapping("/{codigo")
	public Item findByCodigo(@PathVariable Long codigo){
		return itemRepository.findById(codigo).get();
	}

}
