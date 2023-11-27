import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public interface IGestion<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void displayEmploye();
    void trierEmployeParId();
    void trierEmployeParNomDepartementEtGrade();
}
/*public interface IGestion <Employe>{
    void ajouterEmploye(Employe t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(Employe t);
    void supprimerEmploye(Employe t);
    void displayEmploye();
    void trierEmployeParId();
    void trierEmployeParNomDepartementEtGrade();
}*/
