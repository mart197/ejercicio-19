package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaService.iproductoService;
import com.example.demo.interfaces.iproducto;
import com.example.demo.modelo.producto;


@Service
public class productoService implements iproductoService {
	
	
	@Autowired
	private iproducto data;
	@Override
	public List<producto> listar() {
		// TODO Auto-generated method stub
		return (List<producto>) data.findAll();
	}

	@Override
	public Optional<producto> listarId(int id) {
		 
		return data.findById(id);
	}

	@Override
	public int save2(producto p) {
	 int res=0;
	 producto producto=data.save(p);
	 if(!producto.equals(null)) {
		 res=1;
	 }
			 return res;
	}

	@Override
	public void delete2(int id) {
		 data.deleteById(id);
		
	}

}
