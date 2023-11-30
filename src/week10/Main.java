package week10;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.96);
        hamburger.addHamburgerAddition2("Lettuce", 0.66);
        hamburger.addHamburgerAddition3("Cheese", 1.91);
        System.out.println("Total cost: $" + hamburger.itemizeHamburger());
    }

}