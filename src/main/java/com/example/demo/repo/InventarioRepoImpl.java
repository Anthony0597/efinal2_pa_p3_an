package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InventarioRepoImpl implements IInventarioRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(inventario);
	}

	@Override
	public void actualizar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(inventario);
	}

	@Override
	public Inventario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Inventario.class, id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
