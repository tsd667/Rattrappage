package Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

import entity.AnnulerRdv;
import entity.Patient;
import entity.RendezVous;
import entity.StatusRdvEnum;

public class Service {

    private ArrayList<RendezVous> listeRdv = new ArrayList<>();
    private ArrayList<AnnulerRdv> annulations = new ArrayList<>();

    public void addRdv(RendezVous rdv) {
        if (rdv != null) {
            listeRdv.add(rdv);
        } }

    public RendezVous searchRdvById(int id) {
        for (RendezVous rdv : listeRdv) {
            if (rdv.getId() == id) {
                return rdv;
            }
        }
        return null;
    }

    public ArrayList<RendezVous> getListeRdv() {
        return listeRdv;
    }
    
     public boolean validerRdv(int idRdv) {
        RendezVous rdv = searchRdvById(idRdv);
    
        if (rdv == null) {
            return false;
        }
    
        if (rdv.getStatus() != StatusRdvEnum.En_attente) {
            return false;
        }
    
        if (rdv.getMedecin() == null) {
            return false;
        }
    
        rdv.setStatus(StatusRdvEnum.Valide);
        return true;
    }
    
    
    public boolean demandeRdv(Patient patient, LocalDateTime date) {
    if (patient == null) return false;

    RendezVous rdv = new RendezVous( date,patient);
    rdv.setStatus(StatusRdvEnum.En_attente);

    listeRdv.add(rdv);
    patient.addRdv(rdv);

    return true;
  }

    
    


    public boolean annulationRdv(int idRendezVous, String motif) {
        RendezVous rdv = searchRdvById(idRendezVous);
        if (rdv == null) {    
        LocalDateTime maintenant = LocalDateTime.now();
        LocalDateTime dateRdv = rdv.getDate();

        Duration delai = Duration.between(maintenant, dateRdv);

        if (delai.toHours() >= 48) {
            AnnulerRdv annulation = new AnnulerRdv(annulations.size() + 1, motif, idRendezVous);
            annulations.add(annulation);
            rdv.setStatus(StatusRdvEnum.Annuler);
            return true;

        } else {
            return false;
        }
    }


     }
    
    
    
    }