package entity;

public class Medecin extends Personne {
    
    private String id;
    private SpecialiteEnum specialite;

    public Medecin(String id){
        super();
        this.id = id;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public SpecialiteEnum getSpecialite() {
        return specialite;
    }
    
    public void setSpecialite(SpecialiteEnum specialite) {
        this.specialite = specialite;
    }


    @Override
    public String toString() {
        return "Patient [nom=" + nom + ", id=" + id + ", prenom=" + prenom + ", addresse=" + addresse + "]";

}



}
