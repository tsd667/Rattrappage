package views;

import entity.AnnulerRdv;
import java.util.Scanner;

public class AnnulerRdvView {

    private Scanner scanner = new Scanner(System.in);

    public AnnulerRdv saisirAnnulation() {
        System.out.print("Entrez l'ID de l'annulation : ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Entrez le motif d'annulation : ");
        String motif = scanner.nextLine();

        System.out.print("Entrez l'ID du rendez-vous: ");
        int idRdv = Integer.parseInt(scanner.nextLine());

        AnnulerRdv annulation = new AnnulerRdv(id, motif, idRdv);
        System.out.println("Demande d'annulation créée : " + annulation);
        return annulation;
    }

}
