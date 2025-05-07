package att4;

import java.util.ArrayList;

// 5)
// Faça uma classe chamada Conta, com os atributos: nome do titular e saldo.
// Faça métodos para:
// Sacar dinheiro: o método deve receber a quantidade a ser sacada como parâmetro 
// Depositar dinheiro: o método deve receber a quantidade a ser depositada como parâmetro 
// Transferir dinheiro de uma conta para outra: o método deve receber como parâmetro o objeto 
// que receberá a transferência e a quantidade a ser transferida

public class Banco {
    
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    //add
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void sacar(String nomeTitular, double valor) {
        for (Conta conta : contas) {
            if (conta.getNomeTitular().equals(nomeTitular)) {
                if (conta.getSaldo() >= valor) {
                    conta.setSaldo(conta.getSaldo() - valor);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void depositar(String nomeTitular, double valor) {
        for (Conta conta : contas) {
            if (conta.getNomeTitular().equals(nomeTitular)) {
                conta.setSaldo(conta.getSaldo() + valor);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }


    public void transferir(String nomeTitularOrigem, String nomeTitularDestino, double valor) {
        Conta contaOrigem = null;
        Conta contaDestino = null;

        for (Conta conta : contas) {
            if (conta.getNomeTitular().equals(nomeTitularOrigem)) {
                contaOrigem = conta;
            } else if (conta.getNomeTitular().equals(nomeTitularDestino)) {
                contaDestino = conta;
            }
        }

        if (contaOrigem == null) {
            System.out.println("Conta de origem não encontrada.");
            return;
        }
        if (contaDestino == null) {
            System.out.println("Conta de destino não encontrada.");
            return;
        }
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Estado atual das contas:\n");
        for (Conta conta : contas) {
            sb.append(conta.toString()).append("\n");
        }
        return sb.toString();
    }
}
