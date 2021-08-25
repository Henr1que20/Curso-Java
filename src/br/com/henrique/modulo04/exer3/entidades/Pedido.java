package br.com.henrique.modulo04.exer3.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.henrique.modulo04.OrderStatus;

public class Pedido {
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItemPedido> itemPedidos = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Pedido() { 
		
	}
	
	public Pedido(Date momento, StatusPedido statusPedido, Cliente cliente) {
		this.momento = momento;
		this.status = statusPedido;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItemPedido() {
		return itemPedidos;
	}

	public void addPedido(ItemPedido itemPedidio) {
		itemPedidos.add(itemPedidio);
	}
	
	public void removcePedido(ItemPedido itemPedidio) {
		itemPedidos.remove(itemPedidio);
	}
	
	public double total() {
		double soma = 0;
		
		for(ItemPedido p : itemPedidos) {
			soma += p.subTotal();
		}
		
		return soma;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Momento do pedido:");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Item pedidos: ");
		for(ItemPedido ip : itemPedidos) {
			sb.append(ip + "\n");
		}
		sb.append("Preço Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
}
