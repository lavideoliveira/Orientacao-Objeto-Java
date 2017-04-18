package javabanco.entidade;

import java.util.ArrayList;
import java.util.Date;

public class ContaCorrente {
	
	private float saldo;
	private ArrayList<Float> operacoes = new ArrayList<Float>();
	
	public float getSaldo(){
		return saldo;
	}
	
	public float debito(float valor){
		saldo -= valor;
		operacoes.add(-valor);
		return saldo;
	}
	public float credito(float valor){
		saldo += valor;
		//Operacoes o = new Operacoes (valor, "CREDITO", new Date())
		operacoes.add(valor);
		return saldo;
	}
	
	public ArrayList<Float> extrato (){
		return operacoes;
	}

}
