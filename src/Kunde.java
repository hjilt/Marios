import java.util.ArrayList;

public class Kunde {
    private static int naesteKundeID = 1;
    String navn;
    int kundeID;
    boolean erFastKunde = false;
    private ArrayList<Kunde> kunder = new ArrayList<>();

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

    public boolean isErFastKunde() {
        return erFastKunde;
    }

}
