package entity;

import java.util.ArrayList;

public class Patient extends Personne {
    private String id;
    ArrayList<RendezVous> rendezVous = new ArrayList<>();

    public Patient(String id){
        super();
        this.id = id;

    }

    public ArrayList<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public void addRdv(RendezVous rdv) {
        if (rdv != null) {
            rendezVous.add(rdv);
    }}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Patient [nom=" + nom + ", id=" + id + ", prenom=" + prenom + ", addresse=" + addresse + "]";
    }}
