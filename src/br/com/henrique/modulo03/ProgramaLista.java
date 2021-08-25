package br.com.henrique.modulo03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaLista {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		
		for(String list : lista) {
			System.out.println(list);
		}
		
		// adicionar um elemento na lista em uma posicao desejada
		System.out.println("---------------------------");
		lista.add(2, "marco");
		
		for(String list : lista) {
			System.out.println(list);
		}
		
		// remover todos os elementodas da lista que comece com a lesta M ou m
		lista.removeIf(x -> x.charAt(0) == 'M' || x.charAt(0) == 'm');
		
		
		System.out.println("---------------------------");
		for(String list : lista) {
			System.out.println(list);
		}
		
		System.out.println("---------------------------");
		
		// procurar a posição na lista a partir de uma String 
		System.out.println("index of Bob: " + lista.indexOf("Bob"));
		System.out.println("index de maco: " + lista.indexOf("marco"));
		
		System.out.println("---------------------------");
		
		// para deixar na lista somento elementos que comece com a letra A
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String result : resultado) {
			System.out.println(result);
		}
		
		System.out.println("---------------------------");
		// para encontra o primeiro elemento da lista que comece com 'A'
		String nome = lista.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(nome);
		
	}

}
