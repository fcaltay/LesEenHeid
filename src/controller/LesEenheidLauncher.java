package controller;

import model.LesEenheid;
import model.ProfessionalSkill;
import model.Project;
import model.Vak;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class LesEenheidLauncher {

    public static void main(String[] args) {
        LesEenheid leseenheid = new LesEenheid("Algemeen", 3, 2);
        System.out.println(leseenheid);
        Vak vak = new Vak("OOP1",3 , 1, 7.8);
        System.out.println(vak);

        ProfessionalSkill skill = new ProfessionalSkill("Personal Skills",1, 2, false);
        System.out.println(skill);

        Project project = new Project(7.4,6.8, 8.0, "Fasten Your Seatbelts", 12, 1);
        System.out.println(project);

        Vak db = new Vak("Database", 3, 1);
        System.out.println(db);
        System.out.println(db.toString() + ", afgerond: " + db.isAfgerond());
        db.setCijfer(5.4999);
        System.out.println(db.toString() + ", afgerond: " + db.isAfgerond());

        db.setCijfer(5.5);
        System.out.println(db.toString() + ", afgerond: " + db.isAfgerond());

        ProfessionalSkill ictEthics = new ProfessionalSkill("ICT Ethics", 2, 2);
        System.out.println(ictEthics + ", afgerond: " + ictEthics.isAfgerond());
        ictEthics.setGehaald(true);
        System.out.println(ictEthics + ", afgerond: " + ictEthics.isAfgerond());

        Project agile = new Project("Agile Development", 12, 1);
        System.out.println(agile.toString() + ", afgerond: " + agile.isAfgerond());

        agile.setMethodeEnTechniekCijfer(5.49999);
        agile.setProcesCijfer(5.5);
        agile.setProductCijfer(5.6);
        System.out.println(agile.toString() + ", afgerond: " + agile.isAfgerond());

        agile.setMethodeEnTechniekCijfer(5.5);
        agile.setProcesCijfer(5.49999);
        System.out.println(agile.toString() + ", afgerond: " + agile.isAfgerond());

        agile.setProcesCijfer(10);
        agile.setProductCijfer(5.49999);
        System.out.println(agile.toString() + ", afgerond: " + (agile.isAfgerond()));

        agile.setProductCijfer(10);
        System.out.println(agile.toString() + ", afgerond: " + (agile.isAfgerond() ? "ja afgerond" : "nee, nog niet"));

        agile.setMethodeEnTechniekCijfer(10);
        System.out.println(agile.toString() + ", afgerond: " + (agile.isAfgerond() ? "ja afgerond" : "nee, nog niet"));


    }
}
