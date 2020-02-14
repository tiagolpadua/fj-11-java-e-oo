package br.com.caelum.contas.modelo;

public abstract class Conta {
    private static int maiorIdentificador = 0;

    private int numero;
    protected double saldo;
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

    public void transfere(double valor, Conta conta) {
        this.saca(valor);
        conta.deposita(valor);
    }

    public abstract String getTipo();

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
        if (data.length() != 10) {
            return false;
        } else {
            return true;
        }
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        if (!dataValida(dataDeAbertura)) {
            System.out.println("Data n�o � v�lida: " + dataDeAbertura);
        } else {
            this.dataDeAbertura = dataDeAbertura;
        }
    }

    public void saca(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= (valor + 0.10);
    }

    public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou depositar" + " um  valor negativo");
        } else {
            this.saldo += valor;
        }
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String recuperaDadosParaImpressao() {
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
