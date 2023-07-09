package br.com.rh.app;

import java.util.Locale;

import br.com.rh.models.Assalariado;
import br.com.rh.models.Comissionado;
import br.com.rh.models.Horista;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// Criando Assalariado1

		Assalariado assal1 = new Assalariado("Tarzan", "Gorila", "01020304");
		assal1.setSalario(12000.00);

		// Criando Comissionado1

		Comissionado comis1 = new Comissionado("Mew", "Two", "02030405");
		comis1.setTotalVenda(55000.00);
		comis1.setTotalComissao(0.25);

		// Criando Horista1

		Horista horista1 = new Horista("Sanji", "Sobrancelhas", "03040506");
		horista1.setPrecoHora(45.67);
		horista1.setHorasTrabalhadas(176);
		
		
		// Mostrando os valores
		
		System.out.println(assal1.getNome() + " " + assal1.getSobrenome());
		System.out.printf("Vencimento assalariado: %.2f%n", assal1.vencimento());
		System.out.println("-------------------------------");
		System.out.println(comis1.getNome() + " " + comis1.getSobrenome());
		System.out.printf("Vencimento comissionado: %.2f%n", comis1.vencimento());
		System.out.println("-------------------------------");
		System.out.println(horista1.getNome() + " " + horista1.getSobrenome());
		System.out.printf("Vencimento horista: %.2f%n", horista1.vencimento());
		

	}
		

}
