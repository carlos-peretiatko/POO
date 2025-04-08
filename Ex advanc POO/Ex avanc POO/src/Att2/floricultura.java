package Att2;

//2)
//Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente
//que comprou a flor e um boolean que determina se a flor é para presente ou não
//Descubra:

//a) Qual a flor mais cara?

//b) Se a loja teve uma receita maior vendendo flores para presente ou não


public class floricultura {
    
    private String nomeFlor;
    private double precoFlor;
    private String nomeCliente;
    private boolean presente;

    public floricultura(String nomeFlor, double precoFlor, String nomeCliente, boolean presente) {
        this.nomeFlor = nomeFlor;
        this.precoFlor = precoFlor;
        this.nomeCliente = nomeCliente;
        this.presente = presente;
    }

    

    

    public String getNomeFlor() {
        return nomeFlor;
    }

    public double getPrecoFlor() {
        return precoFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public boolean isPresente() {
        return presente;
    }

    @Override
    public String toString() {
        return "Flor: " + nomeFlor + ", Preço: " + precoFlor + ", Cliente: " + nomeCliente + ", Presente: " + (presente ? "Sim" : "Não");
    }
}