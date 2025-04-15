package att3;

// Crie uma classe Empregado que terá como atributos:
// Identificação
// Nome
// Sobrenome
// Salário (mensal)
// Crie métodos para:
// Saber o salário anual do empregado
// Saber o nome completo do empregado
// Modificar o salário, o parâmetro do método deve ser o percentual de aumento

public class Empregado {

    private int identificacao;
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    

    //gets
    public int getIdentificacao() {
        return identificacao;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }

    //sets

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal <= 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    //cosntructor
    public Empregado(int identificacao, String nome, String sobrenome, double salarioMensal) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    //toString
    @Override
    public String toString() {
        return "Empregado [ identificacao = " + identificacao + ", nome = " + nome + ", sobrenome = " + sobrenome
                + ", salarioMensal = " + salarioMensal + " ]";
    }    
}
