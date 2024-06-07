package school.hei.calculusratiocinator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AffirmationSimpleTest {
    @Test
    public void lou_est_beau() {
        var louEstBeau = new AffirmationSimple("Lou est beau");
        var valeurActuel = louEstBeau.calculerValeurDeVerite();
        var valeurAttendue = ValeurDeVerite.vrai;
        assertEquals(valeurActuel, valeurAttendue);
    }

    @Test
    public void lou_est_pauvre() {
        var louEstPauvre = new AffirmationSimple("Lou est pauvre");
        var valeurActuel = louEstPauvre.calculerValeurDeVerite();
        var valeurAttendue = ValeurDeVerite.faux;
        assertEquals(valeurActuel, valeurAttendue);
    }

    @Test
    public void lou_est_genereux() {
        var louEstGenereux = new AffirmationSimple("Lou est généreux");
        var valeurActuel = louEstGenereux.calculerValeurDeVerite();
        var valeurAttendue = ValeurDeVerite.jenesaispas;
        assertEquals(valeurActuel, valeurAttendue);
    }

}
