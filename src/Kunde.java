public class Kunde {
    String navn;
    int kundeID;
    boolean erFastKunde;

    public Kunde(String navn, int kundeID) {
    this.navn = navn;
    this.kundeID = kundeID;
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
