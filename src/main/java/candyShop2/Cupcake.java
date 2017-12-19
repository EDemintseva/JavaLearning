package candyShop2;

public class Cupcake extends Sweets {
    private String taste;

    public Cupcake(){}

    public Cupcake(String taste) {
        this.taste = taste;
    }

    public Cupcake(String name, float weight, float price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Cupcake (" + super.toString() + ", taste: " + taste + ")";
    }
}
