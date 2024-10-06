package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Vak extends LesEenheid {
    private double cijfer;

    public Vak( String naam, int acts, int studiejaar, double cijfer) {
        super(naam, acts, studiejaar);
        this.cijfer = cijfer;
    }

    public Vak(String naam, int acts, int studiejaar) {
        this("Onbekend",acts,studiejaar, LesEenheid.DEFAULT_CIJFER);
    }

    @Override
    public String toString() {
        return String.format("%s, cijfer %.1f", super.toString(), this.cijfer);
    }

    public boolean isAfgerond() {
        return cijfer >= LesEenheid.ONDER_GRENS_VOLDOENDE;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
}
