package att6;

import java.util.ArrayList;

public class Bairro {
    
    private ArrayList<Pessoa> pessoas;

    public Bairro() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Moradores do bairro:\n");
        for (Pessoa pessoa : pessoas) {
            sb.append(pessoa.toString()).append("\n");
        }
        return sb.toString();
    }
}