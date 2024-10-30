import java.util.ArrayList;
import java.util.*;

public class BestillingsManager {
    public ArrayList<Bestilling> bestillinger;
    private int bestillingsID;
    private int kundeID;

    public BestillingsManager()
    {
        bestillinger = new ArrayList<>();
        bestillingsID = 1;
        kundeID = 1;
    }

    public Bestilling lavBestilling(Kunde kunde) {
        Bestilling bestilling = new Bestilling(kunde,bestillingsID++);
        bestillinger.add(bestilling);
        return bestilling;
    }

    //lavOrdre, ordre søge funktion, fjern ordre, vis ordre, vis lavede ordre, vis ikke-færdige ordre
    //Lav en metode - søge-funktion, der returnerer en Bestilling - den skal tage parameteren ordreID.

    public void findBestilling(int ordreID) {
        boolean fundet = false;
        for (Bestilling bestilling : bestillinger) {
            if (ordreID == bestilling.getOrdreID()) {
                System.out.println("Ordre nr. " + ordreID + " indeholder: ");
                bestilling.udskrivOrdre();
                fundet = true;
                break;
            }
        }
            if (!fundet){
                System.out.println("Ordre nr. " + ordreID + " findes ikke... prøv igen.");
            }
    }
}
