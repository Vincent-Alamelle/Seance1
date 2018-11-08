package fr.univ_amu.iut.exo1;
import java.time.LocalDate;

public class Employe {
    private int numEmploye;
    private String numSecu;
    private String nomEmploye;
    private String prenomEmploye;
    private int echelonEmploye;
    private LocalDate dateNaissanceEmploye;
    private LocalDate dateEmbaucheEmploye;
    private double base;
    private double nbrHeure;
    private double salaireNet;


    public Employe(int numEmploye, String numSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbrHeure) {
        this.numEmploye = numEmploye;
        this.numSecu = numSecu;
        this.nomEmploye = nomEmploye;
        this.prenomEmploye = prenomEmploye;
        this.echelonEmploye = echelonEmploye;
        this.dateNaissanceEmploye = dateNaissanceEmploye;
        this.dateEmbaucheEmploye = dateEmbaucheEmploye;
        this.base = base;
        this.nbrHeure = nbrHeure;
        this.salaireNet = this.base * this.nbrHeure;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "numEmploye=" + numEmploye +
                ", numSecu='" + numSecu + '\'' +
                ", nomEmploye='" + nomEmploye + '\'' +
                ", prenomEmploye='" + prenomEmploye + '\'' +
                ", echelonEmploye=" + echelonEmploye +
                ", dateNaissanceEmploye=" + dateNaissanceEmploye +
                ", dateEmbaucheEmploye=" + dateEmbaucheEmploye +
                ", tauxHoraire=" + base +
                ", nbrHeure=" + nbrHeure +
                ", salaireNet" + salaireNet +
                '}' + "\n";
    }
}
