package school.hei.calculusratiocinator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Affirmations
        Affirmation louEstBeau = new AffirmationSimple("Lou est beau");
        Affirmation louEstPauvre = new AffirmationSimple("Lou est pauvre");
        Affirmation louEstGenerous = new AffirmationSimple("Lou est généreux");

        // Affirmations composées
        Affirmation louEstPauvreEtGenerous = new AffirmationComposee(louEstPauvre, ConjonctionDeCoordination.ET, louEstGenerous);
        Affirmation louEstBeauImpliqueLouEstPauvre = new AffirmationComposee(louEstBeau, ConjonctionDeCoordination.DONC, louEstPauvre);
        Affirmation louEstPauvreImpliqueLouEstGenerous = new AffirmationComposee(louEstPauvre, ConjonctionDeCoordination.DONC, louEstGenerous);
        Affirmation louEstBeauOuLouEstGenerousImpliqueLouEstPauvre = new AffirmationComposee(new AffirmationComposee(louEstBeau, ConjonctionDeCoordination.OU, louEstGenerous), ConjonctionDeCoordination.DONC, louEstPauvre);
        Affirmation affirmationNiveaux1 = new AffirmationComposee(louEstBeauOuLouEstGenerousImpliqueLouEstPauvre, ConjonctionDeCoordination.ET, new AffirmationComposee(louEstPauvre, ConjonctionDeCoordination.OU, louEstGenerous));

        //
        System.out.println("Lou est pauvre et Lou est généreux: " + louEstPauvreEtGenerous.calculerValeurDeVerite());
        System.out.println("Lou est beau. Donc Lou est pauvre: " + louEstBeauImpliqueLouEstPauvre.calculerValeurDeVerite());
        System.out.println("Lou est pauvre. Donc Lou est généreux: " + louEstPauvreImpliqueLouEstGenerous.calculerValeurDeVerite());
        System.out.println("Lou est beau ou Lou est généreux. Donc Lou est pauvre: " + louEstBeauOuLouEstGenerousImpliqueLouEstPauvre.calculerValeurDeVerite());
        System.out.println("Premièrement: « Lou est beau ou Lou est généreux » et deuxièmement: « Lou est pauvre ou Lou est généreux ». Donc Lou est pauvre: " + affirmationNiveaux1.calculerValeurDeVerite());

    }
}