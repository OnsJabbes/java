public class Etudiant extends Humain {
    private String note;

    public Etudiant(String nom, String note) {
        super(nom);
        this.note = note;
    }


    public void setnote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "note='" + note + '\'' +
                ", nom='" + getNom() + '\'' +
                '}';
    }
}