package entity;

public abstract class Personne{
    protected String nom;
    protected String prenom;
    protected String addresse;

    protected Personne(){}


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAddresse() {
        return addresse;
    }
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }


    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", addresse=" + addresse + "]";
    }

    
}