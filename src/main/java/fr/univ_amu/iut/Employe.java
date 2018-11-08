package fr.univ_amu.iut;
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
    private double salaireBrut;
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
        setSalaireBrut(this.base * this.nbrHeure);
        setSalaireNet(this.salaireBrut * 0.8);
    }

    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut + 100;
        setSalaireNet(this.salaireBrut * 0.8);
    }

    public void setSalaireNet(double salaireNet) {
        this.salaireNet = salaireNet;
    }

    public double getSalaireBrut() {
        return salaireBrut;
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
                ", nbrHeure=" + nbrHeure +
                ", base=" + base +
                ", salaireBrut=" + salaireBrut +
                ", salaireNet=" + salaireNet +
                '}' + "\n";
    }
}
