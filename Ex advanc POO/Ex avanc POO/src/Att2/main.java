package Att2;

public class main {
    
    public static void main(String[] args) {

        flores flores = new flores();

        floricultura flor1 = new floricultura("Rosa", 10.0, "João", true);
        floricultura flor2 = new floricultura("Margarida", 5.0, "Maria", false);
        floricultura flor3 = new floricultura("Girassol", 15.0, "Pedro", true);
        floricultura flor4 = new floricultura("Tulipa", 8.0, "Ana", false);
        
        System.out.println(flor1);
        System.out.println(flor2);
        System.out.println(flor3);
        System.out.println(flor4);

        System.out.println(flores.florMaisCara(new floricultura[]{flor1, flor2, flor3, flor4}));
        System.out.println(flores.receitaMaior(new floricultura[]{flor1, flor2, flor3, flor4}));
        
    }

}
