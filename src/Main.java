public class Main {

    public static void main(String[] args) {
       // SocieteArrayList<Employe> societe = new SocieteArrayList<>();
        SocieteArrayList societe = new SocieteArrayList();
        societe.ajouterEmploye(new Employe(1, "jinan", "kort", "dep1", 2));
        societe.ajouterEmploye(new Employe(2, "soltan", "Aissa", "dep2", 3));
        societe.ajouterEmploye(new Employe(3, "Yasin", "mabrk", "dep3", 1));

        societe.displayEmploye();

        societe.trierEmployeParId();

        System.out.println("\nEmployés triés par identifiant : ");
        societe.displayEmploye();

        societe.trierEmployeParNomDepartementEtGrade();

        System.out.println("\nEmployés triés par nom de département, puis par grade : ");
        societe.displayEmploye();
    }
}