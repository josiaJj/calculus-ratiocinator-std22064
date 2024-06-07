package school.hei.calculusratiocinator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AffirmationComposeeTest {
    @Test
    public void lou_est_pauvre_et_lou_est_genereux() {
        var louEstPauvre = new AffirmationSimple("Lou est pauvre");
        var louEstGenereux = new AffirmationSimple("Lou est généreux");

        var louEstPauvreEtGenereux = new AffirmationComposee(louEstPauvre, ConjonctionDeCoordination.ET, louEstGenereux);
        var valeurAttendue = ValeurDeVerite.faux;
        var valeurActuel = louEstPauvreEtGenereux.calculerValeurDeVerite();
        assertEquals(valeurActuel, valeurAttendue);
    }

    @Test
    public void lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre() {
        var louEstBeau = new AffirmationSimple("Lou est beau");
        var louEstPauvre = new AffirmationSimple("Lou est pauvre");
        var louEstGenereux = new AffirmationSimple("Lou est généreux");

        var louEstBeauOuLouEstGenereux = new AffirmationComposee(louEstBeau, ConjonctionDeCoordination.OU, louEstGenereux);
        var lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre = new AffirmationComposee(louEstBeauOuLouEstGenereux , ConjonctionDeCoordination.DONC, louEstPauvre);
        var valeurAttendue = ValeurDeVerite.faux;
        var valeurActuel = lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre.calculerValeurDeVerite();
        assertEquals(valeurActuel, valeurAttendue);
    }
}
