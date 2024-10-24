public class Main {
    public static void main(String[] args) {

        Kunde kundeEt = new Kunde("Messi", 10);
        Bestilling bestillingEt = new Bestilling(kundeEt, 1);
        Pizza hawaii = new Pizza("Hawaii", 79, "Anananananas brooo, skinke den helt gode");
        Pizza tun = new Pizza("Tun", 139, "Tun (Israfil's yndlings - han elsker det)");
        bestillingEt.addPizza(hawaii);
        bestillingEt.addPizza(tun);
        bestillingEt.udskrivOrdre();
    }
}