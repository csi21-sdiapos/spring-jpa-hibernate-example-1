package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.controllers.PedidoController;
import com.example.models.Pedido;


public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("contexto.xml"); 
		PedidoController pedidoController = (PedidoController) applicationContext.getBean(PedidoController.class);
		pedidoController.insertarUnPedido(new Pedido("prueba"));
		System.out.println("Lista pedidos: " + pedidoController.buscarTodosPedidos());
	}

}
