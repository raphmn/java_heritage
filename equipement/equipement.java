package equipement;

public abstract class equipement {
    
    private String nom;
    private double bonusForce;
    private double bonusAgilite;
    private double bonusEndurance;
    private double bonusIntelligence;
    private double bonusSagesse;

    public equipement(String nom, double bonusForce, double bonusAgilite, double bonusEndurance, double bonusIntelligence, double bonusSagesse)
    {
        this.nom = nom;
        this.bonusForce = bonusForce;
        this.bonusAgilite = bonusAgilite;
        this.bonusEndurance = bonusEndurance;
        this.bonusIntelligence = bonusIntelligence;
        this.bonusSagesse = bonusSagesse;
    }

    public String getNom() {
        return nom;
    }
    public double getBonusForce() {
        return bonusForce;
    }
    public double getBonusAgilite() {
        return bonusAgilite;
    }
    public double getBonusEndurance() {
        return bonusEndurance;
    }
    public double getBonusIntelligence() {
        return bonusIntelligence;
    }
    public double getBonusSagesse() {
        return bonusSagesse;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setBonusForce(double bonusForce) {
        this.bonusForce = bonusForce;
    }
    public void setBonusAgilite(double bonusAgilite) {
        this.bonusAgilite = bonusAgilite;
    }
    public void setBonusEndurance(double bonusEndurance) {
        this.bonusEndurance = bonusEndurance;
    }
    public void setBonusIntelligence(double bonusIntelligence) {
        this.bonusIntelligence = bonusIntelligence;
    }
    public void setBonusSagesse(double bonusSagesse) {
        this.bonusSagesse = bonusSagesse;
    }


}
