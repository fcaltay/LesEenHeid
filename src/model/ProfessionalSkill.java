package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class ProfessionalSkill extends LesEenheid {
    private boolean gehaald;

    public ProfessionalSkill(String naam, int acts, int studiejaar, boolean gehaald) {
        super(naam, acts, studiejaar);
        this.gehaald = gehaald;
    }

    public ProfessionalSkill(String naam,int acts, int studiejaar) {
        this(naam, acts, studiejaar, LesEenheid.DEFAULT_GEHAALD);
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), this.gehaald ? "gehaald" : "niet gehaald");
    }

    public boolean isAfgerond() {
        return gehaald;
    }

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }
}
