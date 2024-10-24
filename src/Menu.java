import java.util.ArrayList;

public class Menu {
    private ArrayList<Pizza> pizzaListe;

    public Menu() {
        pizzaListe = new ArrayList<>();
    }

    public void tilfoejPizza(Pizza pizza) {
        pizzaListe.add(pizza);
    }

    public void fjernPizzaen(String navn) {
        boolean fundet = false;
        for (int i = 0; i < pizzaListe.size(); i++) {
            if (pizzaListe.get(i).getNavn().equals(navn)) {
                pizzaListe.remove(i);
                System.out.println(navn + " er blevet fjernet");
                fundet = true;
                break;
            }
        }
        if (!fundet) {
            System.out.println(navn + " er ikke en del af menuen");
        }
    }

    public void visMenu() {
        if (pizzaListe.isEmpty()) {
            System.out.println("Menuen er tom.");
        } else {
            System.out.println("Menu:");
            for (Pizza pizza : pizzaListe) {
                System.out.println("Navn: " + pizza.getNavn());
                System.out.println("Pris: " + pizza.getPris() + " ,- DKK");
                System.out.println("Beskrivelse: " + pizza.getBeskrivelse());
                System.out.println("----------------------------");
            }
        }
    }
}