package com.example.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.example.models.Pedido;
import com.example.services.PedidoService;


@Component
public class PedidoServiceImpl implements PedidoService {

	@PersistenceContext
	private EntityManager em;
	
	public void insertarPedido(Pedido pedido) {
		em.persist(pedido);
	}
	
	public List<Pedido> buscarTodos() {
//		return em.createQuery("SELECT pedidos FROM Pedido pedidos").getResultList();
		return em.createQuery("SELECT pedidos FROM Pedido pedidos").getResultList();
	}

}