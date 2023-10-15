public abstract class Agrege {
    protected String couleur;

    public Agrege(String couleur) {
        this.couleur = couleur;
    }

    public Agrege() {
        this.couleur = "rose";
    }

    public abstract void setCouleurDefaut();

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}