public class Main {

    static Spiller spiller1 = new Spiller();
    static Spiller spiller2 = new Spiller();
    static Tur tur = new Tur();
    static Konto konto1 = new Konto();
    static Konto konto2 = new Konto();

    public static void main(String[] args) {

        System.out.println("Skriv navnet på spiller1");
        spiller1.askName(spiller1);
        System.out.println("Spiller 1 er " + spiller1.getNavn());
        System.out.println("Skriv navnet på spiller2");
        spiller2.askName(spiller2);
        System.out.println("Spiller 2 er " + spiller2.getNavn());

        tur.tur(spiller1);
        if (konto1.getBalance()>=3000) {
            System.out.println("Tillykke " + spiller1.getNavn() + " du har vundet spillet ");
        }
        tur.tur(spiller2);
    }
}