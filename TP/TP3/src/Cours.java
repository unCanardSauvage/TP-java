public class Cours implements Comparable {
    private String code;
    private String intitule;
    private float volHoraire;

    public Cours(String code, String intitule, float volHoraire) {
        this.code = code;
        this.intitule = intitule;
        this.volHoraire = volHoraire;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public float getVolHoraire() {
        return volHoraire;
    }
    public void setVolHoraire(float volHoraire) {
        this.volHoraire = volHoraire;
    }

    public String toString() {
        String sautLigne = System.getProperty("line.separator");
        String uneChaine;
        uneChaine =  sautLigne + "Cours{" +
                "code ='" + code + '\'' +
                ", intitulé ='" + intitule + '\'' +
                ", volume horaire =" + volHoraire +
                '}';

            return uneChaine;

    }

    @Override
    public int compareTo(Object obj) {
        String intitule = ((Cours)obj).getIntitule();
        return this.intitule.compareTo(intitule);

    }
}
