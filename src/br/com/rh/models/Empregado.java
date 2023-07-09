package br.com.rh.models;

public abstract class Empregado {
	private String nome;
	private String sobrenome;
	private String cpf;

	public Empregado(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public abstract double vencimento();
	

	
}
