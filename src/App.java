import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // Pelin oikea nimi
        String oikeaNimi = "Joonas";
        
        Scanner scanner = new Scanner(System.in);
        String arvaus;
        boolean oikein = false;
        int arvauskerrat = 0;
        
        while (!oikein) {

            System.out.println("Arvaa nimi:");
            arvaus = scanner.nextLine();
            arvauskerrat++;

            if (arvaus.equalsIgnoreCase(oikeaNimi)) {
                System.out.println("Oikein! Onnittelut!");
                oikein = true;
            } else {
                System.out.println("Väärin! Yritä uudelleen.");
            }

        }
            // lasketaan arvauskerrat yhteen
          if (arvauskerrat > 0) {
            System.out.println("Arvauksia tehtiin yhteensä: " + arvauskerrat);
        }
    }
}