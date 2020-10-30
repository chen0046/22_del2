public class GameConsole {

    Spiller spiller1 = new Spiller();
    Spiller spiller2 = new Spiller();
    Tur tur = new Tur();
    public void Startgame(){
        Printregler.Spilleregler();
        System.out.println("Skriv navnet på spiller1");
        spiller1.askName(spiller1);
        System.out.println("Spiller 1 er " + spiller1.getNavn() + ".");
        System.out.println("Skriv navnet på spiller2");
        spiller2.askName(spiller2);
        System.out.println("Spiller 2 er " + spiller2.getNavn() + ".");

        while (spiller1.spillerKonto.getBalance() < spiller1.spillerKonto.maxPoint && spiller2.spillerKonto.getBalance() < spiller2.spillerKonto.maxPoint) {
            tur.tur(spiller1);
            if (spiller1.spillerKonto.getBalance() >= spiller1.spillerKonto.maxPoint) {
                break;
            }
            tur.tur(spiller2);
        }
        if (spiller1.spillerKonto.getBalance() >= spiller1.spillerKonto.maxPoint) {
            System.out.println("Tillykke " + spiller1.getNavn() + " du har vundet!");
        } else {
            System.out.println("Tillykke " + spiller2.getNavn() + " du har vundet!");
        }
    }

}


