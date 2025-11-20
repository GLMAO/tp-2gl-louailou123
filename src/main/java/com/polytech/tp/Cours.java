package com.polytech.tp;

public class Cours implements ICours {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    
   public Cours(CoursBuilder builder) {
        this.matiere = builder.matiere;
        this.enseignant = builder.enseignant;
        this.salle = builder.salle;
        this.date = builder.date;
        this.heureDebut = builder.heureDebut;
        this.estOptionnel = builder.estOptionnel;
        this.niveau = builder.niveau;
        this.necessiteProjecteur=builder.necessiteProjecteur;
    }

    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5; 
    }
    
    
    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }
}