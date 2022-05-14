
public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double chequeEspecial;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL;
		this.cliente = cliente;		
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
	public void transferir(double valor, ContaPoupanca poupanca) {
		this.sacar(valor);
		poupanca.depositar(valor);		
	}
	@Override
	public void chequeEspecial(double valor2) {
		saldo += valor2;	
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
	
	
	public double getChequeespecial() {
		return chequeEspecial;
	}

	public void imprimirInfosComuns() {		
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	} 
		
}