public class Macbook extends Laptop implements Printable {
private int year;
private int price;

    public Macbook(String name, int year, int price) {
        super(name);
        this.year = year;
        this.price=price;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void print(){
        System.out.println("Название:" + getName() + " Год выпуска: " + year + " Цена: " + price );
    }
}

