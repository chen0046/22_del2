import static org.junit.jupiter.api.Assertions.*;

class TerningTest {
Terning testTerning = new Terning();

    @org.junit.jupiter.api.Test
    void henttotal() {
        testTerning.roll();
        int resultat = testTerning.henttotal();
        assertTrue(resultat >= 1 && resultat <= 6);
    }

    @org.junit.jupiter.api.Test
    void henttotalMulti() {
        int resultatMulti = 0;
        for (int i = 0 ; i <= 10000 ; i++) {
            testTerning.roll();
            resultatMulti = resultatMulti + testTerning.henttotal();
        }
    assertTrue(resultatMulti >=20000 && resultatMulti <= 120000);
    }
}