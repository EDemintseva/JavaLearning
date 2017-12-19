package candyShop2;

public abstract class Sweets {
    private String name;
    private float weight;
    private float price;

    public Sweets(){}

    public Sweets(String name, float weight, float price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "name: " + name + ", weight: " + weight + ", price: " + price;
    }
}