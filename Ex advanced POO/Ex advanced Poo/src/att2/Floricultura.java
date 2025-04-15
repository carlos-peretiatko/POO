package att2;

import java.util.ArrayList;

/*2)
Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente 
que comprou a flor e um boolean que determina se a flor é para presente ou não
Descubra:
a) Qual a flor mais cara?
b) Se a loja teve uma receita maior vendendo flores para presente ou não*/

public class Floricultura {

    private ArrayList<Flores> flores;

    public Floricultura() {
        flores = new ArrayList<>();
    }

    public void adicionarFlores(Flores flor) {
        flores.add(flor);
    }

    public Flores florMaisCara() {
        if (flores.isEmpty()) {
            return null;
        } else {
            Flores florMaisCara = flores.get(0);
            for (Flores flor : flores) {
                if (flor.getPreco() > florMaisCara.getPreco()) {
                    florMaisCara = flor;
                }
            }
            return florMaisCara;
        }
    }

    public String compararReceitaPresente() {

        double receitaPresente = 0;
        double receitaNormal = 0;

        for (Flores flor : flores) {
            if (flor.isPresente()) {
                receitaPresente += flor.getPreco();
            } else {
                receitaNormal += flor.getPreco();
            }
        }

        if(receitaPresente > receitaNormal){
            return "A loja teve uma receita maior vendendo flores para presente.";
        } else if(receitaPresente < receitaNormal){
            return "A loja teve uma receita maior vendendo flores normais.";
        } else {
            return "A loja teve a mesma receita vendendo flores para presente e normais.";
        }

    }

}
