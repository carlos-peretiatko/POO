package att7;

// b) um método para retornar o número X multiplicado por outro objeto de InteiroPositivo
// c) um método para calcular o fatorial de X
// Fatorial (X) = X * (X-1) * (X-2) * (X-3) * … * 2 * 1
// d) um método para identificar os divisores inteiros de X e a quantidade de divisores.Exemplo: 
// para o número 12, os divisores são 1, 2, 3, 4, 6, 12 e a quantidade de divisores é 6
// e) um método para calcular a série de Fibonacci formada por X elemento
// Fibonacci = 1, 1, 2, 3, 5, 8, 13, …

import java.util.ArrayList;

public class Matematico {
    
    private ArrayList<Num> numeros = new ArrayList<>();

    //add
    public void adicionarNumero(Num num) {
        numeros.add(num);
    }

    //um método para retornar o número X multiplicado por outro objeto de InteiroPositivo
    public int multiplicar(Num num1, Num num2) {
        return num1.getNum() * num2.getNum();
    }

    //um método para calcular o fatorial de X
    // Fatorial (X) = X * (X-1) * (X-2) * (X-3) * … * 2 * 1
    public int fatorial(Num num) {
        int resultado = 1;
        for (int i = 1; i <= num.getNum(); i++) {
            resultado *= i;
        }
        return resultado;
    }

    //um método para identificar os divisores inteiros de X e a quantidade de divisores.
    //Exemplo: 
    //para o número 12, os divisores são 1, 2, 3, 4, 6, 12 e a quantidade de divisores é 6
    public ArrayList<Integer> divisores(Num num) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= num.getNum(); i++) {
            if (num.getNum() % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    //um método para calcular a série de Fibonacci formada por X elemento
    //Fibonacci = 1, 1, 2, 3, 5, 8, 13, …
    public ArrayList<Integer> fibonacci(Num num) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < num.getNum(); i++) {
            fibonacci.add(b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        return fibonacci;
    }

}
