package att3;

import java.util.ArrayList;

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

public class loja {
    
    private ArrayList<materiasDeConstrucao> materiais;

    public loja() {
        materiais = new ArrayList<>();
    }

    //add
    public void adicionarMaterial(materiasDeConstrucao material) {
        materiais.add(material);
    }

    //metodos pedidos
    public materiasDeConstrucao materialMaisCaro() {
        if (materiais.isEmpty()) {
            return null;
        } else {
            materiasDeConstrucao materialMaisCaro = materiais.get(0);
            for (materiasDeConstrucao material : materiais) {
                if (material.getPreco() > materialMaisCaro.getPreco()) {
                    materialMaisCaro = material;
                }
            }
            return materialMaisCaro;
        }
    }

    public materiasDeConstrucao materialMaisCaroPorMetroCubico() {
        if (materiais.isEmpty()) {
            return null;
        } else {
            materiasDeConstrucao materialMaisCaro = materiais.get(0);
            for (materiasDeConstrucao material : materiais) {
                if ((material.getPreco() / material.getVolume()) > (materialMaisCaro.getPreco() / materialMaisCaro.getVolume())) {
                    materialMaisCaro = material;
                }
            }
            return materialMaisCaro;
        }
    }

    public materiasDeConstrucao materialMaisDenso(){
        if (materiais.isEmpty()) {
            return null;
        } else {
            materiasDeConstrucao materialMaisDenso = materiais.get(0);
            for (materiasDeConstrucao material : materiais) {
                if ((material.getPeso() / material.getVolume()) > (materialMaisDenso.getPeso() / materialMaisDenso.getVolume())) {
                    materialMaisDenso = material;
                }
            }
            return materialMaisDenso;
        }
    }

    public materiasDeConstrucao materialQueMaisOcupaEspaco(){
        if (materiais.isEmpty()) {
            return null;
        } else {
            materiasDeConstrucao materialMaisEspaco = materiais.get(0);
            for (materiasDeConstrucao material : materiais) {
                if (material.getVolume() > materialMaisEspaco.getVolume()) {
                    materialMaisEspaco = material;
                }
            }
            return materialMaisEspaco;
        }
    }

}
