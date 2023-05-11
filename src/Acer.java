public class Acer extends Laptop implements Printable {
    private int memory;
    private String color;

    public Acer(String name, int memory, String color) {
        super(name);
        this.memory = memory;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void print() {
        System.out.println("Название:" + getName() + " Память: "+ memory + " Цвет: " + color);
    }
}
