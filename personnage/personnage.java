package personnage;

import comptences.competence;
import equipement.equipement;

public abstract class personnage
{
    private String nom;
    private double pv;
    private double force;
    private double agilite;
    private double endurance;
    private double intelligence;
    private double sagesse;
    private competence competence;
    private equipement[] equipements;

    public personnage(String nom, double pv, double force, double agilite, double endurance, double intelligence, double sagesse, int tailleInventaire)
    {
        this.nom = nom;
        this.pv = pv;
        this.force = force;
        this.agilite = agilite;
        this.endurance = endurance;
        this.intelligence = intelligence;
        this.sagesse = sagesse;
        this.equipements = new equipement[tailleInventaire];
    }

    public String getNom()
    {
        return nom;
    }
    public double getPv()
    {
        return pv;
    }
    public double getForce()
    {
        return force;
    }
    public double getAgilite()
    {
        return agilite;
    }
    public double getEndurance()
    {
        return endurance;
    }
    public double getIntelligence()
    {
        return intelligence;
    }
    public double getSagesse()
    {
        return sagesse;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }
    public void setPv(double pv)
    {
        this.pv = pv;
    }
    public void setForce(double force)
    {
        this.force = force;
    }
    public void setAgilite(double agilite)
    {
        this.agilite = agilite;
    }
    public void setEndurance(double endurance)
    {
        this.endurance = endurance;
    }
    public void setIntelligence(double intelligence)
    {
        this.intelligence = intelligence;
    }
    public void setSagesse(double sagesse)
    {
        this.sagesse = sagesse;
    }

    public void setCompetence(competence competence)
    {
        this.competence = competence;
        this.pv *= competence.getFacteurendurance();
        this.force *= competence.getFacteurforce();
        this.agilite *= competence.getFacteuragilite();
        this.intelligence *= competence.getFacteurintelligence();
        this.sagesse *= competence.getFacteursagesse();
    }
    public competence getCompetence()
    {
        return competence;
    }

    public int addEquipement(equipement equipement)
    {
        if (this.equipements[equipements.length - 1] != null)
        {
            return -1; // Inventaire plein
        }
        this.equipements[equipements.length - 1] = equipement;
        this.equipItem(equipement);
        return 0; // Ajout réussi
    }

    protected void equipItem(equipement item)
    {
        this.force += item.getBonusForce();
        this.agilite += item.getBonusAgilite();
        this.endurance += item.getBonusEndurance();
        this.intelligence += item.getBonusIntelligence();
        this.sagesse += item.getBonusSagesse();
    }

    public int attaquer(personnage cible)
    {
        cible.setPv(cible.getPv() - this.getForce());
        return (int)this.getForce();
    }

    public void displayInventory()
    {
        System.out.println("Inventaire de " + this.nom + ":");
        for (equipement item : equipements)
        {
            if (item != null)
            {
                System.out.println("- " + item.getNom());
            }
        }
    }
}