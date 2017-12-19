package candyShop2;

public class Eclair extends Sweets{
    private String glaze;

    public Eclair (){}

    public Eclair(String glaze) {
        this.glaze = glaze;
    }

    public Eclair(String name, float weight, float price, String glaze) {
        super(name, weight, price);
        this.glaze = glaze;
    }

    public String getGlaze() {
        return glaze;
    }

    public void setGlaze(String glaze) {
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return "Eclair (" + super.toString() + ", glaze: " + glaze + ")";
    }
}
