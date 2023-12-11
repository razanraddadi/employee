public class Departement {
        private int id;
        private String nom;
        private int nombreEmployes;

        public Departement() {
        }

        public Departement(int id, String nom, int nombreEmployes) {
            this.id = id;
            this.nom = nom;
            this.nombreEmployes = nombreEmployes;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }
    public String getNomDépartement() {return getNomDépartement();}

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getNombreEmployes() {
            return nombreEmployes;
        }

        public void setNombreEmployes(int nombreEmployes) {
            this.nombreEmployes = nombreEmployes;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Departement that = (Departement) o;
            return id == that.id  && nom.equals(that.nom);
        }

        @Override
        public String toString() {
            return "Departement{" +
                    "id=" + id +
                    ", nom='" + nom + '\'' +
                    ", nombreEmployes=" + nombreEmployes +
                    '}';
        }

}
