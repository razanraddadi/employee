import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class Etudiant {



        private int id;
        private String nom;
        private int age;


        public Etudiant(int id, String nom, int age) {
            this.id = id;
            this.nom = nom;
            this.age = age;

        }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static String toString(Etudiant etudiant) {
        return "Etudiant{" +
                "id=" + etudiant.getId() +
                ", nom='" + etudiant.getNom() + '\'' +
                ", age=" + etudiant.getAge() +
                '}';
    }
    public Etudiant createStudent(Supplier<Etudiant> studentSupplier) {
        return studentSupplier.get();
    }

    public void registerStudents(Supplier<Etudiant> studentSupplier, int count) {
        Stream.generate(studentSupplier)
                .limit(count)
                .forEach(student -> {
                });
    }
}
