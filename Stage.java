package stagess;
import java.util.ArrayList;
public class Stage {
    private String titre;
    private int duree;
    private ArrayList<Stagiaire> stagiairesAssocies;
    public Stage(String titre, int duree) {
        this.titre = titre;
        this.duree = duree;
        this.stagiairesAssocies = new ArrayList<>();}
    public String getTitre() {
        return titre;}
    public void associerStagiaire(Stagiaire stagiaire) {
        stagiairesAssocies.add(stagiaire);}
    public void afficherStage() {
        System.out.println("Titre: " + titre + ", Durée: " + duree + " jours");
        System.out.println("Stagiaires associés:");
        for (Stagiaire s : stagiairesAssocies) {
            s.afficherInformations();}}}
