/**
 * @version 1.0
 * @author Marc Pless & Emma Bovin
 */

public class Konto {
    private int kontonummer;
    private String ejernavn;
    private double saldo;
    private final int GEBYR = 5;


    public Konto() {
        saldo = 0.0;
    }

    public Konto(double saldo) {
        this.saldo = saldo;
    }

    public Konto(int kontonummer, String ejernavn, double saldo) {
        this.kontonummer = kontonummer;
        this.ejernavn = ejernavn;
        this.saldo = saldo;
    }


    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getEjernavn() {
        return ejernavn;
    }

    public void setEjernavn(String ejernavn) {
        this.ejernavn = ejernavn;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double indsæt(double saldo) {
        if (saldo < 0)
            return -1;
        this.saldo += saldo;
        return this.saldo;
    }

    public double hæv(double saldo) {
        if (this.saldo < saldo)
            return -1;
        this.saldo -= saldo;
        return this.saldo;
    }

    public String toString() {
        String format = String.format("Kontonummer: %d, Ejer: %s, Saldo: %,.2f", kontonummer, ejernavn, saldo);
        return format;
    }

    public double overfør(double beløb, int kontonummer) {
        if (beløb + GEBYR <= saldo) {
            hæv(beløb + GEBYR);
            return saldo;
        }
        return -1;
    }



}
