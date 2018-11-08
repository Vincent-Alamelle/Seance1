package fr.univ_amu.iut;

import java.time.LocalDate;

public class Commercial extends Employe {

    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(int numEmploye, String numSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbrHeure) {
        super(numEmploye, numSecu, nomEmploye, prenomEmploye, echelonEmploye, dateNaissanceEmploye, dateEmbaucheEmploye, base, nbrHeure);

        this.setSalaireBrut(base + (chiffreAffaires * tauxCommission));
    }

    public void negocierTransaction()
    {
        System.out.println("Oh la la je négocie le prêt de Neymar pour seulement 500 milliards de $");
    }
}
