package att9;

import java.util.ArrayList; // Importa ArrayList para armazenar pessoas
import java.util.List;      // Importa List para o tipo da lista

public class Familia {

    // Declara uma lista para armazenar objetos Pessoa
    private List<Pessoa> listaPessoas;

    // Construtor: inicializa a lista como um novo ArrayList vazio
    public Familia() {
        this.listaPessoas = new ArrayList<>();
    }

    // Método para adicionar uma pessoa à lista
    public void adicionarPessoas(Pessoa pessoa) {
        listaPessoas.add(pessoa); // Adiciona a pessoa recebida à lista
    }

    // Método para encontrar e retornar a pessoa mais velha da família
    public Pessoa pessoaMaisVelha() {
        if (listaPessoas.isEmpty()) {
            return null; // Retorna null se a lista estiver vazia
        }
        Pessoa maisVelha = listaPessoas.get(0); // Assume que a primeira é a mais velha
        for (Pessoa p : listaPessoas) {
            // Compara as datas de nascimento: se p nasceu antes, ela é mais velha
            if (p.getDataNascimento().isBefore(maisVelha.getDataNascimento())) {
                maisVelha = p;
            }
        }
        return maisVelha; // Retorna a pessoa mais velha encontrada
    }
}