package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.service.IBodegaService;

@Controller
@RequestMapping("/bodegas")
public class BodegaController {
	
	@Autowired
	private IBodegaService bodegaService;
	
	@GetMapping("/nuevaBodega")
	public String nuevaBodega(Bodega bodega) {
		return"nuevaBodega";
	}
	
	@PostMapping("/insertar")
	public String insertarBodega(Bodega bodega) {
		this.bodegaService.guardar(bodega);
		return "redirect:/bodegas/nuevaBodega";
	}
}
