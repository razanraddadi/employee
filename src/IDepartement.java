import java.util.TreeSet;
import java.util.HashSet;

public interface IDepartement<T extends Departement> {

    void ajouterDepartement(T t);

    boolean rechercherDepartement(String nom);

    boolean rechercherDepartement(T t);

    void supprimerDepartement(T t);

    void displayDepartement();

    HashSet<T> trierDepartementById();
}
