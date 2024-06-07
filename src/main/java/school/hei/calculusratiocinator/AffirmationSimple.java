package school.hei.calculusratiocinator;

import lombok.Getter;

@Getter
public final class AffirmationSimple extends Affirmation {
    private final String valeur;

    public AffirmationSimple(String valeur) {
        this.valeur = valeur;
    }

    public static AffirmationSimple of(String valeur) {
        return new AffirmationSimple(valeur);
    }

    @Override
    public ValeurDeVerite calculerValeurDeVerite() {
        switch (valeur) {
            case "Lou est beau": return ValeurDeVerite.vrai;
            case "Lou est pauvre": return ValeurDeVerite.faux;
            case "Lou est généreux": return ValeurDeVerite.jenesaispas;
            default: return ValeurDeVerite.jenesaispas;
        }
    }

    @Override
    public String toString() {
        return valeur;
    }
}
