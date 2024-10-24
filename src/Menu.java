import java.util.ArrayList;

public class Menu {
    private ArrayList<Pizza> pizzaListe;

    public Menu() {
        pizzaListe = new ArrayList<>();
    }

    public void tilfoejPizza(Pizza pizza) {
        pizzaListe.add(pizza);
    }

    public void visMenu() {
        System.out.println("Menu");
        for (Pizza pizza : pizzaListe) {
            System.out.println("Navn: " + pizza.getNavn());
            System.out.println("Pris: " + pizza.getPris() + " ,- DKK");
            System.out.println("Beskrivelse: " + pizza.getBeskrivelse());
        }
    }
}