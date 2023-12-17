import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {
    private Rettangolo test = new Rettangolo(2.5,3.5);
    private Rettangolo test2 = new Rettangolo(-2.5,3.5);
    private Rettangolo test3 = new Rettangolo(-2.5,-3.5);
    private Rettangolo test4 = new Rettangolo(0.0,5.5);
    @org.junit.jupiter.api.Test
    void calcolaArea() {
      double risultato = test.calcolaArea();
      assertEquals(8.75,risultato, "la moltiplicazione tra base e altezza dovrebbe essere 8.75");
    }
    @org.junit.jupiter.api.Test
    void calcolaAreaNumeroNegativo() {
        double risultato = test2.calcolaArea();
        assertEquals(-8.75,risultato, "la moltiplicazione con almeno un valore negativo dovrebbe essere negativo: -8.75");
    }
    @org.junit.jupiter.api.Test
    void calcolaAreaNumeriNegativi() {
        double risultato = test3.calcolaArea();
        assertEquals(8.75,risultato, "la moltiplicazione tra base e altezza negativi dovrebbe dare risultato positivo: 8.75");
    }
    @org.junit.jupiter.api.Test
    void calcolaAreaConZero() {
        double risultato = test4.calcolaArea();
        assertEquals(0.0, risultato, "la moltiplicazione con uno dei 2 valori 0 dovrebbe essere 0");
    }
}