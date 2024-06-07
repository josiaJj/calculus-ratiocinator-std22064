package school.hei.calculusratiocinator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AffirmationSimpleTest {
    @Test
    public void lou_est_beau() {
        Affirmation louEstBeau = new AffirmationSimple("Lou est beau");
        ValeurDeVerite valeurActuel = louEstBeau.calculerValeurDeVerite();
        ValeurDeVerite valeurAttendue = ValeurDeVerite.vrai;
        assertEquals(valeurActuel, valeurAttendue);
    }

    @Test
    public void lou_est_pauvre() {
        Affirmation louEstPauvre = new AffirmationSimple("Lou est pauvre");
        ValeurDeVerite valeurActuel = louEstPauvre.calculerValeurDeVerite();
        ValeurDeVerite valeurAttendue = ValeurDeVerite.faux;
        assertEquals(valeurActuel, valeurAttendue);
    }

    @Test
    public void lou_est_genereux() {
        Affirmation louEstGenereux = new AffirmationSimple("Lou est généreux");
        ValeurDeVerite valeurActuel = louEstGenereux.calculerValeurDeVerite();
        ValeurDeVerite valeurAttendue = ValeurDeVerite.jenesaispas;
        assertEquals(valeurActuel, valeurAttendue);
    }

}
