import java.util.Scanner;

public class PizzaApp {
    private static Scanner scanner = new Scanner(System.in);
    private static BestillingsManager bestillingsManager = new BestillingsManager();
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        boolean igang = true;
        Pizza tun = new Pizza("Napolitana", 100, "æg og løg");
        Pizza majs = new Pizza("Dynamit", 129, "æfeg");
        menu.tilfoejPizza(tun);
        menu.tilfoejPizza(majs);

        System.out.println("Velkommen til Tarik's minions PizzaApp!");
        while(igang)
        {
            visMuligheder();
            //Switch statement - styres vha brugerValg (på den måde kan brugeren inputte en case)
            int brugerValg = brugerValg();
            switch (brugerValg) {
                case 1:
                    lavOrdre();
                    break;
                /*case 2:
                    ordreFaerdig();
                    break;*/
                case 3:
                    bestillingsManager.visAktive();
                    break;
                /*case 4:
                    visFaerdigeBestillinger();
                    break;*/
                //Under visMenu skal der også være logik/muligheder for at tilføje og fjerne fra menuen
                case 5:
                    findOrdrer();
                    break;
                    /*
                case 6:
                    visMenu();
                    break;
                case 7:
                    visKunder();
                    break;
                case 8:
                    igang = false;
                    break;*/
                default:
                    System.out.println("Ugyldigt valg - vælg en anden mulighed.");
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
    //Logikken for at lave ordren
    private static void lavOrdre() {
        System.out.println("Angiv kundens navn: ");
        scanner.nextLine();
        //Opretter bestillingen som objekt
        String kundeNavn = scanner.nextLine();
        Bestilling bestilling = bestillingsManager.lavBestilling(kundeNavn);
        //Tilføjer pizzaer til objektet
        System.out.println("Angiv Pizza-nummer for at tilføje den til bestillingen - tryk 0 når ordren er færdig: ");
        while(true)
        {
            if(scanner.hasNextInt()) {
                int pizzaNummer = scanner.nextInt();
                if (pizzaNummer == 0)
                    break;
                if (pizzaNummer > 0 && pizzaNummer <= menu.pizzaListe.size()) {
                    Pizza valgtPizza = menu.pizzaListe.get(pizzaNummer - 1);
                    bestilling.addPizza(valgtPizza);
                    System.out.println("Tilføjet " + valgtPizza.getNavn() + " til bestillingen.");
                } else {
                    System.out.println("Ugyldigt pizza-nummer, prøv igen.");
                }
            }
        }
        System.out.println("Bestillingen er lavet til: " + kundeNavn + ". Pris: " + bestilling.udregnPris());
    }

    private static void findOrdrer()
    {
        BestillingsManager bestillingsManager = new BestillingsManager();
        int ordreID = scanner.nextInt();
        bestillingsManager.findBestilling(ordreID);
    }

    //Bliver kaldt i main, og printer menu
    private static void visMuligheder()
    {
        System.out.println("\n1: Ny ordre");
        System.out.println("2: Færdiggør ordrer");
        System.out.println("3: Aktive ordrer");
        System.out.println("4: Tidligere ordrer");
        System.out.println("5: Fremsøg ordrer på ordre-ID");
        System.out.println("5: Menu-kort");
        System.out.println("6: Kundekartotek");
        System.out.println("7: Luk app'en");
    }
}