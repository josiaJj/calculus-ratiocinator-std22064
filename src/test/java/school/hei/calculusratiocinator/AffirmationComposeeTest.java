package school.hei.calculusratiocinator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class AffirmationComposeeTest {
    @Test
    public void lou_est_pauvre_et_lou_est_genereux() {
        Affirmation louEstPauvre = new AffirmationSimple("Lou est pauvre");
        Affirmation louEstGenereux = new AffirmationSimple("Lou est généreux");

        Affirmation louEstPauvreEtGenereux = new AffirmationComposee(louEstPauvre, ConjonctionDeCoordination.ET, louEstGenereux);
        ValeurDeVerite valeurAttendue = ValeurDeVerite.faux;
        ValeurDeVerite valeurActuel = louEstPauvreEtGenereux.calculerValeurDeVerite();
        assertEquals(valeurActuel, valeurAttendue);
    }

    @Test
    public void lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre() {
        Affirmation louEstBeau = new AffirmationSimple("Lou est beau");
        Affirmation louEstPauvre = new AffirmationSimple("Lou est pauvre");
        Affirmation louEstGenereux = new AffirmationSimple("Lou est généreux");

        Affirmation louEstBeauOuLouEstGenereux = new AffirmationComposee(louEstBeau, ConjonctionDeCoordination.OU, louEstGenereux);
        Affirmation lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre = new AffirmationComposee(louEstBeauOuLouEstGenereux , ConjonctionDeCoordination.DONC, louEstPauvre);
        ValeurDeVerite valeurAttendue = ValeurDeVerite.faux;
        ValeurDeVerite valeurActuel = lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre.calculerValeurDeVerite();
        assertEquals(valeurActuel, valeurAttendue);
    }
}
