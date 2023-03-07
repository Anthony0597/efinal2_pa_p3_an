package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBodegaRepo;
import com.example.demo.repo.modelo.Bodega;
@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private IBodegaRepo bodegaRepo;
	
	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepo.insertar(bodega);
	}

	@Override
	public void modificar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepo.actualizar(bodega);
	}

	@Override
	public Bodega buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.bodegaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.bodegaRepo.elminar(id);
	}

	@Override
	public Bodega buscarNumero(String numero) {
		// TODO Auto-generated method stub
		return this.bodegaRepo.buscarNumero(numero);
	}

}
