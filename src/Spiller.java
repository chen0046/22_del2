import java.util.Scanner;
// Benyttelse af kontoklassens maxPoint int til at afgøre om turen skal fortsætte?
// På en eller anden måde opretter vi en konto i denne klasse.

public class Spiller {

    String navn; //Navn skal defineres som String da det involverer tekst
    Scanner input = new Scanner(System.in);
    Konto spillerKonto = new Konto();

    /*
        Startpenge konto = new Startpenge;
        Deraf burde vi kunne refere til kontoen ved at skrive spillernavn.konto
         */
    public void askName (Spiller currentPlayer){
        currentPlayer.setNavn(input.nextLine());
    }
    public String getNavn() {
        return navn;
    } //Her gør vi så når man skriver getNavn så får man det definerede Navn

    public void setNavn(String navn) {
        this.navn = navn;
    } //Her gør vi så når man skriver setNavn så definerer vi navnet

       /* public int getPoint() {
            return point;
        } //Når man skriver getPoint så viser den ens point
        public void setPoint(int point) {
            this.point = point;
        } //Når man skriver setPoint så opdaterer den værdien af ens point */

}
