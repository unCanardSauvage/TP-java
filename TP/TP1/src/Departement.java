public class Departement {
    private String nom;
    private int numero;
    private int nbVilles;
    private int compterVille;
    private Ville tabVille[];

    public Departement(String nom, int numero, int nbVilles){
        this.nom = nom;
        this.numero = numero;
        this.nbVilles = nbVilles;
        this.tabVille = new Ville[nbVilles];
        this.compterVille = 0;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNbVilles() {
        return nbVilles;
    }
    public void setNbVilles(int nbVilles) {
        this.nbVilles = nbVilles;
    }

    public int getCompterVille() {
        return compterVille;
    }
    public void setCompterVille(int compterVille) {
        this.compterVille = compterVille;
    }

    public Ville[] getTabVille() {
        return tabVille;
    }
    public void setTabVille(Ville[] tabVille) {
        this.tabVille = tabVille;
    }

    public void ajouterVille(Ville uneVille) {
        if(compterVille < nbVilles){
            tabVille[compterVille] = uneVille;
            compterVille ++;
            System.out.println(uneVille.getNom() + ", "
                    + uneVille.getSuperficie() + " kilomètres carrés, pour "
                    + uneVille.getPopulation() + " habitants.");
        }
        else {
            System.out.println("Trop de villes !");
        }
    }

}
