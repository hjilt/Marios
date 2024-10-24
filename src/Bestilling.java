import java.util.ArrayList;

public class Bestilling {
    private ArrayList<Pizza> pizza =  new ArrayList<Pizza>();
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

    private void udregnPris() {
        totalPris = 0;
        for(Pizza pizzas : pizza)
            totalPris += pizzas.getPris();
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
        
    }
}
