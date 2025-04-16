package att7;

import java.util.ArrayList;

// A Câmara Municipal de Vereadores de Blumenau pretende realizar uma estatística sobre o 
// desempenho dos seus parlamentares.
// Para cada um dos vereadores, ela possui o nome, partido, quantidade de projetos 
// apresentados e quantidade de projetos aprovados. 
// O desempenho é calculado da seguinte forma: 
// (projetos aprovados / projetos apresentados) * índice de trabalho. 
// Se não apresentou nenhum projeto, o desempenho é 0 (zero).
// O índice de trabalho é definido pela seguinte tabela:
// Projetos apresentados Índice de trabalho
// 01 – 05 0,80
// 06 – 10 1,00
// 11 – 17 1,08
// acima de 17 1,22
// Descubra:
// a) O total de projetos apresentados e de aprovados na câmara
// b) O vereador com mais projetos aprovados
// c) O vereador com maior desempenho
// d) Os vereadores cujo desempenho seja maior que o desempenho médio de toda a câmara

public class CamaraMunicipal {

    private ArrayList<Vereador> vereadores;

    public CamaraMunicipal() {
        vereadores = new ArrayList<>();
    }

    public void adicionarVereador(Vereador vereador) {
        vereadores.add(vereador);
    }

    public int totalProjetosApresentados() {
        int total = 0;
        for (Vereador vereador : vereadores) {
            total += vereador.getProjetosApresentados();
        }
        return total;
    }

    public int totalProjetosAprovados() {
        int total = 0;
        for (Vereador vereador : vereadores) {
            total += vereador.getProjetosAprovados();
        }
        return total;
    }

    public Vereador vereadorMaisProjetosAprovados() {
        Vereador vereadorMaisAprovados = null;
        for (Vereador vereador : vereadores) {
            if (vereadorMaisAprovados == null
                    || vereador.getProjetosAprovados() > vereadorMaisAprovados.getProjetosAprovados()) {
                vereadorMaisAprovados = vereador;
            }
        }
        return vereadorMaisAprovados;
    }

    public Vereador vereadorMaiorDesempenho() {
        Vereador vereadorMaiorDesempenho = null;
        for (Vereador vereador : vereadores) {
            if (vereadorMaiorDesempenho == null || vereador.desempenho() > vereadorMaiorDesempenho.desempenho()) {
                vereadorMaiorDesempenho = vereador;
            }
        }
        return vereadorMaiorDesempenho;
    }

    public ArrayList<Vereador> vereadoresAcimaDesempenhoMedio() {
        ArrayList<Vereador> vereadoresAcimaMedio = new ArrayList<>();
        double desempenhoMedio = 0;
        for (Vereador vereador : vereadores) {
            desempenhoMedio += vereador.desempenho();
        }
        desempenhoMedio /= vereadores.size();

        for (Vereador vereador : vereadores) {
            if (vereador.desempenho() > desempenhoMedio) {
                vereadoresAcimaMedio.add(vereador);
            }
        }
        return vereadoresAcimaMedio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Câmara Municipal:\n");
        for (Vereador vereador : vereadores) {
            sb.append(vereador.toString()).append("\n");
        }
        return sb.toString();
    }
}
