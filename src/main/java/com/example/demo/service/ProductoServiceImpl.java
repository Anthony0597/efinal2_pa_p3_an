package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IProductoRepo;
import com.example.demo.repo.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoRepo productoRepo;
	
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertar(producto);
	}

	@Override
	public void modificar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepo.elminar(id);
	}

	@Override
	public Producto buscarCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarCodigo(codigo);
	}

}
