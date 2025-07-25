package entity;

import java.time.LocalDateTime;

public class RendezVous {
    private static int compteurId = 0;
    
    private int id;
    private StatusRdvEnum status; 
    private LocalDateTime date;
    private Patient patient;
    private Medecin medecin;
    
    public RendezVous(LocalDateTime date, Patient patient) {
        this.id =++compteurId;
        this.status = StatusRdvEnum.En_attente;
        this.date = date;
        this.patient = patient;
    }

    public RendezVous(Patient patient) {
        this.id = ++compteurId;
        this.status = StatusRdvEnum.En_attente;
        this.date = LocalDateTime.now();
        this.patient = patient;
    }

    public RendezVous(int id, Patient patient, Medecin medecin) {
        this.id = id;
        this.status = StatusRdvEnum.En_attente;
        this.date = LocalDateTime.now();
        this.patient = patient;
        this.medecin = medecin;
        if (id > compteurId) {
            compteurId = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusRdvEnum getStatus() {
        return status;
    }

    public void setStatus(StatusRdvEnum status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        return "RendezVous [id=" + id + ", status=" + status + ", date=" + date + ", patient=" + patient + ", medecin=" + medecin + "]";
    }
}
