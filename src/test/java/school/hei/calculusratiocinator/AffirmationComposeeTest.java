package school.hei.calculusratiocinator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AffirmationComposeeTest {
    @Test
    public void lou_est_pauvre_et_lou_est_genereux() {
        // Affirmation louEstBeau = new AffirmationSimple("Lou est beau");
        Affirmation louEstPauvre = new AffirmationSimple("Lou est pauvre");
        Affirmation louEstGenereux = new AffirmationSimple("Lou est généreux");

        Affirmation louEstPauvreEtGenereux = new AffirmationComposee(louEstPauvre, ConjonctionDeCoordination.ET, louEstGenereux);
        ValeurDeVerite valeurAttendue = ValeurDeVerite.faux;
        ValeurDeVerite valeurActuel = louEstPauvreEtGenereux.calculerValeurDeVerite();
        assertEquals(valeurActuel, valeurAttendue);
    }
}
