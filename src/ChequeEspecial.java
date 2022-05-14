
public class ChequeEspecial extends Conta {
	
	private static Cliente cliente;

	public ChequeEspecial() {
		super(cliente);		
	}

	public void imprimirExtratoChequeEspecial() {
		System.out.println("=== Saldo Cheque Especial ===");
		super.imprimirInfosComuns();
		
	

}

	@Override
	public void imprimirExtratoContaPoupanca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirExtratoContaCorrente() {
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