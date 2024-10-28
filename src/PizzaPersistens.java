import java.util.*;
import java.io.*;
public class PizzaPersistens {
    private Menu menu;

    public PizzaPersistens(Menu menu) {
        this.menu = menu;
    }

    public void hentPizzasFromCSV(String filNavn) {
        try (BufferedReader br = new BufferedReader(new FileReader(filNavn))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split each line by the ';' delimiter
                String[] pizzaData = line.split(";");
                if (pizzaData.length == 3) {
                    String navn = pizzaData[0];
                    double pris = Double.parseDouble(pizzaData[1]);
                    String beskrivelse = pizzaData[2];
                    // Create and add Pizza to Menu
                    Pizza pizza = new Pizza(navn, pris, beskrivelse);
                    menu.tilfoejPizza(pizza);  // Directly add to Menu's pizzaListe
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
