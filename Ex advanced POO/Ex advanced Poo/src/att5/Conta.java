package att5;

// 5)
// Faça uma classe chamada Conta, com os atributos: nome do titular e saldo.
// Faça métodos para:
// Sacar dinheiro: o método deve receber a quantidade a ser sacada como parâmetro 
// Depositar dinheiro: o método deve receber a quantidade a ser depositada como parâmetro 
// Transferir dinheiro de uma conta para outra: o método deve receber como parâmetro o objeto 
// que receberá a transferência e a quantidade a ser transferida

public class Conta {
    
    private String nomeTitular;
    private double saldo;

    //gets
    public String getNomeTitular() {
        return nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }

    //sets
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //constructor
    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    //to String
    @Override
    public String toString() {
        return "Conta [nomeTitular = " + nomeTitular + ", saldo = " + saldo + "]";
    }
}
