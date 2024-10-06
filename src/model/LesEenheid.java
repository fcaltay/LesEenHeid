package model;

/**
 * @author Furkan Altay
 * Voor deze opdracaht maak ik veer klassen die met elkaar samen werken.
 */
public class LesEenheid {
    private String naam;
    private int acts;
    private int studiejaar;
    protected static final double DEFAULT_CIJFER = -1;
    protected static final double ONDER_GRENS_VOLDOENDE = 5.5;
    protected static final boolean DEFAULT_GEHAALD = false;

    public LesEenheid(String naam, int acts, int studiejaar) {
        this.naam = naam;
        this.acts = acts;
        this.studiejaar = studiejaar;
    }

    @Override
    public String toString() {
        return String.format(" %s, %d acts, studiejaar %d", this.naam, this.acts, this.studiejaar);
    }
}
