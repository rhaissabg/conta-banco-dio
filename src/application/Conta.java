package application;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		contaDestino.depositar(valor);
		this.sacar(valor);
	}
	
}
