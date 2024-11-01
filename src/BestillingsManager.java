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

    //Lav en metode - søge-funktion, der returnerer en Bestilling - den skal tage parameteren ordreID.

    public void findBestilling(int ordreID) {
        boolean fundet = false;
        for (Bestilling bestilling : bestillinger) {
            //Tjekker hele bestilling arrayet igennem, for at se om der er en bestilling med matchende OrdreID
            if (ordreID == bestilling.getOrdreID()) {
                System.out.println("Ordre nr. " + ordreID + " indeholder: ");
                bestilling.udskrivOrdre(); //Printer selve ordren ud, hvis den er fundet
                //Henter udskrivnings funktionen fra klassen "Bestilling.java"
                fundet = true;
                break;
            }
        }
            if (!fundet){
                System.out.println("Ordre nr. " + ordreID + " findes ikke... prøv igen.");
            }
    }
}
