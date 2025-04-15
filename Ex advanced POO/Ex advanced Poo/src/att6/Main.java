package att6;

public class Main {
    public static void main(String[] args) {
        Bairro bairro = new Bairro();

        bairro.adicionarPessoa(new Pessoa("João", new Endereco("Rua A", "Casa", 123)));
        bairro.adicionarPessoa(new Pessoa("Maria", new Endereco("Rua B", "Apartamento", 456)));
        bairro.adicionarPessoa(new Pessoa("Pedro", new Endereco("Rua C", "Sobrado", 789)));

        System.out.println(bairro.toString());
    }
}