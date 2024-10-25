import java.util.ArrayList;

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
}
