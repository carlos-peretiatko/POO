package att8;

public class Main {
    
    public static void main(String[] args) {
        
        Matematico matematico = new Matematico();

        Num num1 = new Num(21);
        Num num2 = new Num(10);
        
        //Num num1 = new Num(-9); //número inválido
        //Num num2 = new Num(0)

        // Adicionar números ao matemático
        //redundante
        matematico.adicionarNumero(num1);
        matematico.adicionarNumero(num2);
        
        // Testando multiplicação
        System.out.println("Multiplicação: " + matematico.multiplicar(num1, num2));
        
        // Testando fatorial
        System.out.println("Fatorial de " + num1.getNum() + ": " + matematico.fatorial(num1));
        
        // Testando divisores
        System.out.println("Divisores de " + num1.getNum() + ": " + matematico.divisores(num1));
        
        // Testando Fibonacci
        System.out.println("Série Fibonacci com " + num2.getNum() + " elementos: " + matematico.fibonacci(num2));

    }

}
