import java.io.*;
import java.util.*;

public class KundePersistens {

    public void hentKunderFraCSV(String filNavn) {
        try (BufferedReader br = new BufferedReader(new FileReader(filNavn))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] kundeData = line.split(";");
                if (kundeData.length == 2) {
                    String navn = kundeData[0];
                    boolean erFastKunde = Boolean.parseBoolean(kundeData[1]);
                    new Kunde(navn, erFastKunde);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
