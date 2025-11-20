package com.polytech.tp;

public class CoursBuilder {
    // TODO: Implémenter le pattern Builder
    String matiere;
    String enseignant;
    String salle;
    String date;
    String heureDebut;
    boolean estOptionnel;
    String niveau;
    boolean necessiteProjecteur;
    
    public CoursBuilder setMatiere(String matiere) { 
        this.matiere = matiere;
        return this;}
    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }
    
    
    public Cours build() {
  return new Cours(this);
    }
}