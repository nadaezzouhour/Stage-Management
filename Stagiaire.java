package stagess;

public class Stagiaire {
    private String nom;
    private String prenom;
    private String niveauEtude;

    public Stagiaire(String nom, String prenom, String niveauEtude) {
        this.nom = nom;
        this.prenom = prenom;
        this.niveauEtude = niveauEtude;}
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public String getNiveauEtude() {return niveauEtude;}
    public void afficherInformations() {
        System.out.println("Nom:"+nom+",Prénom:"+prenom+",Niveau:"+niveauEtude);
    }
}

