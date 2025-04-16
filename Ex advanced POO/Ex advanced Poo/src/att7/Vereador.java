package att7;

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

public class Vereador {

    private String nome;
    private String partido;
    private int projetosApresentados;
    private int projetosAprovados;

    public double desempenho() {
        if (projetosApresentados == 0) {
            return 0.0;
        }
        
        double indiceTrabalho;
        if (projetosApresentados >= 1 && projetosApresentados <= 5) {
            indiceTrabalho = 0.80;
        } else if (projetosApresentados >= 6 && projetosApresentados <= 10) {
            indiceTrabalho = 1.00;
        } else if (projetosApresentados >= 11 && projetosApresentados <= 17) {
            indiceTrabalho = 1.08;
        } else {
            indiceTrabalho = 1.22;
        }
        
        return ((double) projetosAprovados / projetosApresentados) * indiceTrabalho;
    }

    //setts
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public void setProjetosApresentados(int projetosApresentados) {
        this.projetosApresentados = projetosApresentados;
    }
    public void setProjetosAprovados(int projetosAprovados) {
        this.projetosAprovados = projetosAprovados;
    }

    //getts
    public String getNome() {
        return nome;
    }
    public String getPartido() {
        return partido;
    }
    public int getProjetosApresentados() {
        return projetosApresentados;
    }
    public int getProjetosAprovados() {
        return projetosAprovados;
    }

    //cosntructor
    public Vereador(String nome, String partido, int projetosApresentados, int projetosAprovados) {
        this.nome = nome;
        this.partido = partido;
        this.projetosApresentados = projetosApresentados;
        this.projetosAprovados = projetosAprovados;
    }

    //toSring
    @Override
    public String toString() {
        return "Vereador [nome = " + nome + ", partido = " + partido + ", projetosApresentados = " + projetosApresentados
                + ", projetosAprovados = " + projetosAprovados + "]";
    }

    
}
