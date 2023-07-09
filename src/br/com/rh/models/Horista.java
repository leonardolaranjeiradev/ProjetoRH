package br.com.rh.models;

public class Horista extends Empregado {
	private double precoHora;
	private double horasTrabalhadas;

	public Horista(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);

	}

	public double vencimento() {
		return horasTrabalhadas * precoHora;

	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
