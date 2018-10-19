class Fruit {

    private String name;
    private double price;

    Fruit(String name, double price) {
        setName(name);
        setPrice(price);
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
}
