package school.hei.calculusratiocinator;

public final class AffirmationComposee extends Affirmation{
    private final Affirmation affirmationNum1;
    private final ConjonctionDeCoordination conjonctionDeCoordination;
    private final Affirmation affirmationNum2;

    public AffirmationComposee(Affirmation affirmationNum1, ConjonctionDeCoordination conjonctionDeCoordination, Affirmation affirmationNum2) {
        this.affirmationNum1 = affirmationNum1;
        this.conjonctionDeCoordination = conjonctionDeCoordination;
        this.affirmationNum2 = affirmationNum2;
    }

    public static AffirmationComposee of(Affirmation affirmationNum1, ConjonctionDeCoordination conjonctionDeCoordination, Affirmation affirmationNum2) {
        return new AffirmationComposee(affirmationNum1, conjonctionDeCoordination, affirmationNum2);
    }

    @Override
    public ValeurDeVerite calculerValeurDeVerite() {

        switch (conjonctionDeCoordination) {
            case ET:
                return affirmationNum1.calculerValeurDeVerite() == ValeurDeVerite.vrai && affirmationNum2.calculerValeurDeVerite() == ValeurDeVerite.vrai ? ValeurDeVerite.vrai : ValeurDeVerite.faux;
            case OU:
                return affirmationNum1.calculerValeurDeVerite() == ValeurDeVerite.vrai || affirmationNum2.calculerValeurDeVerite() == ValeurDeVerite.vrai ? ValeurDeVerite.vrai : ValeurDeVerite.faux;
            case DONC:
                return affirmationNum1.calculerValeurDeVerite() == ValeurDeVerite.vrai && affirmationNum2.calculerValeurDeVerite() == ValeurDeVerite.faux ? ValeurDeVerite.faux : ValeurDeVerite.vrai;
            default:
                throw new IllegalArgumentException(conjonctionDeCoordination + " n'est pas une conjonction de Coordination");
        }
    }

    @Override
    public String toString() {
        return affirmationNum1 + " " + conjonctionDeCoordination + " " + affirmationNum2;
    }
}
