package entity;

import java.util.ArrayList;

public class Secretaire extends Personne {
    private String matricule;

  

    ArrayList<RendezVous> rendezVous = new ArrayList<>();

    public Secretaire(String matricule){
        super();
        this.matricule = matricule;

    }

    public ArrayList<RendezVous> getRendezVous() {
        return rendezVous;
    }

    

    public void addRdv(RendezVous rdv) {
        if (rdv != null) {
            rendezVous.add(rdv);
    }}

        

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }


    @Override
    public String toString() {
        return "Secretaire [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", addresse=" + addresse
                + "]";
    }





}
