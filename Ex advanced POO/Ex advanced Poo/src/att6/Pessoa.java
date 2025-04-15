package att6;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    
    // Constructor
    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Pessoa [nome = " + nome + ", endereco = " + endereco + "]";
    }
}