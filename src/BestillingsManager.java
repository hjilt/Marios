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

    public Bestilling lavBestilling(String kundeNavn) {
        Kunde kunde = new Kunde(kundeNavn, false);
        Bestilling bestilling = new Bestilling(kunde,bestillingsID++);
        bestillinger.add(bestilling);
        return bestilling;
    }

    public void visAktive()
    {
        System.out.println("Aktive bestillinger: ");
        boolean aktiveBestillinger = false;
        for (Bestilling b : bestillinger) {
            if(!b.getErLavet())
            {
                b.udskrivOrdre();
                aktiveBestillinger = true;
            }
        }
        if(!aktiveBestillinger)
        {
            System.out.println("Ingen aktive bestillinger");
        }
    }
    public void visAfsluttede()
    {
        System.out.println("Afsluttede bestillinger: ");
        boolean afsluttedeBestillinger = false;
        for (Bestilling b : bestillinger) {
            if(b.getErLavet())
            {
                b.udskrivOrdre();
                afsluttedeBestillinger = true;
            }
        }
        if(!afsluttedeBestillinger)
        {
            System.out.println("Ingen afsluttede bestillinger");
        }
    }

    /*public boolean Bestilling(){
        if (getErLavet(true))
    }*/

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
