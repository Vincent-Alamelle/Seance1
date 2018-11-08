package fr.univ_amu.iut;
import fr.univ_amu.iut.Employe;
import fr.univ_amu.iut.Entreprise;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args)
    {
        ArrayList<Employe> listEmploye = new ArrayList<Employe>();
        listEmploye.add(new Employe(1, "numeroSecu1", "Vincent", "Alamelle", 1, LocalDate.of(1999, Month.OCTOBER, 22), LocalDate.of(2018, Month.OCTOBER, 22), 65, 35 ));
        listEmploye.add(new Representant(2, "numeroSecu2", "Théo", "Bouteiller", 1, LocalDate.of(1999, Month.DECEMBER, 21), LocalDate.of(2018, Month.DECEMBER, 21), 70, 35, 12, 14 ));
        listEmploye.add(new Vendeur(3, "numeroSecu3", "Morgan", "Corre", 1, LocalDate.of(1999, Month.SEPTEMBER, 20), LocalDate.of(2018, Month.SEPTEMBER, 20), 25, 35, 12, 14));
        listEmploye.add(new EmployeOrdinaire(4, "numeroSecu4", "Naruto", "Corre", 1, LocalDate.of(1999, Month.MARCH, 14), LocalDate.of(2018, Month.MARCH, 14), 12, 35 ));
        listEmploye.add(new Technicien(5, "numeroSecu5", "Kazuto", "Kirigaya", 1, LocalDate.of(1999, Month.SEPTEMBER, 18), LocalDate.of(2018, Month.SEPTEMBER, 18), 48, 35, 12, 14 ));
        listEmploye.add(new Commercial(6, "numeroSecu6", "Asuna", "Yuuki", 1, LocalDate.of(1999, Month.JANUARY, 23), LocalDate.of(2018, Month.JANUARY, 23), 24, 35, 12, 14));

        Entreprise entreprise = new Entreprise("maBoiteInfo", listEmploye);
        System.out.println(entreprise);
    }
}