 package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaService.iproveedorService;
import com.example.demo.interfaces.iproveedor;
import com.example.demo.modelo.proveedor;

@Service
public class proveedorService implements iproveedorService {
    
	@Autowired
	private iproveedor data;
	@Override
	public List<proveedor>listar() {
		 
		return (List<proveedor>) data.findAll();
	}

	@Override
	public Optional<proveedor> listarId(int id) {
		// TODO Auto-generated method stub
		return  data.findById(id);
	}

	@Override
	public int save(proveedor p) {
		 int res=0;
		 proveedor proveedor=data.save(p);
		 if(!proveedor.equals(null)) {
			 res=1;
	     }
		return res;
	}

	@Override
	public void delete(int id) {
		 data.deleteById(id);
		
	}

}
 