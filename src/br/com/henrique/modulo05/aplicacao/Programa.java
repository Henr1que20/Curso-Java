package br.com.henrique.modulo05.aplicacao;

import br.com.henrique.modulo05.entidades.Conta;
import br.com.henrique.modulo05.entidades.ContaDeNegocio;
import br.com.henrique.modulo05.entidades.ContaPoupanca;

public class Programa {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta(1001, "Alex", 1000.00);
		
		
		cc.saque(200);
		
		System.out.println(cc.getSaldo());
		
		
		Conta cp = new ContaPoupanca(1002,"Jao",1000.00, 0.01);
		
		cp.saque(200);
		
		System.out.println(cp.getSaldo());
		
		
		Conta cn = new ContaDeNegocio(1003,"Pikachu", 1000.00, 500.00);
		
		cn.saque(200);
		
		System.out.println(cn.getSaldo());
		
//		ContaDeNegocio ccn = new ContaDeNegocio(1002, "Maria", 0.0, 500.0);
//		
//		// UPCASTING
//		
//		Conta cc1 = ccn;
//		
//		Conta cc2 = new ContaDeNegocio(1003, "Bob", 0.0, 200.0);
//		Conta cc3 = new ContaPoupanca(1003, "Bob", 0.0, 0.01);
//		
//		// DOWNCASTING
//		
//		ContaDeNegocio cc4 = (ContaDeNegocio)cc2;
//		cc4.emprestimo(100.0);
//		
//		
//		//ContaDeNegocio cc5 = (ContaDeNegocio) cc3;
//		
//		if (cc3 instanceof ContaDeNegocio) {	
//			ContaDeNegocio cc5 = (ContaDeNegocio) cc3;
//			cc5.emprestimo(200.00);
//			System.out.println("Emprestimo!");
//		}
//		
//		if(cc3 instanceof ContaPoupanca) {
//			ContaPoupanca cc5 = (ContaPoupanca) cc3;
//			cc5.atualizarSaldo();
//			System.out.println("atualizado");
//		}
//		
		
	}

}
