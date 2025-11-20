package com.polytech.tp;

public class CoursMagistral extends CoursDecorator {

    public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // Ajoute le suffixe "(En ligne)" à la description du cours décoré
        return coursDecorated.getDescription() + " (Magistral)";
    }

    @Override
    public double getDuree() {
        // On délègue la durée au cours de base
        return coursDecorated.getDuree();
    }
}
