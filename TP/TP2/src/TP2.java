public class TP2 {
    public static void main(String[] args) {
        Etudiant Alice  = new Etudiant("Boucquemontagne", "Alice", 21, "Pascal", 0);
        Etudiant Benjamin = new Etudiant("Dujardin", "Benjamin", 22, "Ohm", 0);
        Etudiant premierInconnu = new Etudiant();
        Etudiant deuxiemeInconnu = new Etudiant();

        Administratif Beatrice = new Administratif("Dupont", "Beatrice", 19, "secrétaire");
        Enseignant Boris = new Enseignant("Machin", "Boris", 36, "informatique", "électronique");

        Alice.ouMeTrouver();
        Beatrice.ouMeTrouver();
        Boris.ouMeTrouver();


        Personne monTableauAMoi [] = {Alice, Benjamin, premierInconnu, deuxiemeInconnu, Beatrice, Boris};

        for (int i = 0; i < 6; i++) {
            //monTableauAMoi[i].ouMeTrouver();
            String uneChaine = monTableauAMoi[i].toString();
            System.out.println(uneChaine);
        }

        premierInconnu.setPrenom("Sebastien");
        premierInconnu.setNom("Truc");
        premierInconnu.setAge(23);
        premierInconnu.setPromotion("Ohm");
        premierInconnu.setNbAbsences(3);

        deuxiemeInconnu.setPrenom("Isabelle");
        deuxiemeInconnu.setNom("Bidule");
        deuxiemeInconnu.setAge(19);
        deuxiemeInconnu.setPromotion("Pascal");
        deuxiemeInconnu.setNbAbsences(6);

        System.out.println("---------------------------------------------");

        for (int i = 0; i < 6; i++) {
            //monTableauAMoi[i].ouMeTrouver();
            String uneChaine = monTableauAMoi[i].toString();
            System.out.println(uneChaine);
        }

    }
}
