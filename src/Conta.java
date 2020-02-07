
public class Conta {

	int numero;
	double saldo;
	String titular;
	String agencia;
	String dataDeAbertura;

	void saca(double valor) {
		saldo = saldo - valor;
	}

	void deposita(double valor) {
		saldo = saldo + valor;
	}

	double calculaRendimento() {
		return saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {
		String dados = "Titular:	" + this.titular;
		dados += "\nN�mero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTitular: " + this.titular;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nData de Abertura: " + this.dataDeAbertura;
		dados += "\nRendimento: " + this.calculaRendimento();
		return dados;
	}
}
