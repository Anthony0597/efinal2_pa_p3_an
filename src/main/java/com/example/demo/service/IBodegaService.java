package com.example.demo.service;

import com.example.demo.repo.modelo.Bodega;

public interface IBodegaService {
	public void guardar(Bodega bodega);
	public void modificar(Bodega bodega);
	public Bodega buscar(Integer id);
	public void borrar(Integer id);
	public Bodega buscarNumero(String numero);
}
