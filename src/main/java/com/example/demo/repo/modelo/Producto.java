package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@Column(name="prod_codigo_barras_maestro")
	private String codigoBarrasMaestro;
	@Column(name="prod_nombre")
	private String nombre;	
	@Column(name="prod_categoria")
	private String categoría;
	@Column(name="prod_stock")
	private Integer stock=0;
	
	@ManyToOne
	@JoinColumn(name = "prod_id_inventario")
	private Inventario inventario;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}
	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}
	public String getCategoría() {
		return categoría;
	}
	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigoBarrasMaestro=" + codigoBarrasMaestro + ", categoría="
				+ categoría + ", stock=" + stock + "]";
	}
	
	
}
