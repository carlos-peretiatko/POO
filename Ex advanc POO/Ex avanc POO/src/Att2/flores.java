package Att2;

import java.util.List;
import java.util.ArrayList;

public class flores {
    
    private List<String> listaflores;

    public flores() {
        listaflores = new ArrayList<String>();
    }

    //flor mais cara
    public static floricultura florMaisCara(floricultura[] flores) {
        if (flores == null || flores.length == 0) {
            throw new IllegalArgumentException("A lista de flores não pode ser nula ou vazia.");
        }
    
        floricultura maisCara = flores[0];
    
        for (int i = 1; i < flores.length; i++) {
            if (flores[i].getPrecoFlor() > maisCara.getPrecoFlor()) {
                maisCara = flores[i];
            }
        }
        return maisCara;
    }

    //receita maior
    public static double receitaMaior(floricultura[] flores) {
        if (flores == null || flores.length == 0) {
            throw new IllegalArgumentException("A lista de flores não pode ser nula ou vazia.");
        }
    
        double receitaPresente = 0;
        double receitaNaoPresente = 0;
    
        for (floricultura flor : flores) {
            if (flor.isPresente()) {
                receitaPresente += flor.getPrecoFlor();
            } else {
                receitaNaoPresente += flor.getPrecoFlor();
            }
        }
        return Math.max(receitaPresente, receitaNaoPresente);
    }

}
