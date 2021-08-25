package br.com.henrique.modulo04.entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.henrique.modulo04.entidade.enums.NivelTrabalho;

public class Trabalhador {
	
	private String name;
	private NivelTrabalho level;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<ContratoHora>();

	
	public Trabalhador() {
	}


	public Trabalhador(String name, NivelTrabalho level, Double salarioBase, Departamento departamento) {
		this.name = name;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public NivelTrabalho getLevel() {
		return level;
	}


	public void setLevel(NivelTrabalho level) {
		this.level = level;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<ContratoHora> getContratos() {
		return contratos;
	}


	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for(ContratoHora c : contratos) {
			
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR); 
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
	
}
