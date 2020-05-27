import java.util.ArrayList;
import java.util.Collections;

public class TP3 {
    public static void main(String[] args) {
        Cours monCours = new Cours("Yop tout le monde", "un cours", 2);
        Formation maFormation = new Formation("jzzmd", "une formation");

        Cours monDeuxiemeCours = new Cours("deux", "deux cours", 2);
        Cours monTroisiemeCours = new Cours("trois", "trois cours", 3);
        Cours monQuatriemeCours = new Cours("quatre", "quatre cours", 4);
        Cours monCinquiemeCours = new Cours("cinq", "cinq cours", 5);
        Cours monSixiemeCours = new Cours("six", "six cours", 1);
        Cours monSeptiemeCours = new Cours("sept", "sept cours", 3);

        maFormation.setListCours(monCours);
        maFormation.setListCours(monDeuxiemeCours);
        maFormation.setListCours(monTroisiemeCours);
        maFormation.setListCours(monQuatriemeCours);
        maFormation.setListCours(monCinquiemeCours);
        maFormation.setListCours(monSixiemeCours);
        maFormation.setListCours(monSeptiemeCours);

        System.out.println(monCours.toString());
        System.out.println(maFormation.toString());

        // entrer 2 pour supprimer le deuxième cours. Oui oui, il y a un - 1 qui sera appliqué au nombre entré pour rendre la chose plus naturelle ^^
        maFormation.retirerCours(2);

        System.out.println(maFormation.toString());

        maFormation.afficherCours(2);


        Collections.sort(maFormation.getListCours());

        System.out.println(maFormation.toString());
    }
}
