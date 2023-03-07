package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBodegaRepo;
import com.example.demo.repo.IInventarioRepo;
import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired 
	IInventarioRepo inventarioRepo;
	@Autowired
	IBodegaRepo bodegaRepo;
	@Autowired
	IProductoService productoService;
	
	@Override
	public void registrar(String nombreBodega, String codigoProducto, Integer cantidad) {
		// TODO Auto-generated method stub
		Inventario inve = new Inventario();
		Bodega bode = new Bodega();
		bode= this.bodegaRepo.buscarNumero(nombreBodega);
		List<Producto>productos= new ArrayList<>();
		for(int i =0; i<cantidad; i++) {
			Producto temp= new Producto();
			temp=this.productoService.buscarCodigo(codigoProducto);
			temp.setCodigoBarrasMaestro(codigoProducto+i);
			productos.add(temp);
		}
		inve.setBodega(bode);
		inve.setProductos(productos);
		this.inventarioRepo.insertar(inve);
		
	}

}
