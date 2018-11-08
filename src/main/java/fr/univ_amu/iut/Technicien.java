package fr.univ_amu.iut;

import java.time.LocalDate;

public class Technicien extends Employe {

    public Technicien(int numEmploye, String numSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbrHeure) {
        super(numEmploye, numSecu, nomEmploye, prenomEmploye, echelonEmploye, dateNaissanceEmploye, dateEmbaucheEmploye, base, nbrHeure);
    }

    public void fabriquerProduit()
    {
        System.out.printf("Oh la la je fabrique une centaine de brancard pour les simulations de neymar");
    }
}
