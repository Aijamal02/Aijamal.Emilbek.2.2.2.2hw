public class Asus extends Laptop implements Printable {
    private String model;
    private double weight;

    public Asus(String name, String model, double weight) {
        super(name);
        this.model = model;
        this.weight=weight;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Название:" + getName() + " Модель: " + model + " Вес:" + weight);
    }
}
