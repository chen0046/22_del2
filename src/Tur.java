import java.util.Scanner;

public class Tur {
    Scanner input = new Scanner(System.in);
    Terning terning = new Terning();

    public void tur(Spiller currentPlayer) {
        System.out.println(currentPlayer.getNavn() + ", det er din tur.");
        System.out.println("Tryk enter for at slå.");
        input.nextLine();
        terning.roll();
        /*Herunder har vi vores switch som tager summen af vores terninger og fortæller spilleren hvor man er landet
        og hvad der sker ved de forskellige felter*/
        switch (terning.henttotal()){
            case 2:
                /*fx ved terningsummen 2 fortæller den hvad du har slået, hvad der sker ved det felt, hvor mange penge
                man har fået eller mistet og hvor mange penge man nu har i alt*/
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er landet ved tårnet hvor den rare kone bor. Hun giver dig 250kr");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() + 250);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 3:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er landet ved krateret, og klodset som du er, taber du 100kr ned i det");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() - 100);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 4:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du har fundet det skjulte palads. Den rare baron der bor der giver dig 100kr for dit fund");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() + 100);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 5:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er endt i den kolde ørken hvor du bliver nødt til at bruge 20kr på at købe et tæppe til at holde dig varm");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() - 20);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 6:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er kommet til byen med de store murer. Her hjælper du en lokal bager med at bage brød en morgen og han giver dig 180kr for dit arbejde");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() + 180);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 7:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du ankommer til klosteret, og beslutter dig for at beundrer den spirituelle atmosfære. Dette giver dig 0kr");
                System.out.println("Du har fortsat " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 8:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du tager et sti-system der fører der hen til en mørk indgang. Du er endt i den sorte grotte, det koster dig 70kr at få grottemanden til at hjælpe dig ud");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() - 70);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 9:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er endt i bjergne og finder nogle efterladte hytter. Du gennemsøger hytterne og finder 60kr");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() + 60);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 10:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du står foran den gyselige stensætning der ligner en varulv, du bliver så bange at du køber et lift væk hurtigst mugligt, dette koster 80kr og du spiller din tur igen");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() - 80);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                tur(currentPlayer);
                break;
            case 11:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er endt ved djævlens hul og skal lave et ofer til hullet for at komme væk. Du køber en ged du kan ofre for 50kr");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() - 50);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
            case 12:
                System.out.println("Du har slået " + terning.henttotal());
                System.out.println("Du er drejet til venstre ved stigen alle drejer til højre ved, du er endt ved guldminen, du modtager 650kr");
                currentPlayer.spillerKonto.setBalance(currentPlayer.spillerKonto.getBalance() + 650);
                System.out.println("Nu har du " + currentPlayer.spillerKonto.getBalance() + "kr i din konto" );
                break;
        }
    }
}