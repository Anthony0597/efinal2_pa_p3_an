package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class Efinal2PaP3AnApplication implements CommandLineRunner{

	@Autowired
	IBodegaService bodegaService;
	@Autowired
	IProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal2PaP3AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
