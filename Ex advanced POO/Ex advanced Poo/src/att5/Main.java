package att5;

public class Main {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco();

        banco.adicionarConta(new Conta("João", 1000.0));
        banco.adicionarConta(new Conta("Maria", 2000.0));
        banco.adicionarConta(new Conta("Pedro", 3000.0));

        System.out.println(banco.toString());

        banco.sacar("João", 500.0);
        banco.depositar("Maria", 1000.0);
        banco.transferir("Pedro", "João", 1500.0);

        System.out.println("-------------------------------------------\n");
        System.out.println(banco.toString());

    }

}
