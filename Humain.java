public class Humain implements Mortel{
    private String nom;
    


    public Humain(String nom) {
        this.nom = nom;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = n om;
    }


    @Override
    public String toString() {
        return "Humain{" +
                "nom='" + nom  +
                '}';
    } 

    public void meurt() {
        System.out.println(nom + " est mort.");
    }
    
  
}