package att8;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.adicionarComputador(new Computador("SN001", "Intel Core i7-13700KF", 5.4, 512, 16, 500, 850));
        cadastro.adicionarComputador(new Computador("SN002", "AMD Ryzen 9 5950X", 4.9, 1000, 32, 500, 1000));
        cadastro.adicionarComputador(new Computador("SN003", "Intel Core i5-9400F", 4.1, 256, 8, 400, 600));
        cadastro.adicionarComputador(new Computador("SN004", "AMD Ryzen 7 3700X", 4.4, 512, 16, 450, 550));
   
        System.out.println("Armazenamento total: " + cadastro.armazenamentoTotal() + " GB"); // Exibe o armazenamento total
        System.out.println("Memória RAM total: " + cadastro.memoriaRamTotal() + " GB"); // Exibe a memória RAM total
        System.out.println("Consumo total: " + cadastro.consumoTotal() + " W"); // Exibe o consumo total
        System.out.println("Potência mínima do circuito elétrico: " + cadastro.potenciaMinimaCircuitoEletrico() + " W"); // Exibe a potência mínima do circuito elétrico
        System.out.println("Gasto de energia mensal: " + cadastro.gastoEnergiaMensal() + " KWh"); // Exibe o gasto de energia mensal
    }
}