package javabanco;

import java.util.ArrayList;
import java.util.Date;

import javabanco.entidade.ContaCorrente;
import javabanco.entidade.Operacoes;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		int unNumero = 42;
		int outroNumero = 3;
		int produto = 0;
		
		Integer umNumeroObj = new Integer(42);
		
		System.out.println("unNumero : " + unNumero);
		
		System.out.println("produto (antes)" + produto);
		
		produto = unNumero * outroNumero;
		
		System.out.println("produto (depois)" + produto);
		
		System.out.println("umNumeroObj : " + umNumeroObj);
		
		ArrayList<Integer> contas = new ArrayList<Integer>();
		
		contas.add(12345);
		contas.add(24680);
		contas.add(92681);
		System.out.println("Contas = " + contas);
		
		ContaCorrente cc1 = new ContaCorrente(67890, "Gilberto");
		System.out.println("cc1.getSaldo(): " + cc1.getSaldo());
		
		cc1.credito(unNumero);
		
		System.out.println("cc1.getSaldo() após crédito: " + cc1.getSaldo());
		
		cc1.debito(20);
		
		System.out.println("cc1.getSaldo() após débito: " + cc1.getSaldo());
		
		System.out.println("cc1.extrato():" + cc1.extrato());
		
		Operacoes o1 = new Operacoes(500, "CREDITO", new Date(2017 - 1900, 3, 18, 10, 0, 0));
		Operacoes o2 = new Operacoes(900, "DEBITO", (new Date()));
		
		
		System.out.println("o1: " + o1.toString());
		System.out.println("o2: " + o2.toString());
		
		
		ContaCorrente cc2 = new ContaCorrente(12345, "Marcos");
		cc1.transferencia(10, cc2);
		System.out.println("cc2.extrato():" + cc2.extrato());
		System.out.println("cc1.extrato():" + cc1.extrato());

		System.out.println("Nome do titular cc1: " + cc1.getTitular());
		System.out.println("Nome do titular cc2: " + cc2.getTitular());
		System.out.println("Numero da conta cc1: " + cc1.getNumero());
		System.out.println("Numero da conta cc2: " + cc2.getNumero());
	}

	}


