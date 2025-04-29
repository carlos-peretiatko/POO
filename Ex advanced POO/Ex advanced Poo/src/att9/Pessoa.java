package att9;

import java.time.LocalDate;

public class Pessoa {
        private String nome;
        private LocalDate dataNascimento;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            
            this.dataNascimento = LocalDate.now().minusYears(idade);
        }

        public LocalDate getDataNascimento(){
            return dataNascimento;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
        
}
