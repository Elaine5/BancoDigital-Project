
public class ContaPoupanca implements IConta{
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public ContaPoupanca(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;		
	}
	
	public void sacar(double valor) {
		saldo -= valor;		
	}

	public void depositar(double valor) {
		saldo += valor;		
	}


	public void transferirValor(double valor, ContaPoupanca contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);		
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


	public void imprimirExtratoContaPoupanca() {
		System.out.println("=== Extrato Conta Poupanca ===");
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chequeEspecial(double valor2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirExtratoContaCorrente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirExtratoChequeEspecial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, ContaPoupanca poupanca) {
		// TODO Auto-generated method stub
		
	}
	
}
