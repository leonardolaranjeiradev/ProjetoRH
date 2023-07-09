package br.com.rh.models;

public class Assalariado extends Empregado {
	private double salario;

	public Assalariado(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);

	}

	public double vencimento() {
		return salario - (salario * 0.08);

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

