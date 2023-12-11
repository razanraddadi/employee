import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class SocieteArrayList extends Employe implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
       this.listeEmployes  = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe t) {
        listeEmployes.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }



    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employe::getId));
    }


    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmployes, Comparator
                .comparing(Employe::getNomDépartement)
                .thenComparingInt(Employe::getGrade)
        );
    }

}