package javabanco.entidade;

import java.util.ArrayList;
import java.util.Date;

public class ContaCorrente {
	
	private String titular;
	private int numero;
	private float saldo;
	private ArrayList<Operacoes> operacao = new ArrayList<Operacoes>();
	
	public float getSaldo(){
		return saldo;
	}
	
	public float debito(float valor){
		saldo -= valor;
		Operacoes op = new Operacoes(valor, "DEBITO", new Date());
		operacao.add(op);
		return saldo;
	}
	public float credito(float valor){
		saldo += valor;
		Operacoes op = new Operacoes (valor , "CREDITO" , new Date());
		operacao.add(op);
		return saldo;
	}
	
	public ArrayList<Operacoes> extrato (){
		return operacao;
	}
	
	public float transferencia(float valor, ContaCorrente ccDestino) {
		this.debito(valor);
		ccDestino.credito(valor);
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public ContaCorrente(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

}
