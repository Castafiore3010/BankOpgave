import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    @Test
    public void testIndsæt() {
        // Arrange
        var konto = new Konto();
        // Act
        var result = konto.indsæt(100.0);
        var result2 = konto.indsæt(-100.0);
        // AssertTrue
        assertTrue(result == 100.0);
        assertTrue(result2 == -1);
        // AssertEqual
        assertEquals(100, konto.getSaldo());
    }


    @Test
    public void testHæv() {
        // Arrange
        var konto = new Konto(1000.0);
        var konto2 = new Konto();
        // Act
        var result = konto.hæv(500.0);
        var result2 = konto2.hæv(500.0);
        // AssertTrue
        assertTrue(result == 500.0);
        assertTrue(result2 == -1);
        // AssertEqual
        assertEquals(500, konto.getSaldo());
        assertEquals(0, konto2.getSaldo());
    }

    @Test
    public void testOverfør(){
        // Arrange
        var konto = new Konto(600.0);
        var konto2 = new Konto(500.0);
        // Act
        var result = konto.overfør(500.0, 1234);
        var result2 = konto2.overfør(500.0, 1234);
        // AssertTrue
        assertTrue(result == 95.0);
        assertTrue(result2 == -1);
        // AssertEqual
        assertEquals(95, konto.getSaldo());
        assertEquals(500, konto2.getSaldo());
    }

    @Test
    public void testToString() {
        // Arrange
        var konto = new Konto(1234,"Ole Olsen",1000.0);
        // Act
        var result = konto.toString();
        // AssertTrue
        assertTrue(result.equals("Kontonummer: 1234, Ejer: Ole Olsen, Saldo: 1.000,00"));
    }

}