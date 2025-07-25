package entity;

import java.time.LocalDateTime;

public class AnnulerRdv {
    private int id;
    private LocalDateTime date;
    private String motif;
    private int idRendezVous;

    public AnnulerRdv(int id, String motif, int idRendezVous) {
        this.id = id;
        this.motif = motif;
        this.idRendezVous = idRendezVous;
        this.date = LocalDateTime.now();
    }


    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getMotif() {
        return motif;
    }

    public int getIdRV() {
        return idRendezVous;
    }

    @Override
    public String toString() {
        return "DemandeAnnulation [id=" + id + ", date=" + date + ", motif=" + motif + ", idRendezVous=" + idRendezVous + "]";
    }


}
