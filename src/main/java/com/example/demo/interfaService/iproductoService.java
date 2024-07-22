package com.example.demo.interfaService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.producto;
 

public interface iproductoService {
	
	public List<producto>listar();
	public Optional<producto>listarId(int ind);
	public int save2(producto p);
	public void delete2(int id);

}
