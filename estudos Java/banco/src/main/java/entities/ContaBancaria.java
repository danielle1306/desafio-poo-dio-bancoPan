package entities;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    public void ContaBancaria() {

    }

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);//já chamo o método para, se algo mudar no futuro, aqui já estar pronto
    }
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;

    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public int getNumeroConta() {//só get para tornar o numeroconta imutável
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }
    public void saque(double valor) {
        saldo -= valor + 5.00;
    }
    public String toString() {
        return "Account "
                + numeroConta
                + ", Titular da conta: "
                + nomeTitular
                + ", Saldo: $ "
                + String.format("%2.f", saldo);
    }
}
