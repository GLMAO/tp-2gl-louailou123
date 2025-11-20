package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {

    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    // Ajouter un cours et notifier tous les observateurs
    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String msg = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(msg);
        notifyObservers(msg);
    }

    // Modifier un cours et notifier tous les observateurs
    public void modifierCours(ICours cours, String message) {
        // Ici tu peux ajouter la logique de modification du cours si nécessaire
        String msg = "Cours modifié : " + cours.getDescription() + " (" + message+ ")";
        System.out.println(msg);
        notifyObservers(msg);
    }

    // Supprimer un cours et notifier tous les observateurs
    public void supprimerCours(ICours cours) {
        if (listeCours.remove(cours)) {
            String msg = "Cours supprimé : " + cours.getDescription();
            System.out.println(msg);
            notifyObservers(msg);
        } else {
            System.out.println("Cours non trouvé : " + cours.getDescription());
        }
    }

    // Notifier un changement général à tous les observateurs
    public void setChangement(String message) {
        System.out.println("Notification générale : " + message);
        notifyObservers(message);
    }
}
