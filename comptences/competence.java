package comptences;

public abstract class competence {
    
    private double facteurforce;
    private double facteuragilite;
    private double facteurendurance;
    private double facteurintelligence;
    private double facteursagesse;
    public competence (double facteurforce, double facteuragilite, double facteurendurance, double facteurintelligence, double facteursagesse)
    {
        this.facteurforce = facteurforce;
        this.facteuragilite = facteuragilite;
        this.facteurendurance = facteurendurance;
        this.facteurintelligence = facteurintelligence;
        this.facteursagesse = facteursagesse;
    }

    public double getFacteurforce() {
        return facteurforce;
    }
    public double getFacteuragilite() {
        return facteuragilite;
    }
    public double getFacteurendurance() {
        return facteurendurance;
    }
    public double getFacteurintelligence() {
        return facteurintelligence;
    }
    public double getFacteursagesse() {
        return facteursagesse;
    }

    public void setFacteurforce(double facteurforce) {
        this.facteurforce = facteurforce;
    }
    public void setFacteuragilite(double facteuragilite) {
        this.facteuragilite = facteuragilite;
    }
    public void setFacteurendurance(double facteurendurance) {
        this.facteurendurance = facteurendurance;
    }
    public void setFacteurintelligence(double facteurintelligence) {
        this.facteurintelligence = facteurintelligence;
    }
    public void setFacteursagesse(double facteursagesse) {
        this.facteursagesse = facteursagesse;
    }

}
