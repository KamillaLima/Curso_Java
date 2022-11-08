package br.com.curso.nove;

public class BancoCliente {

	private long numeroConta;
	private String nomeCompleto;
	private double saldo;
	
	/* caso nao queira depositar um valor ao iniciar a conta*/
	public BancoCliente(long numeroConta, String nomeCompleto) {
		super();
		this.numeroConta = numeroConta;
		this.nomeCompleto = nomeCompleto;
	}
	
	/*caso queira depositar um valor ao iniciar a conta */
	public BancoCliente(long numeroConta,String nomeCompleto, double saldoEntrada) {
		super();
		this.numeroConta=numeroConta;
		this.nomeCompleto = nomeCompleto;
		deposito(saldoEntrada);
	}
	
	/*Apenas o get pois desse modo não será possivel alterar a informação colocada no construtor  */
	public long getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	/*Apenas get pois ele nunca será acessado diretamente,ele será acessado por métodos(como o saldoDisponivel,depoistar e sacar)*/
	public double getSaldo() {
		return saldo;
	}
	
	public boolean saldoDisponivel(double valorSaque) {
		if(saldo < valorSaque) {
			return false;
		}else {
			return true;
		}
	}
	
	public void deposito(double valorDeposito) {
		 saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		saldo -= valorSaque + 5.00;
	}
	@Override
	public String toString() {
		return "BancoCliente [numeroConta=" + numeroConta + ", nomeCompleto=" + nomeCompleto + ", saldo=" + saldo + "]";
	}
	
	
}
