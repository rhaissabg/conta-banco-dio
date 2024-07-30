package application;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato - Conta Poupança");
		System.out.println("Titular: " + super.cliente.getNome());
		System.out.println("Agência: " + super.agencia);
		System.out.println("Número: " + super.numero);
		System.out.println("Saldo: " + String.format("%.2f", super.saldo));
	}

}
