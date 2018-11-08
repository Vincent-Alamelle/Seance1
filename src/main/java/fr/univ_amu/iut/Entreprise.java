package fr.univ_amu.iut;
import java.time.LocalDate;
import java.util.ArrayList;

public class Entreprise {

    private String nomEntreprise;
    private ArrayList<Employe> listEmploye;

    public Entreprise(String nomEntreprise, ArrayList<Employe> listEmploye) {
        this.nomEntreprise = nomEntreprise;
        this.listEmploye = listEmploye;
    }

    public void embaucher(LocalDate date)
    {

    }

    public void licensier()
    {

    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nomEntreprise = " + nomEntreprise + "\n" +
                " listEmploye = " + listEmploye +
                '}';
    }
}
