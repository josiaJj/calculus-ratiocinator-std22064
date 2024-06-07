package school.hei.calculusratiocinator;

public sealed abstract class Affirmation permits
    AffirmationSimple, AffirmationComposee {
    public abstract ValeurDeVerite calculerValeurDeVerite();
}
