package att3Antiga;

public class Main {

    public static void main(String[] args) {
        Empregados empregados = new Empregados();

        empregados.adicionarEmpregado(new Empregado(1, "João", "Silva", 2000.0));
        empregados.adicionarEmpregado(new Empregado(2, "Maria", "Santos", 2500.0));
        empregados.adicionarEmpregado(new Empregado(3, "Pedro", "Oliveira", 3000.0));

        System.out.println("Salário anual do empregado 1: " + empregados.salarioAnual(1));
        System.out.println("Nome completo do empregado 2: " + empregados.nomeCompleto(2));
        empregados.modificarSalario(3, 10);
        System.out.println("Novo salário do empregado 3: " + empregados.salarioAnual(3));
        empregados.modificarSalario(3, -10); // Deve lançar uma exceção

    }

}
