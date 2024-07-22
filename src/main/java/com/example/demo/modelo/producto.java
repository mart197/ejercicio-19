package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class producto {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String descripcion;
	private String precio;
	private String cantidad_en_stock;
	private int id_del_proveedor;
	
	public producto() {
		 
	}

	public producto(int id, String nombre, String descripcion, String precio, String cantidad_en_stock,
			int id_del_proveedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad_en_stock = cantidad_en_stock;
		this.id_del_proveedor = id_del_proveedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getCantidad_en_stock() {
		return cantidad_en_stock;
	}

	public void setCantidad_en_stock(String cantidad_en_stock) {
		this.cantidad_en_stock = cantidad_en_stock;
	}

	public int getId_del_proveedor() {
		return id_del_proveedor;
	}

	public void setId_del_proveedor(int id_del_proveedor) {
		this.id_del_proveedor = id_del_proveedor;
	}
	
	
	
}
