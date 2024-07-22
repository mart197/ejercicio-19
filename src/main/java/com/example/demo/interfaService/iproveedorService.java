package com.example.demo.interfaService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.proveedor;

public interface iproveedorService {

	public List<proveedor>listar();
	public Optional<proveedor>listarId(int ind);
	public int save(proveedor p);
	public void delete(int id);
}
