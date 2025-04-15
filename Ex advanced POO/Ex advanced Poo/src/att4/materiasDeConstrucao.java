package att4;

// Crie um sistema para uma loja de materiais de construção
// Os objetos terão os atributos:
// Nome, descrição, preço, volume (tamanho), peso e quantidade em estoque
// Crie métodos para:
// Adicionar mais unidades da peça ao estoque
// Vender um produto, podendo ser vendido até o mesmo número de peças que tem no estoque
// Colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto
// Descubra:
// a) Qual o material mais caro
// b) Qual o material mais caro por metro cúbico
// c) Qual o material mais denso
// d) Qual o material que mais ocupa espaço no estoque

public class materiasDeConstrucao {
    
    private String nome;
    private String descricao;
    private double preco;
    private double volume;
    private double peso;
    private int quantidadeEstoque;

    //gets
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
    public double getVolume() {
        return volume;
    }
    public double getPeso() {
        return peso;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    //sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso não pode ser negativo.");
        } else {
            this.peso = peso;
        }
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // constructor
    public materiasDeConstrucao(String nome, String descricao, double preco, double volume, double peso,
        int quantidadeEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //to String
    @Override
    public String toString() {
        return "materiasDeConstrucao [ nome = " + nome + ", descricao = " + descricao + ", preco = " + preco + ", volume = "
                + volume + ", peso = " + peso + ", quantidadeEstoque = " + quantidadeEstoque + " ]";
    }

    
    
    

}
