package com.example.base.de.datos.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	@ManyToOne
	private Cliente cliente;
	private Date fecha;
	@ManyToOne
	private Producto producto;
	private float total;

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", cliente=" + cliente + ", fecha=" + fecha + ", producto=" + producto + ", total="
				+ total + "]";
	}

}
