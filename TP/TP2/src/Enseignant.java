public class Enseignant extends Personnel {
    private String matierePrincipale;
    private String matiereSecondaire;

    public Enseignant () {
        super();
        this.matierePrincipale = "aucune";
        this.matiereSecondaire = "aucune";
    }

    public Enseignant (String nom, String prenom, int age, String matierePrincipale, String matiereSecondaire) {
        super("Enseignement", nom, prenom, age);
        this.matierePrincipale = matierePrincipale;
        this.matiereSecondaire = matiereSecondaire;
    }

    public String getMatierePrincipale() {
        return matierePrincipale;
    }

    public void setMatierePrincipale(String matierePrincipale) {
        this.matierePrincipale = matierePrincipale;
    }

    public String getMatiereSecondaire() {
        return matiereSecondaire;
    }

    public void setMatiereSecondaire(String matiereSecondaire) {
        this.matiereSecondaire = matiereSecondaire;
    }

    public void ouMeTrouver(){
        System.out.println("Ce n’est pas la peine de me chercher, je saurai vous trouver!");
    }

    public String toString() {
        String uneChaine = super.toString();
        String maChaine = uneChaine + " en " + matierePrincipale + " et en " + matiereSecondaire + ".";
        return maChaine;
    }
}
