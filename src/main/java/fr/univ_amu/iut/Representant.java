package fr.univ_amu.iut;

import java.time.LocalDate;

public class Representant extends Commercial {


    public Representant(int numEmploye, String numSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbrHeure, double chiffreAffaires, double tauxCommission) {
        super(numEmploye, numSecu, nomEmploye, prenomEmploye, echelonEmploye, dateNaissanceEmploye, dateEmbaucheEmploye, base, nbrHeure, chiffreAffaires, tauxCommission);

        EmployeOrdinaire tempOrdinaire = new EmployeOrdinaire(69,null, null, null, echelonEmploye, null, null, base, nbrHeure);
        super.setSalaireBrut(tempOrdinaire.getSalaireBrut());
    }
}
