public class Administratif extends Personnel {
    private String fonction;

    public Administratif () {
        super();
        this.fonction = "non spécifiée";
    }

    public Administratif (String nom, String prenom, int age, String fonction) {
        super ("Administratif", nom, prenom, age);
        this.fonction = fonction;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void ouMeTrouver(){
        System.out.println("Le plus facile c’est de passer à mon bureau.");
    }

    public String toString() {
        String uneChaine = super.toString();
        String maChaine = uneChaine + ", " + fonction + ".";
        return maChaine;
    }
}
