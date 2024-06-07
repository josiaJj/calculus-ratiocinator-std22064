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
}
