package br.com.caelum.contas.modelo;
public class Conta {
	private static int maiorIdentificador = 0;

	private int numero;
	private double saldo;
	private String titular;
	private String agencia;
	private String dataDeAbertura;
	private int identificador;

	public Conta() {
		Conta.maiorIdentificador = Conta.maiorIdentificador + 1;
		this.identificador = Conta.maiorIdentificador;
	}

	public Conta(String titular) {
		this.titular = titular;
		Conta.maiorIdentificador = Conta.maiorIdentificador + 1;
		this.identificador = Conta.maiorIdentificador;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	private boolean dataValida(String data) {
		if(data.length() != 10) {
			return false;
		} else {
			return true;
		}
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		if(!dataValida(dataDeAbertura)) {
			System.out.println("Data não é válida: " + dataDeAbertura);			
		} else {
			this.dataDeAbertura = dataDeAbertura;			
		}
	}

	public void saca(double valor) {
		saldo = saldo - valor;
	}

	public void deposita(double valor) {
		saldo = saldo + valor;
	}

	public double calculaRendimento() {
		return saldo * 0.1;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular:	" + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTitular: " + this.titular;
		dados += "\nAgência: " + this.agencia;
		dados += "\nData de Abertura: " + this.dataDeAbertura;
		dados += "\nRendimento: " + this.calculaRendimento();
		return dados;
	}
}
