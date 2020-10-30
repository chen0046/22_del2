import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    Konto testKonto = new Konto();
    int resultat;
    @Test
    void setBalance() {
        resultat = testKonto.getBalance();
        testKonto.setBalance(testKonto.getBalance() - 500);
        assertTrue(resultat >= 0);

    }


}