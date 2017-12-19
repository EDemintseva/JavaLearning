package candyShop2;

public class Donut extends Sweets {
    private char size;

    public Donut(){}

    public Donut(char size) {
        this.size = size;
    }

    public Donut(String name, float weight, float price, char size) {
        super(name, weight, price);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Donut (" + super.toString() + ", size: " + size + ")";
    }
}
