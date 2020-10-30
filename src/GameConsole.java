public class GameConsole {

    Spiller spiller1 = new Spiller(); //Her bliver hver spiller oprettet
    Spiller spiller2 = new Spiller();
    Tur tur = new Tur(); //Her indsætter vi vores tur fra Tur klassen
    public void Startgame(){
        Printregler.Spilleregler(); //Printer reglerne fra Printregler klassen
        System.out.println("Skriv navnet på spiller1");
        spiller1.askName(spiller1); //Gør så det næste der bliver indtastet bliver sat til at være spiller1's navn
        System.out.println("Spiller 1 er " + spiller1.getNavn() + "."); //Bekræfter at spilleren hedder det de skrev
        System.out.println("Skriv navnet på spiller2");
        spiller2.askName(spiller2); //Gør så det næste der bliver indtastet bliver sat til at være spiller2's navn
        System.out.println("Spiller 2 er " + spiller2.getNavn() + "."); //Bekræfter at spilleren hedder det de skrev

        //Herunder laver vi en whileløkke som bliver kørt hvis spillernes konto ikke overskrider makspointne
        while (spiller1.spillerKonto.getBalance() < spiller1.spillerKonto.maxPoint && spiller2.spillerKonto.getBalance() < spiller2.spillerKonto.maxPoint) {
            tur.tur(spiller1); //Her kører vi turen for spiler1 fra Tur klassen
            if (spiller1.spillerKonto.getBalance() >= spiller1.spillerKonto.maxPoint) {
                break;
                /*I denne if sætning sørger vi for at hvis spiller1 kommer over makspoint at den stopper whileløkken
                så spiller2 ikke når at få sin tur, efter spiller1 har vundet*/
            }
            tur.tur(spiller2); //Her kører vi turen for spiller2 fra Tur klassen
        }
        //I denne if sætning finder vi ud af hvilken af de 2 spillere der har vundet
        if (spiller1.spillerKonto.getBalance() >= spiller1.spillerKonto.maxPoint) {
            System.out.println("Tillykke " + spiller1.getNavn() + " du har vundet!");
        } else {
            System.out.println("Tillykke " + spiller2.getNavn() + " du har vundet!");
        }
    }

}


