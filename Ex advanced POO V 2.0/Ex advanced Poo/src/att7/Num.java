package att7;

public class Num {
    
    private int num;

    //get
    public int getNum() {
        return num;
    }

    //sett
    public void setNum(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("O número deve ser maior que zero");
        } else {
            this.num = num;
        }
    }

    //constructor
    public Num(int num) {
        this.num = num;
    }

    //toString
    @Override
    public String toString() {
        return "Num [num=" + num + "]";
    }
}
