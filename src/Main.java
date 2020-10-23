public class Main {

    static Spiller spiller1 = new Spiller();
    static Spiller spiller2 = new Spiller();


    public static void main(String[] args) {

        System.out.println("Skriv navnet på spiller1");
        spiller1.askName(spiller1);
        System.out.println("Skriv navnet på spiller2");
        spiller2.askName(spiller2);



    }
}
