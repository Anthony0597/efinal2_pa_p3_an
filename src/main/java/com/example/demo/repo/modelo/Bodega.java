package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="bodega")
public class Bodega {
	@Id
	@SequenceGenerator(name="seq_bode", sequenceName = "seq_bode", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bode")
	@Column(name = "bode_id")
	private Integer id;
	@Column(name = "bode_nombre")
	private String nombre;
	@Column(name = "bode_numero")
	private String numero;
	@Column(name = "bode_direccion")
	private String direccion;
	@Column(name = "bode_telefono")
	private String telefono;
	
	@OneToMany(mappedBy = "bodega")
	private List<Inventario> inventario;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Bodega [nombre=" + nombre + ", numero=" + numero + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	
}
