package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Project extends LesEenheid{
    private double productCijfer;
    private double procesCijfer;
    private double methodeEnTechniekCijfer;


    public Project(double productCijfer, double procesCijfer, double methodeEnTechniekCijfer, String naam, int acts, int studiejaar) {
        super(naam, acts, studiejaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodeEnTechniekCijfer = methodeEnTechniekCijfer;
    }

    public Project(String naam, int acts, int studiejaar) {
        this(LesEenheid.DEFAULT_CIJFER, LesEenheid.DEFAULT_CIJFER, LesEenheid.DEFAULT_CIJFER, naam, acts, studiejaar);
    }


    @Override
    public String toString() {
        return String.format("%s (%.3f, %.3f, %.3f)",
                super.toString(),
                Math.floor(productCijfer * 1000) / 1000.0,  // 3 basamak bırakıyoruz
                Math.floor(procesCijfer * 1000) / 1000.0,   // 3 basamak bırakıyoruz
                Math.floor(methodeEnTechniekCijfer * 1000) / 1000.0);  // 3 basamak bırakıyoruz
    }

    public double getDEFAULT_CIJFER() {
        return DEFAULT_CIJFER;
    }

    public boolean isAfgerond() {
        return productCijfer >= LesEenheid.ONDER_GRENS_VOLDOENDE &  procesCijfer  >= LesEenheid.ONDER_GRENS_VOLDOENDE
                & methodeEnTechniekCijfer  >= LesEenheid.ONDER_GRENS_VOLDOENDE;
    }

    public void setProductCijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public void setProcesCijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public void setMethodeEnTechniekCijfer(double methodeEnTechniekCijfer) {
        this.methodeEnTechniekCijfer = methodeEnTechniekCijfer;
    }

}
