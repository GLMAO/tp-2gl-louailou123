package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // Ajoute le suffixe "(En ligne)" à la description du cours décoré
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // On délègue la durée au cours de base
        return coursDecorated.getDuree();
    }
}
