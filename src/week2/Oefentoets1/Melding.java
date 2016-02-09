package week2.Oefentoets1;

import java.time.LocalDate;
import java.time.DayOfWeek;

/**
 * Created by Kramok on 9/2/2016.
 */
public class Melding {

    private String berichtTekst;
    private int niveau;
    private String dagAanduiding;
    private LocalDate aanmaakDatum;
    private DayOfWeek dagVanBericht;

    public Melding(String berichtTekst) {
        this.berichtTekst = berichtTekst;
        this.niveau = 1;
        this.dagAanduiding = "vandaag";
        this.aanmaakDatum = LocalDate.now();
        this.dagVanBericht = this.aanmaakDatum.getDayOfWeek();
    }

    public Melding(String berichtTekst, int niveau) {
        this(berichtTekst);
        this.setNiveau(niveau); //Altijd een geldig niveau
    }



    public String getNiveauAlsTekst() {
        int niveau = this.getNiveau();
        String result = "";
        switch (niveau) {
            case 1: result = "Mededeling";
                    break;
            case 2: result = "WAARSCHUWING";
                    break;
            case 3: result = "NOODSITUATIE";
                    break;
        }
        return result;
    }

    public String toString() {
        String result;
        result = getNiveauAlsTekst() + ": " + getBerichtTekst() + " ";
        result += "(" + getDagAanduiding() + ", " + getDagVanBericht() + " " + getAanmaakDatum() + ")";
        return result;
    }

    public String getBerichtTekst() {
        return berichtTekst;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getDagAanduiding() {
        return dagAanduiding;
    }

    public LocalDate getAanmaakDatum() {
        return aanmaakDatum;
    }

    public DayOfWeek getDagVanBericht() {
        return dagVanBericht;
    }

    /**
     * Deze methode past zowel de danVanBericht als de dagAanduiding aan
     * @param aangepasteDag
     */
    public void setAangepasteDag(DayOfWeek aangepasteDag) {
        int verschuiving = 0;
        while (this.dagVanBericht != aangepasteDag) {
            System.out.println(this.dagVanBericht + " " + aangepasteDag + " " + this.dagAanduiding);
            this.dagVanBericht = this.dagVanBericht.plus(verschuiving);
            if (this.dagAanduiding.endsWith("morgen")) {
                this.dagAanduiding = "over" + this.dagAanduiding;
            }
            if (this.dagAanduiding.equals("vandaag")) {
                this.dagAanduiding = "morgen";
            }

            verschuiving++;
        }
    }

    public void setNiveau(int niveau) {
        if (niveau > 3) {
            niveau = 3;
        }
        if (niveau < 1) {
            niveau = 1;
        }
        this.niveau = niveau;
    }
}
