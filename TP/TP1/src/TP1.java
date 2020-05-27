import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Ville monDijon = new Ville("Dijon", 40.41, 375831);
        Ville monQuetigny = new Ville("Quetigny", 8.19, 9690);
        Ville monBaune = new Ville("Baune", 31.3, 52741);

        Departement maCoteDOr = new Departement("Côte d'Or", 21, 3);

        maCoteDOr.ajouterVille(monDijon);
        maCoteDOr.ajouterVille(monQuetigny);
        maCoteDOr.ajouterVille(monBaune);

/*        System.out.println(monDijon.getNom() + ", "
                + monDijon.getSuperficie() + " kilomètres carrés, pour "
                + monDijon.getPopulation() + " habitants.");

 */
    }
}
