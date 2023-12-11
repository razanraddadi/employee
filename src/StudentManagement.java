import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class StudentManagement {
    public void displayStudents(List<Etudiant> students,
                                Consumer<Etudiant> con) {
        students.forEach(con);
    }

    public void displayStudentsByFilter(List<Etudiant> students,
                                        Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        students.stream().filter(pre).forEach(con);
    }

    public String returnStudentsNames(List<Etudiant> students,
                                      Function<Etudiant, String> fun) {
        return students.stream().map(fun).collect(Collectors.joining(", "));
    }

    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }public List<Etudiant> sortStudentsById(List<Etudiant> students,
                                            Comparator<Etudiant> com) {
        return students.stream().sorted(com).collect(Collectors.toList());
    }

    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return students.stream();}
}
