package com.curso.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private int cantidad;
	private double precio;
	
	@ManyToOne
	private Usuario usuario;

	public Producto(Integer id, String nombre, String descripcion, String imagen, int cantidad, double precio,
			Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.cantidad = cantidad;
		this.precio = precio;
		this.usuario = usuario;
	}
	
	
	
	
	
}
