package com.curso.ecommerce.model;

import lombok.Data;

@Data
public class Producto {

	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private int cantidad;
	private double precio;
	
	public Producto(Integer id, String nombre, String descripcion, String imagen, int cantidad, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
	
}
