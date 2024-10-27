import java.util.Scanner;

public class PizzaApp {
    private static Scanner scanner = new Scanner(System.in);
    private static BestillingsManager bestillingsManager = new BestillingsManager();
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        boolean igang = true;
        while(igang)
        {
            int brugerValg = brugerValg();// Clear newline
            switch (brugerValg) {
                case 1:
                    lavOrdre();
                    break;
                case 2:
                    ordreFaerdig();
                    break;
                case 3:
                    visAktiveBestillinger();
                    break;
                case 4:
                    visFaerdigeBestillinger();
                    break;
                //Under visMenu skal der også være logik/muligheder for at tilføje og fjerne fra menuen
                case 5:
                    visMenu();
                    break;
                case 6:
                    visKunder();
                    break;
                case 7:
                    igang = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
    //Metode til at få brugerens input - sikrer at input er numerisk
    private static int brugerValg() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ugyldigt input, indtast et tal til menuen.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    private static void lavOrdre() {
        System.out.println("Angiv kundens navn: ");
        String kundeNavn = scanner.nextLine();
        scanner.nextLine();
        Bestilling bestilling = bestillingsManager.lavBestilling(kundeNavn);
        System.out.println("Angiv Pizza-nummer for at tilføje den til bestillingen - tryk 0 når ordren er færdig: ");
        int pizzaNummer;
        while((pizzaNummer = scanner.nextInt()) != 0)
        {
            Pizza valgtPizza = menu.pizzaListe.get(pizzaNummer);
            if(valgtPizza != null)
            {
                bestilling.addPizza(valgtPizza);
            }
            else
            {
                System.out.println("Ugyldig pizza, prøv igen");
            }
        }
        System.out.println("Bestillingen er lavet til: " + kundeNavn);
    }
}