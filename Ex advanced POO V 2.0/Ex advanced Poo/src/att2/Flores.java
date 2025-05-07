package att2;

/*2)
Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente 
que comprou a flor e um boolean que determina se a flor é para presente ou não
Descubra:
a) Qual a flor mais cara?
b) Se a loja teve uma receita maior vendendo flores para presente ou não*/

public class Flores  {
    
    private String nomeFlor;
    private double preco;
    private String nomeCliente;
    private boolean presente;

    //gets
    public String getNomeFlor() {
        return nomeFlor;
    }
    public double getPreco() {
        return preco;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public boolean isPresente() {
        return presente;
    }

    //sets
    public void setNomeFlor(String nomeFlor) {
        this.nomeFlor = nomeFlor;
    }
    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setPresente(boolean presente) {
        this.presente = presente;
    }
    
    //constructor
    public Flores(String nomeFlor, double preco, String nomeCliente, boolean presente) {
        this.nomeFlor = nomeFlor;
        setPreco(preco);
        this.nomeCliente = nomeCliente;
        this.presente = presente;
    }

    //toString
    @Override
    public String toString() {
        return "Flores [ nomeFlor = " + nomeFlor + ", preco = " + preco + ", nomeCliente = " + nomeCliente + ", presente = "
                + presente + " ]";
    }

}
