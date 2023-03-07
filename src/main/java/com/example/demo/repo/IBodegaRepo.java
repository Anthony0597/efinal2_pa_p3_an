package com.example.demo.repo;

import com.example.demo.repo.modelo.Bodega;

public interface IBodegaRepo {
	public void insertar(Bodega bodega);
	public void actualizar(Bodega bodega);
	public Bodega buscar(Integer id);
	public void elminar(Integer id);
	public Bodega buscarNumero(String numero);
}
