import java.util.ArrayList;

public class Formation {
    private String codeF;
    private String nom;
    private ArrayList<Cours> listCours;


    public Formation(String codeF, String nom) {
        this.codeF = codeF;
        this.nom = nom;
        this.listCours = new ArrayList<Cours>();
    }

    public String getCodeF() {
        return codeF;
    }
    public void setCodeF(String codeF) {
        this.codeF = codeF;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Cours> getListCours() {
        return listCours;
    }
    public void setListCours(Cours cours) {
        this.listCours.add(cours);
    }

    @Override
    public String toString() {
        String sautLigne = System.getProperty("line.separator");
        return "Formation{" +
                "codeF='" + codeF + '\'' +
                ", nom='" + nom + '\'' + sautLigne +
                "listCours=" + listCours +
                '}';
    }

    public void retirerCours(int numero) {
        numero --;
        this.listCours.remove(numero);
    }

    public void afficherCours(int numero) {
        numero --;
        System.out.println(this.listCours.get(numero));
    }
}
