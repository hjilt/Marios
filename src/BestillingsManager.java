import java.util.ArrayList;
import java.util.*;

public class BestillingsManager {
    private ArrayList<Bestilling> bestillinger;
    private int bestillingsID;
    private int kundeID;
    public BestillingsManager()
    {
        bestillinger = new ArrayList<>();
        bestillingsID = 0;
        kundeID = 1;
    }

    public Bestilling lavBestilling(String kundeNavn) {
        Kunde kunde = new Kunde(kundeNavn, kundeID++);
        Bestilling bestilling = new Bestilling(kunde,bestillingsID++);
        bestillinger.add(bestilling);
        return bestilling;
    }

    /*public boolean Bestilling(){
        if (getErLavet(true))
    }*/

    //lavOrdre, ordre søge funktion, fjern ordre, vis ordre, vis lavede ordre, vis ikke-færdige ordre
    //Lav en metode - søge-funktion, der returnerer en Bestilling - den skal tage parameteren ordreID.

    public static void findBestilling(ArrayList<Bestilling> bestillinger, int ordreID) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Søg efter ordrenummer: ");
        int inputTal = sc.nextInt();

        for (Bestilling bestilling : bestillinger) {
            if (bestillinger.contains(inputTal)) {
                System.out.println("Ordre nr. " + inputTal + " indeholder: ");
            } else {
                System.out.println("Ordre nr. " + inputTal + " findes ikke... prøv igen.");
            }
        }
    }
}
