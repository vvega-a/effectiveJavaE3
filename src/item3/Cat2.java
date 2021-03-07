package item3;

public class Cat2 {
    public static final Cat2 INSTANCE = new Cat2();

    private Cat2() { }

    public static Cat2 getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return "Bada2";
    }
}