package com.example.demo.service;

import com.example.demo.repo.modelo.Producto;

public interface IProductoService {
	public void guardar(Producto producto);
	public void modificar(Producto producto);
	public Producto buscar(Integer id);
	public void borrar(Integer id);
	public Producto buscarCodigo(String codigo);
}
