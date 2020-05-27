public abstract class Personnel extends Personne {
    protected  String service;

    public Personnel () {
        super();
        this.service = "non spécifié";
    }

    public Personnel (String service, String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.service = service;
    }

    public void afficherAge() {
        System.out.println( "Ce personnel a " + age + " an(s)" );
    }

    public void afficherPrenom() {
        System.out.println( "Ce personnel s'appelle " + prenom );
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public abstract void ouMeTrouver();

    public String toString() {
        String uneChaine = super.toString();
        String maChaine = uneChaine + "du service " + service;
        return maChaine;
    }
}
