import java.util.ArrayList;
import java.util.*;

public class BestillingsManager {
    private ArrayList<Bestilling> bestillinger;
    private int bestillingsID;
    public BestillingsManager()
    {
        bestillinger = new ArrayList<>();
        bestillingsID = 0;
    }

    public Bestilling lavBestilling(Kunde kunde) {
        Bestilling bestilling = new Bestilling(kunde,bestillingsID++);
        bestillinger.add(bestilling);
        return bestilling;
    }

    //lavOrdre, ordre søge funktion, fjern ordre, vis ordre, vis lavede ordre, vis ikke-færdige ordre
    //Lav en metode - søge-funktion, der returnerer en Bestilling - den skal tage parameteren ordreID.
    public void soege(ArrayList<Bestilling> bestillinger) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Søg efter ordrenummer: ");
        int inputTal = sc.nextInt();

        if (bestillinger.contains(inputTal)) {
            System.out.println("Ordre nr. " + inputTal + " indeholder: ");
        } else {
            System.out.println("Ordre nr. " + inputTal + " findes ikke... prøv igen.");
        }
    }
}
