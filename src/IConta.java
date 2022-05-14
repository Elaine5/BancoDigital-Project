
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void transferirValor(double valor, ContaPoupanca contaDestino);
	
	void chequeEspecial (double valor2);
	
	void imprimirExtratoContaPoupanca();

	void imprimirExtratoContaCorrente();
	
	void imprimirExtratoChequeEspecial();

	void transferir(double valor, ContaPoupanca poupanca);
}
