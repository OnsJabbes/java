public class Prof extends Humain {
    private double salaire;

    public Prof() {
        super(null);
        this.salaire = 0;
    }

    public Prof(String nom) {
        super(nom);
        this.salaire = 0;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom.toUpperCase());
    }
}