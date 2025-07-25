package views;

import entity.Secretaire;
import java.util.Scanner;

public class SecretaireView {
    private Scanner scanner = new Scanner(System.in);

    public Secretaire saisirSecretaire() {
        System.out.print("Entrez le matricule de la secrétaire : ");
        String matricule = scanner.nextLine();

        System.out.print("Entrez le nom de la secrétaire : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom de la secrétaire : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez l'adresse de la secrétaire : ");
        String adresse = scanner.nextLine();

        Secretaire secretaire = new Secretaire(matricule);
        secretaire.setNom(nom);
        secretaire.setPrenom(prenom);
        secretaire.setAddresse(adresse);

        return secretaire;
    }
}
