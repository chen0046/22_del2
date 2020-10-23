public class Terning {
    int terning1;  //Første terning
    int terning2;  // Anden terning

    public Terning (){   //roll funktion
        roll();
    }

    public void roll(){  /*Vi får roll funktionen til at sørge for at hver terning giver os et tilfældigt
        tal mellem 1-6 for hver gang vi roller*/
        terning1 = (int)(Math.random()*6+1);
        terning2 = (int)(Math.random()*6+1);
    }
    public int hentterning1() { //Giv et tal (resultat) for terning 1
        return terning1;
    }
    public int hentterning2() { //Giv et tal (resultat) for terning 2
        return terning2;

    }
    public int henttotal() { //Giv et resultat for de 2 terninger lagt sammen
        return terning1 + terning2;
    } //Vis summen af hvad terning 1 og 2 fik
}


