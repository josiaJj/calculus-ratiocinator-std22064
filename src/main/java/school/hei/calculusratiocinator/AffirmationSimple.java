package school.hei.calculusratiocinator;

import lombok.Getter;

@Getter
public class AffirmationSimple implements Affirmation {
    private final String valeur;

    public AffirmationSimple(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public ValeurDeVerite calculerValeurDeVerite() {
        switch (valeur) {
            case "Lou est beau":
                return ValeurDeVerite.vrai;
            case "Lou est pauvre":
                return ValeurDeVerite.faux;
            case "Lou est généreux":
                return ValeurDeVerite.jenesaispas;
            default:
                return ValeurDeVerite.jenesaispas;
        }
    }

    @Override
    public String toString() {
        return valeur;
    }
}
