package att5;

public class Endereco {
    private String logradouro;
    private String complemento;
    private int numero;

    // Constructor
    public Endereco(String logradouro, String complemento, int numero) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
    }

    // Getters
    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getNumero() {
        return numero;
    }

    // Setters
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        } else {
            this.numero = numero;
        }
    }

    @Override
    public String toString() {
        return "Endereco [logradouro = " + logradouro + ", numero = " + numero +
                ", complemento = " + complemento + "]";
    }
}