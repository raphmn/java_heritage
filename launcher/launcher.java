package launcher;

import comptences.*;
import equipement.*;
import races.*;

public class launcher {
    public static void main(String[] args) 
    
    {

    humain person1 = new humain("Personne 1");
    nain person2 = new nain("Personne 2");

    person1.setCompetence(new guerrier());
    person2.setCompetence(new magicien());

    System.out.println(person1.getNom() + " - PV: " + person1.getPv() + ", Force: " + person1.getForce() + ", Agilité: " + person1.getAgilite() + ", Endurance: " + person1.getEndurance() + ", Intelligence: " + person1.getIntelligence() + ", Sagesse: " + person1.getSagesse());
    System.out.println(person2.getNom() + " - PV: " + person2.getPv() + ", Force: " + person2.getForce() + ", Agilité: " + person2.getAgilite() + ", Endurance: " + person2.getEndurance() + ", Intelligence: " + person2.getIntelligence() + ", Sagesse: " + person2.getSagesse());

    person1.addEquipement(new sword("Épée longue", 15));
    person2.addEquipement(new magic_stone("Pierre magique"));

    System.out.println("Après avoir équipé les objets:");
    System.out.println(person1.getNom() + " - PV: " + person1.getPv() + ", Force: " + person1.getForce() + ", Agilité: " + person1.getAgilite() + ", Endurance: " + person1.getEndurance() + ", Intelligence: " + person1.getIntelligence() + ", Sagesse: " + person1.getSagesse());
    System.out.println(person2.getNom() + " - PV: " + person2.getPv() + ", Force: " + person2.getForce() + ", Agilité: " + person2.getAgilite() + ", Endurance: " + person2.getEndurance() + ", Intelligence: " + person2.getIntelligence() + ", Sagesse: " + person2.getSagesse());
    
    person1.displayInventory();
    person2.displayInventory();

}
}
