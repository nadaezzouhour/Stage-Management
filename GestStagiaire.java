package stagess;
import java.util.ArrayList;
public class GestStagiaire implements Gestion<Stagiaire> {
    private ArrayList<Stagiaire> stagiaires;
    public GestStagiaire() {
        stagiaires = new ArrayList<>();}
    @Override
    public void ajouter(Stagiaire stagiaire) {
        for (Stagiaire s : stagiaires) {
            if (s.getNom().equalsIgnoreCase(stagiaire.getNom()) && s.getPrenom().equalsIgnoreCase(stagiaire.getPrenom())) {
                System.out.println("Erreur : Ce stagiaire existe déjà !");
                return;
            }}
        stagiaires.add(stagiaire);
        System.out.println("Stagiaire ajouté avec succès !");}
    @Override
    public void supprimer(String nom) {
        Stagiaire aSupprimer = null;
        for (Stagiaire s : stagiaires) {
            if (s.getNom().equalsIgnoreCase(nom)) {
                aSupprimer = s;
                break;
            }}
        if (aSupprimer != null) {
            stagiaires.remove(aSupprimer);
            System.out.println("Stagiaire supprimé avec succès !");
        } else {
            System.out.println("Erreur : Aucun stagiaire trouvé avec ce nom.");
        }}
    @Override
    public void afficher() {
        if (stagiaires.isEmpty()) {
            System.out.println("Aucun stagiaire à afficher.");
            return;}
        System.out.println("Liste des stagiaires :");
        for (Stagiaire s : stagiaires) {
            s.afficherInformations();}}
    public ArrayList<Stagiaire> getStagiaires() {
        return stagiaires;}}

