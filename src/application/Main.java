package application;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Rhaíssa");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta cp= new ContaPoupanca(cliente1);
		
		cc.depositar(100.00);
		cc.transferir(25.00, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}
	
}
