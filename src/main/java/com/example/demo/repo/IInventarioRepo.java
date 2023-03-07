package com.example.demo.repo;

import com.example.demo.repo.modelo.Inventario;

public interface IInventarioRepo {
	public void insertar(Inventario inventario);
	public void actualizar(Inventario inventario);
	public Inventario buscar(Integer id);
	public void elminar(Integer id);
}
