public class Etudiant extends Personne {
    private String promotion;
    private int nbAbsences;

    public Etudiant () {
        super();
        this.promotion = "non spécifiée";
        this.nbAbsences = 0;
    }

    public Etudiant (String nom, String prenom, int age, String promotion, int nbAbsences) {
        super(nom, prenom, age);
        this.promotion = promotion;
        this.nbAbsences = nbAbsences;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public int getNbAbsences() {
        return nbAbsences;
    }

    public void setNbAbsences(int nbAbsences) {
        this.nbAbsences = nbAbsences;
    }

    public void ouMeTrouver(){
        System.out.println("Je suis en cours tous les jours, sauf les jeudis après-midis " +
                "(je fais du sport, mais c’est comme un cours car j’aime le sport).");
    }

    public String toString() {
        String uneChaine = super.toString();
        String maChaine = uneChaine + "élève en promotion " + promotion + " et comptant " + nbAbsences + " absence(s).";
        return maChaine;
    }
}
