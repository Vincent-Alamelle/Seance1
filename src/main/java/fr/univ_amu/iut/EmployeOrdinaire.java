package fr.univ_amu.iut;

import java.time.LocalDate;

public class EmployeOrdinaire extends Employe {

    public EmployeOrdinaire(int numEmploye, String numSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbrHeure) {
        super(numEmploye, numSecu, nomEmploye, prenomEmploye, echelonEmploye, dateNaissanceEmploye, dateEmbaucheEmploye, base, nbrHeure);

        super.setSalaireBrut(base * nbrHeure + echelonEmploye * 100);
    }

    public void effectuerTacheOrdinaire()
    {
        System.out.println("Oh la la je hurle le nom de neymar à chaque fois qu'il fait un pas");
    }


}
