public class Printregler {
    public static void Spilleregler() {
        System.out.println("Spilleregler");
        System.out.println();
        System.out.println("Spillet indeholder:");
        System.out.println("2 teringer");
        System.out.println("2 spillere");
        System.out.println("11 felter som relaterer til summen af terningerne, mellem 2 og 12");
        System.out.println();

        System.out.println("Regler:");
        System.out.println();
        System.out.println("1) Spiller 1 og 2 skiftes til at slå med to terninger");
        System.out.println("2) Begge spillere starter med 1000 kroner");
        System.out.println("3) Antallet af terningeøjne afgør hvilket felt spilleren lander på");
        System.out.println("4) Hvert felt indeholder en værdig (positiv eller negativ), som bliver tilføjet til spillernes pengebeholdning");
        System.out.println("5) Spillerne kan ikke skylde penge, d.v.s pengebeholdningen kan ikke være under 0");
        System.out.println("6) Spilleren der først opnår beløbet 3000 kroner, vinder ");

    }
}