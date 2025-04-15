package att4;

// Descubra:
// a) Qual o material mais caro
// b) Qual o material mais caro por metro cúbico
// c) Qual o material mais denso
// d) Qual o material que mais ocupa espaço no estoque


public class Main {

    public static void main(String[] args) {
        
        loja loja = new loja();

        loja.adicionarMaterial(new materiasDeConstrucao("Cimento", "Cimento Portland", 25.0, 0.5, 1.5, 100));
        loja.adicionarMaterial(new materiasDeConstrucao("Areia", "Areia fina", 15.0, 0.3, 1.2, 200));
        loja.adicionarMaterial(new materiasDeConstrucao("Brita", "Brita 1", 30.0, 0.7, 1.8, 150));
        loja.adicionarMaterial(new materiasDeConstrucao("Tijolo", "Tijolo cerâmico", 0.5, 0.01, 0.5, 500));

        System.out.println("Material mais caro: " + loja.materialMaisCaro());
        System.out.println("Material mais caro por m³: " + loja.materialMaisCaroPorMetroCubico());
        System.out.println("Material mais denso: " + loja.materialMaisDenso());
        System.out.println("Material que mais ocupa espaço: " + loja.materialQueMaisOcupaEspaco());

    }
    
}
