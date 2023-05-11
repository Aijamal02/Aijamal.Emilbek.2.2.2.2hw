public abstract class Laptop implements Printable {
    private String name;

    public Laptop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {

    }
}

