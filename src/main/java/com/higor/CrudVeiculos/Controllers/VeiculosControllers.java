package com.higor.CrudVeiculos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higor.CrudVeiculos.Entities.Veiculos;
import com.higor.CrudVeiculos.Repositories.VeiculosRepository;

@RestController
@RequestMapping (value = "/veiculos")
public class VeiculosControllers {

	@Autowired
	private VeiculosRepository veiculosrepository;

	@GetMapping
	public List findAll() {
		List result = veiculosrepository.findAll();
		return result;
	}
	
	@GetMapping (value = "/{id}")
	public Veiculos findById(@PathVariable long id) {
		Veiculos result = veiculosrepository.findById(id).get();
		return result;
	}	
	
	@PostMapping
	public Veiculos insert(@RequestBody Veiculos veiculos){
		Veiculos result = veiculosrepository.save(veiculos);
		return result;
	}
	
	
}
