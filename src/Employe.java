import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Employe {

        private int id;
        private String nom;
        private String prenom;
        private String nomDépartement;
        private int grade;
    public Employe() {

    } public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDepartement() {
        return nomDépartement;
    }

    public int getGrade() {
        return grade;
    }

        public Employe(int id, String nom, String prenom, String nomDépartement, int grade) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.nomDépartement = nomDépartement;
            this.grade = grade;
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nomDépartement=" + nomDépartement + ", grade=" + grade + "]";
        }
    public int compareTo(Employe other) {
        return this.grade - other.grade;
    }
}
