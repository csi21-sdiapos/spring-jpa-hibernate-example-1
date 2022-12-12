package com.example.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.implementations.PedidoServiceImpl;
import com.example.models.Pedido;


@Component
public class PedidoController {

	@Autowired
	private PedidoServiceImpl pedidoServiceImpl;
	
	
	@Transactional
	public void insertarUnPedido(Pedido pedido) {
		pedidoServiceImpl.insertarPedido(pedido);
	}
	
	@Transactional
	public void insertarListaPedidos(Collection<Pedido> colPedidos) {
		for (Pedido pedido : colPedidos) {
			pedidoServiceImpl.insertarPedido(pedido);
		}
	}
	
	@Transactional
	public List<Pedido> buscarTodosPedidos() {
		return pedidoServiceImpl.buscarTodos();
	}
	
}