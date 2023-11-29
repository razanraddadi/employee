import java.util.HashSet;

public class DepartementHashSet<T extends Departement> implements IDepartement<T> {

    private HashSet<T> departements;
        public DepartementHashSet() {
            departements = new HashSet<>();
        }

        @Override
        public void ajouterDepartement(T t) {
            departements.add(t);
        }

        @Override
        public boolean rechercherDepartement(String nom) {
            return departements.stream().anyMatch(d -> d.getNom().equals(nom));
        }

        @Override
        public boolean rechercherDepartement(T t) {
            return departements.contains(t);
        }

        @Override
        public void supprimerDepartement(T t) {
            departements.remove(t);
        }

        @Override
        public void displayDepartement() {
            departements.forEach(System.out::println);
        }

        @Override
        public HashSet<T> trierDepartementById() {
            HashSet<T> sortedSet = new HashSet<>();
            departements.stream()
                    .sorted((d1, d2) -> d1.getId() - d2.getId())
                    .forEachOrdered(sortedSet::add);
            return sortedSet;
        }

}
