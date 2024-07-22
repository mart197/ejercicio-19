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

import com.example.demo.interfaService.iproductoService;
import com.example.demo.modelo.producto;
import com.example.demo.modelo.proveedor;
import com.example.demo.service.proveedorService;

@Controller
@RequestMapping
public class controlador2 {

	@Autowired 
	private iproductoService service;
	@Autowired 
	private proveedorService x;
	
	@GetMapping("/listar2")
	public String listar(Model model ){

		List<producto>producto=service.listar();
		model.addAttribute("producto",producto);
		 
		
       return "index2";	
	
	} 

	@GetMapping("/new2")
	public String agregar(Model model, Model model2) {
		model.addAttribute("producto", new producto());
		
		List<proveedor>proveedor=x.listar();
		model2.addAttribute("proveedor",proveedor);
		 
		return "form2";
	}
	@PostMapping("/save2")
	public String save2(@Valid producto p, Model model) {
		service.save2(p);
		return "redirect:/listar2";
	}
	
	@GetMapping("/editar2/{id}")
	public String editar2(@PathVariable int id, Model model, Model model2) {
		Optional<producto>producto=service.listarId(id);
		model.addAttribute("producto",producto);
		List<proveedor>proveedor=x.listar();
		model2.addAttribute("proveedor",proveedor);
		 
		return "form2";
	}
	
	
	@GetMapping("/eliminar2/{id}")
	public String delete2(Model model,@PathVariable int id) {
		service.delete2(id);
		return "redirect:/listas2";
	}

}

