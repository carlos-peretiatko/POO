package att2;

/*2)
Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente 
que comprou a flor e um boolean que determina se a flor é para presente ou não
Descubra:
a) Qual a flor mais cara?
b) Se a loja teve uma receita maior vendendo flores para presente ou não*/

public class Main {
    
    public static void main(String[] args) {
        
        Floricultura floricultura = new Floricultura();
        
        floricultura.adicionarFlores(new Flores("Rosa", 10.0, "João", true));
        floricultura.adicionarFlores(new Flores("Margarida", 5.0, "Maria", false));
        floricultura.adicionarFlores(new Flores("Girassol", 15.0, "Pedro", true));
        floricultura.adicionarFlores(new Flores("Tulipa", 8.0, "Ana", false));
        floricultura.adicionarFlores(new Flores("Orquídea", 20.0, "Carlos", true));
        

        System.out.println("A flor mais cara é: " + floricultura.florMaisCara());
        System.out.println(floricultura.compararReceitaPresente());

    }

}
