package school.hei.calculusratiocinator;

public class AffirmationSimple implements Affirmation {
    private final String valeur;

    public AffirmationSimple(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public ValeurDeVerite calculerValeurDeVerite() {

        return ValeurDeVerite.jenesaispas;
    }

    @Override
    public String toString() {
        return valeur;
    }
}
