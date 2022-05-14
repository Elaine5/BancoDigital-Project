
public class Main {
	
	public static void main(String[] args) {
		Cliente elaine = new Cliente();
		elaine.setNome("Elaine");
		
		Conta cc = new ContaCorrente(elaine);		
		ContaPoupanca poupanca = new ContaPoupanca(elaine);
		ChequeEspecial chequeEspecial = new ChequeEspecial();
		Conta pix = new Pix(elaine);
		
		cc.transferir(150, cc);
		cc.depositar(1000);
		cc.transferir(150, poupanca);
		cc.pix(150, poupanca);
		chequeEspecial.chequeEspecial(3500);
		
		
		cc.imprimirExtratoContaCorrente();
		poupanca.imprimirExtratoContaPoupanca();
		chequeEspecial.imprimirExtratoChequeEspecial();
		

	}

}
