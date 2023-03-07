package com.example.demo.repo;

import com.example.demo.repo.modelo.Producto;

public interface IProductoRepo {
	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public Producto buscar(Integer id);
	public void elminar(Integer id);
	public Producto buscarCodigo(String codigo);
}
