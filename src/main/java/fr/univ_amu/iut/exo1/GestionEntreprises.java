package fr.univ_amu.iut.exo1;
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
        listEmploye.add(new Employe(2, "numeroSecu2", "Théo", "Bouteiller", 1, LocalDate.of(1999, Month.DECEMBER, 21), LocalDate.of(2018, Month.DECEMBER, 21), 70, 35 ));
        listEmploye.add(new Employe(3, "numeroSecu3", "Morgan", "Corre", 1, LocalDate.of(1999, Month.SEPTEMBER, 20), LocalDate.of(2018, Month.SEPTEMBER, 20), 25, 35 ));

        Entreprise entreprise = new Entreprise("maBoiteInfo", listEmploye);
        System.out.println(entreprise);
    }
}