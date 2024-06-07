package school.hei.calculusratiocinator;

public class AffirmationComposee implements Affirmation{
    private final Affirmation affirmationNum1;
    private final ConjonctionDeCoordination conjonctionDeCoordination;
    private final Affirmation affirmationNum2;

    public AffirmationComposee(Affirmation affirmationNum1, ConjonctionDeCoordination conjonctionDeCoordination, Affirmation affirmationNum2) {
        this.affirmationNum1 = affirmationNum1;
        this.conjonctionDeCoordination = conjonctionDeCoordination;
        this.affirmationNum2 = affirmationNum2;
    }

    @Override
    public ValeurDeVerite calculerValeurDeVerite() {

        return ValeurDeVerite.jenesaispas;
    }

    @Override
    public String toString() {
        return affirmationNum1 + " " + conjonctionDeCoordination + " " + affirmationNum2;
    }
}
