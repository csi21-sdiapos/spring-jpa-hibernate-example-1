package com.example.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="cod_pedido")
	private String cod_pedido;


	// CONSTRUCTORES
	public Pedido(String cod_pedido) {
		super();
		this.cod_pedido = cod_pedido;
	}
	
	public Pedido() {
		super();
	}


	//GETTERS & SETTERS
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCod_pedido() {
		return cod_pedido;
	}
	public void setCod_pedido(String cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	// ToString
	@Override
	public String toString() {
		return "\nPedido [id=" + id + ", cod_pedido=" + cod_pedido + "]";
	}
}
