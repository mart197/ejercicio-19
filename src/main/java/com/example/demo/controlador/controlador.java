package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaService.iproveedorService;
import com.example.demo.modelo.proveedor;

@Controller
@RequestMapping
public class controlador {

	@Autowired 
	private iproveedorService service;
    	
	@GetMapping("/iniciar")
	public String iniciar(){
		
       return "index1";	
	
	}
	
	
	@GetMapping("/listar")
	public String listar(Model model){

		List<proveedor>proveedor=service.listar();
		model.addAttribute("proveedor",proveedor);
		
       return "index";	
	
	}

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("proveedor", new proveedor());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Valid proveedor p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<proveedor>proveedor=service.listarId(id);
		model.addAttribute("proveedor",proveedor);
		return "form";
	}
	
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/listas";
	}
	
}
