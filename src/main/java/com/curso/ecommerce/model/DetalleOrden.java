package com.curso.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detalles")
public class DetalleOrden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	@ManyToOne
	private Orden orden;
	
	@ManyToOne
	private Producto producto;

	public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total, Orden orden,
			Producto producto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
		this.orden = orden;
		this.producto = producto;
	}
	
	
	
	
	
}
