
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);		
	}

	@Override
	public void imprimirExtratoContaCorrente() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		
	}

	@Override
	public void imprimirExtratoContaPoupanca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirExtratoChequeEspecial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferirValor(double valor, ContaPoupanca contaDestino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

	
}
