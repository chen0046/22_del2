
/*
Tur-klassen har vi skabt for at gøre det nemt at ændre struktur, rækkefølge eller lignende i spillet.
Vores tur indeholder derudover også spillets struktur samt definition af point.
Vi har designet tur således at den kan blive påført en hvilken som helst spiller.
Dette betyder at du principielt kan spille med et ubegrænset antal spillere. Ikke blot 2.
Dette gøres muligt
 */
/*public class Tur {
    Scanner input = new Scanner(System.in);
    Terning terning = new Terning();
    public void tur (Spiller currentPlayer){
        //Metodes er lavet således at dette kun kan blive kørt på en spiller. Deraf indholdet i parantesen.
        //Den spiller som skal køres på erstattes af "currentPlayer" i koden.
        System.out.println(currentPlayer.getNavn() + ", det er din tur.");
        System.out.println("Tryk enter for at slå.");
        input.nextLine(); //Her sørger den får at spilleren skal give et input før spillet fortsætter
        terning.roll(); //Der bliver slået med terningerne
        System.out.println("Du har slået: " + terning.hentterning1() + " og " + terning.hentterning2() + " i alt har du slået: " + terning.henttotal());
        currentPlayer.setPoint(currentPlayer.getPoint() + terning.henttotal()); //resultatet bliver regnet og opdateret

        if (terning.henttotal() == 2) {
            currentPlayer.setPoint(0);
            System.out.println("Fordi du har slået to 1'ere har du mistet alle dine point.");
        } //En af ekstraopgaverne var at hvis der blev slået 2 1'ere så mistede man alle sine point. Det kan man se her

        System.out.println(currentPlayer.getNavn() + " har nu: " + currentPlayer.getPoint() + " point");
        //her hentes det samlede regnede point resultat og vises for spilleren

        while (terning.hentterning1() == terning.hentterning2()) {
            if (currentPlayer.getPoint() >= 40) {
                break;
            } //Her sørger vi for at spillet stopper med det samme hvis en spillers point >= 40

            System.out.println("Du har slået 2 ens, så du får en tur til");
            System.out.println("Tryk enter for at slå.");
            input.nextLine();
            terning.roll();
            System.out.println("Du har slået: " + terning.hentterning1() + " og " + terning.hentterning2() + " i alt har du slået: " + terning.henttotal());
            currentPlayer.setPoint(currentPlayer.getPoint() + terning.henttotal());
            // Her laver vi ekstraopgave 2 som gør man får en ekstra tur hvis man slår 2 ens

            if(currentPlayer.getPoint() >= 40) {
                System.out.println(currentPlayer.getNavn() + " har nu: " + currentPlayer.getPoint() + " point");
                break;
            } //Her sørger vi for at man stadig vinder med det samme selvom man får >=40 inde i whileloopet

            if (terning.henttotal() == 2) {
                currentPlayer.setPoint(0);
                System.out.println("Fordi du har slået to 1'ere har du mistet alle dine point.");
            } //Her implementerer vi ekstraopgave 1 igen fordi den stadig skal foregå hvis det sker i dette whileloop
            System.out.println(currentPlayer.getNavn() + " har nu: " + currentPlayer.getPoint() + " point");
        }
    }

}*/
import java.util.Scanner;


public class Tur {
    Scanner input = new Scanner(System.in);
    Terning terning = new Terning();

    public void tur(Spiller currentPlayer) {
        System.out.println(currentPlayer.getNavn() + ", det er din tur.");
        System.out.println("Tryk enter for at slå.");
        input.nextLine();
        terning.roll();
        switch (terning.henttotal()){
            case 2:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er landet ved tårnet hvor den rare kone bor. Hun giver dig 250kr");
                break;
            case 3:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er landet ved krateret og klodset som du er, taber du 100kr ned i det");
                break;
            case 4:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er landet ved paladset. Den rare baron giver dig 100kr");
                break;
            case 5:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er endt i den kolde ørken hvor du bliver nødt til at bruge 20kr på at købe et tæppe til at holde dig varm");
                break;
            case 6:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er kommet til byen med de store murer. Her hjælper du en lokal bager med at bage brød en morgen og han giver dig 180kr for dit arbejde");
                break;
            case 7:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println();
            case 8:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println();
            case 9:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println();
            case 10:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println();
            case 11:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println();
            case 12:
                System.out.println("Du har slået " + terning.henttotal());

        }
    }
}