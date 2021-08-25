package br.com.henrique.modulo04;

import java.util.Date;

public class Programa {
	public static void main(String[] args) {
		
		Servico pedido = new Servico(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		
		System.out.println(pedido);
		
		OrderStatus os1 = OrderStatus.DEVILERED;
		
		// para trasnformar uma string para um enum
		OrderStatus os2 = OrderStatus.valueOf("DEVILERED");
		
		System.out.println(os1);
		
		System.out.println(os2);
	}
}
