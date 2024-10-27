import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Kunde kundeEt = new Kunde("Messi", 10);
        Bestilling bestillingEt = new Bestilling(kundeEt, 1);
        Kunde israfil = new Kunde("Israfil", 100);
        Menu menu = new Menu();
        Pizza hawaii = new Pizza("Hawaii", 79, "Anananananas brooo, skinke den helt gode");
        Pizza tun = new Pizza("Tun", 139, "Tun (Israfil's yndlings - han elsker det)");
        Pizza messi = new Pizza("Legend", 79, "Legend brooo, skinke den helt gode");

        menu.tilfoejPizza(hawaii);
        menu.tilfoejPizza(tun);


        System.out.println("\nMario's Pizza\n");
        menu.visMenu();
        System.out.println("\nFjerner 'Tun' pizza fra menuem");
        menu.fjernPizzaen("Tun");

        System.out.println("\nOpdateret menu");
        menu.visMenu();

        bestillingEt.addPizza(hawaii);
        bestillingEt.addPizza(messi);
        bestillingEt.addPizza(tun);
        bestillingEt.udskrivOrdre();
        bestillingEt.lavPizza();
        bestillingEt.udskrivOrdre();

        BestillingsManager bestillingsManager = new BestillingsManager();
        bestillingsManager.lavBestilling(israfil);



    }
}