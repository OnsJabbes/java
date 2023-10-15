public class TestPolymorphismeSurclassement {

    public static void main(String[] args) {
        Mortel[] mortels = {new Humain(), new Professeur(), new MaîtreDeConférence(), new Agrégé(), new Professeur()};
        Titulaire[] titulaires = {new MaîtreDeConférence(), new Agrégé(), new Professeur()};

        meurent(mortels);
        setCouleursDefaut(titulaires);

        for (Mortel mortel : mortels) {
            System.out.println(mortel);
        }

        for (Titulaire titulaire : titulaires) {
            System.out.println(titulaire);
        }
    }

    public static void meurent(Mortel[] mortels) {
        for (int i = 0; i < mortels.length; i++) {
            mortels[i].meurt();
        }
    }

    public static void setCouleursDefaut(Titulaire[] titulaires) {
        for (int i = 0; i < titulaires.length; i++) {
            titulaires[i].setCouleurDefaut();
        }
    }
}

abstract class Mortel {
    private boolean estMort;

    public Mortel() {
        this.estMort = false;
    }

    public void meurt() {
        this.estMort = true;
    }

    public boolean estMort() {
        return this.estMort;
    }

    @Override
    public String toString() {
        return "Mortel{" +
                "estMort=" + estMort +
                '}';
    }
}

class Humain extends Mortel {
}

class Professeur extends Mortel {
}

abstract class Titulaire extends Mortel {
    private String couleur;

    public Titulaire() {
        this.couleur = "non définie";
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleurDefaut() {
        this.couleur = "non définie";
    }
    
}
