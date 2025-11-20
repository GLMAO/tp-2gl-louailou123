package com.polytech;

import com.polytech.tp.ICours;
import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;
import com.polytech.tp.CoursEnLigne;
import com.polytech.tp.Observer;
import com.polytech.tp.Etudiant;
import com.polytech.tp.Responsable;
import com.polytech.tp.GestionnaireEmploiDuTemps;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {



        // =========================
        // 1️⃣ Builder Pattern
        // =========================
        CoursBuilder builder = new CoursBuilder();
        ICours coursBuilder = builder
                .setMatiere("Génie Logiciel")
                .setEnseignant("Mr Martin")
                .setSalle("B12")
                .setDate("Lundi")
                .setHeureDebut("8h00")
                .setEstOptionnel(false)
                .setNiveau("2A")
                .setNecessiteProjecteur(true)
                .build();

        System.out.println("Cours créé avec Builder : " + coursBuilder.getDescription());

        // =========================
        // 2️⃣ Decorator Pattern
        // =========================
        ICours coursEnLigne = new CoursEnLigne(coursBuilder);
        System.out.println("Cours décoré : " + coursEnLigne.getDescription());

        // =========================
        // 3️⃣ Observer Pattern
        // =========================
        Observer etudiant = new Etudiant("Alice");
        Observer responsable = new Responsable("Prof. Bernard");

        GestionnaireEmploiDuTemps gestion = new GestionnaireEmploiDuTemps();
        gestion.attach(etudiant);
        gestion.attach(responsable);

        // Ajouter un cours -> notification
        gestion.ajouterCours(coursBuilder);

        // Modifier un cours -> notification
        gestion.modifierCours(coursBuilder, "Salle changée en B14");

        // Notifier un changement général
        gestion.setChangement("Attention : pas de cours vendredi");

        // Supprimer un cours -> notification
        gestion.supprimerCours(coursBuilder);
    }
}

