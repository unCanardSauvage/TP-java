

public class Ville {
    private String nom;
    private double superficie;
    private int population;

    public Ville(String nom, double superficie, int population){
            this.nom = nom;
            this.superficie = superficie;
            this.population = population;
        }

    public Ville() {
        this.nom = "inconnu";
        this.superficie = 0;
        this.population = 0;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getPopulation() {
        return population;
        }
    public void setPopulation(int population) {
        this.population = population;
    }
}
