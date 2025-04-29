package att3Antiga;

import java.util.ArrayList;

public class Empregados {

    private ArrayList<Empregado> empregados;

    public Empregados() {
        empregados = new ArrayList<>();
    }

    // add
    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    // metodos
    public double salarioAnual(int identificacao) {
        for (Empregado empregado : empregados) {
            if (empregado.getIdentificacao() == identificacao) {
                return empregado.getSalarioMensal() * 12;
            }
        }
        throw new IllegalArgumentException("Empregado não encontrado");
    }

    public String nomeCompleto(int identificacao) {
        for (Empregado empregado : empregados) {
            if (empregado.getIdentificacao() == identificacao) {
                return empregado.getNome() + " " + empregado.getSobrenome();
            }
        }
        throw new IllegalArgumentException("Empregado não encontrado");
    }

    public void modificarSalario(int identificacao, double percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException("O percentual não pode ser negativo.");
        }

        for (Empregado empregado : empregados) {
            if (empregado.getIdentificacao() == identificacao) {
                double novoSalario = empregado.getSalarioMensal() +
                        (empregado.getSalarioMensal() * (percentual / 100));
                empregado.setSalarioMensal(novoSalario);
                return;
            }
        }
        throw new IllegalArgumentException("Empregado não encontrado");
    }

}
