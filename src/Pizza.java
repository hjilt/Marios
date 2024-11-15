public class Pizza {
    String navn;
    double pris;
    String beskrivelse;
    private static int nextPizzaNr = 1;
    int pizzaNr;

    public Pizza(String navn, double pris, String beskrivelse) {
        this.navn = navn;
        this.pris = pris;
        this.beskrivelse = beskrivelse;
        this.pizzaNr = nextPizzaNr++;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
