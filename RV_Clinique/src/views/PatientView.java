package views;

import entity.Patient;
import java.util.Scanner;

public class PatientView {
    private Scanner scanner = new Scanner(System.in);

    public Patient saisirPatient() {
        System.out.print("Entrez l'ID du patient : ");
        String id = scanner.nextLine();

        System.out.print("Entrez le nom du patient : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom du patient : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez l'adresse du patient : ");
        String adresse = scanner.nextLine();

        Patient patient = new Patient(id);
        patient.setNom(nom);
        patient.setPrenom(prenom);
        patient.setAddresse(adresse);

        System.out.println("Patient créé : " + patient);
        return patient;
    }}
