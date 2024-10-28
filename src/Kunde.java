import java.util.*;
public class Kunde {
    private static ArrayList<Kunde> kunder = new ArrayList<>();
    String navn;
    int kundeID;
    boolean erFastKunde;

    public Kunde(String navn, int kundeID) {
    this.navn = navn;
    this.kundeID = kundeID;
    this.erFastKunde = false;

    }
    public String getNavn() {
        return navn;
    }

    public int getKundeID() {
        return kundeID;
    }

    public boolean isErFastKunde() {
        return erFastKunde;
    }

    public static void tilfoejKunde(String navn) {
        int kundeID = kunder.size() + 1;
        Kunde nyKunde = new Kunde(navn, kundeID);
        System.out.println("Ny kunde tilføjet: " + nyKunde.getNavn() + " med kundeID: " + nyKunde.getKundeID());
    }

    public static Kunde findKunde(int kundeID) {
        for (Kunde kunde : kunder) {
            if (kunde.getKundeID() == kundeID) {
                return kunde;
            }
        }
        return null;
    }
    @Override String toString() {
        return "Kunde Navn: " + navn + ", kundeID: " + kundeID +", Fast Kunde: " + erFastKunde;
    }

}
