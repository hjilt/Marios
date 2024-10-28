import java.util.ArrayList;

public class Kunde {
    private static int naesteKundeID = 1;
    String navn;
    int kundeID;
    boolean erFastKunde = false;
    private static ArrayList<Kunde> kunder = new ArrayList<>();

    public Kunde(String navn, boolean erFastKunde) {
    this.navn = navn;
    this.kundeID = naesteKundeID++;
    this.erFastKunde = erFastKunde;
    kunder.add(this);
    }

    public String getNavn() {
        return navn;
    }

    public int getKundeID() {
        return kundeID;
    }

    public static Kunde getKunde(int kundeID) {
        if(kundeID > 0 && kundeID < kunder.size()) {
            return kunder.get(kundeID - 1);
        }
        else
        {
            System.out.println("Kunden er ikke fundet, prøv igen");
            return null;
        }
    }

    public static void udskrivKunder()
    {
        for(Kunde k : kunder)
        {
            System.out.println("\nKundeID: " + k.getKundeID());
            System.out.println("Kundenavn: " + k.getNavn());
            System.out.println("Er fast: [" + (k.erFastKunde ? "X" : " ") + "]");
        }
    }
    public boolean isErFastKunde() {
        return erFastKunde;
    }
}
