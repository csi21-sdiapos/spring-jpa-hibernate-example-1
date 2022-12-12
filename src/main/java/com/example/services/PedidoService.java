package com.example.services;

import java.util.List;

import com.example.models.Pedido;


public interface PedidoService {
	
	public void insertarPedido(Pedido pedido);
	
	public List<Pedido> buscarTodos();

}