package fr.univ_amu.iut;

import java.time.LocalDate;

public class Vendeur extends Commercial {

    public Vendeur(int numEmploye, String numSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbrHeure, double chiffreAffaires, double tauxCommission) {
        super(numEmploye, numSecu, nomEmploye, prenomEmploye, echelonEmploye, dateNaissanceEmploye, dateEmbaucheEmploye, base, nbrHeure, chiffreAffaires, tauxCommission);
    }
}
