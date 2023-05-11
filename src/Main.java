public class Main {
    public static void main(String[] args) {
        Laptop acer = createObject("Acer");
        Laptop asus = createObject("Asus");
        Laptop macbook = createObject("Macbook");

        Laptop[]laptops = {acer, asus, macbook};
        for (Laptop laptop : laptops) {
            laptop.print();
        }
    }


    public static Laptop createObject(String className) {
        switch (className) {
            case "Acer":
                return new Acer("Acer", 256, "Grey");
            case "Asus":
                return new Asus("Asus", "ASUS Vivobook S 14 Flip OLED", 1.9);
            case "Macbook":
                return new Macbook("Macbook Air", 2021, 96500);
            default:
                throw new IllegalArgumentException("GXSHHGAH" + className);
        }

        }


    }


