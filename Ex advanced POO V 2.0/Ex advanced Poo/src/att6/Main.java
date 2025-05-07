package att6;

public class Main {
    public static void main(String[] args) {
        CamaraMunicipal camara = new CamaraMunicipal();
        
        camara.adicionarVereador(new Vereador("João", "Partido A", 15, 10));
        camara.adicionarVereador(new Vereador("Maria", "Partido B", 20, 15));
        camara.adicionarVereador(new Vereador("Pedro", "Partido C", 8, 5));
        
        System.out.println("Total de projetos apresentados: " + camara.totalProjetosApresentados());
        System.out.println("Total de projetos aprovados: " + camara.totalProjetosAprovados());
        System.out.println("Vereador com mais projetos aprovados: " + camara.vereadorMaisProjetosAprovados());
        System.out.println("Vereador com maior desempenho: " + camara.vereadorMaiorDesempenho());
        System.out.println("Vereadores acima da média: " + camara.vereadoresAcimaDesempenhoMedio());
    }
}