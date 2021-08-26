package br.com.henrique.modulo05.entidades.exer01;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double despesaAdicional;
	
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}


	@Override
	public final double pagamento() {
		return super.pagamento() + (despesaAdicional * 110) / 100;
		
	}

	
	
}
