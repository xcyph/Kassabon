import java.util.Scanner;

public class Kassabon {

    public static double prijsPizza() {
        return 11.455;
    }
    public static double prijsBurger() {
        return 5.567;
    }
    public static double prijsShakes() {
        return 3.65;
    }

    public static void toonProductregel (int aantal, String product, double prijs){
        System.out.printf("%2d %6s à € %5.2f        € %6.2f%n", aantal, product, prijs, aantal*prijs);
    }

    public static int leesAantal(String product){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Voer het aantal %s in: ", product);
        return scanner.nextInt();
    }

    public static void toonKassabon(int aantalPizzas, int aantalBurgers, int aantalShakes){
        toonProductregel (aantalPizzas, "pizzas", prijsPizza());
        toonProductregel (aantalBurgers, "burgers", prijsBurger());
        toonProductregel (aantalShakes, "shakes", prijsShakes());

        System.out.printf("%n%35s%n", "--------");

        double som = aantalPizzas * prijsPizza() +
                    aantalBurgers * prijsBurger() +
                    aantalShakes * prijsShakes();


        System.out.printf("%-27s€ %6.2f", "Totaal", som);



    }


    public static void main (String[] args){
        int pizza = leesAantal("pizza's");
        int burger = leesAantal("burgers");
        int shake = leesAantal("shakes");
        toonKassabon(pizza, burger, shake);
    }


}
