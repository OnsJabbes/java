public abstract class Titulaire extends Prof {
    protected String couleur;

    public Titulaire(String nom, String couleur) {
        super(nom);
        this.couleur = couleur;
    }

    public abstract void setCouleurDefaut();

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
