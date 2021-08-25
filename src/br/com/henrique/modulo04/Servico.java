package br.com.henrique.modulo04;

import java.util.Date;

public class Servico {
	private Integer id;
	private Date moment;
	private OrderStatus StatusPedido;
	
	
	public Servico() { }
	
	public Servico(Integer id, Date moment, OrderStatus statusPedido) {
		this.id = id;
		this.moment = moment;
		StatusPedido = statusPedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatusPedido() {
		return StatusPedido;
	}

	public void setStatusPedido(OrderStatus statusPedido) {
		StatusPedido = statusPedido;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", moment=" + moment + ", StatusPedido=" + StatusPedido + "]";
	}
	
	
	
	
}
