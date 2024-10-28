import java.util.ArrayList;

public class Bestilling {
    private ArrayList<Pizza> pizza;
    private Kunde kunde;
    private int ordreID;
    private double totalPris;
    private boolean erLavet;

    public Bestilling(Kunde kunde, int ordreID) {
        this.kunde = kunde;
        this.ordreID = ordreID;
        this.pizza = new ArrayList<>();
        this.totalPris = 0;
        this.erLavet = false;
    }

    public void addPizza(Pizza pizza)
    {
        this.pizza.add(pizza);
        udregnPris();
    }

    public int getOrdreID() {
        return ordreID;
    }

    public double udregnPris() {
        totalPris = 0;
        for(Pizza pizzas : pizza)
            totalPris += pizzas.getPris();
        return totalPris;
    }

    public void lavPizza() {
        erLavet = true;
    }

    public boolean getErLavet()
    {
        return erLavet;
    }

    public void udskrivOrdre()
    {
        System.out.println("\nOrdre ID: " + ordreID);
        for(Pizza pizza : pizza)
        {
            System.out.println(pizza.getNavn());
        }
        System.out.println("Total pris: " + totalPris + "DKK");
        System.out.println("Ordre færdiggjort: [" + (erLavet ? "X" : " ") + "]");
        System.out.println("Kunde: " + this.kunde.getNavn());
    }
}
