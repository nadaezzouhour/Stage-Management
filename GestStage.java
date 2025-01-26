package stagess;
import java.util.ArrayList;
public class GestStage implements Gestion<Stage> {
    private ArrayList<Stage> stages;
    public GestStage() {
        stages = new ArrayList<>();}
    @Override
    public void ajouter(Stage stage) {
        for (Stage s : stages) {
            if (s.getTitre().equalsIgnoreCase(stage.getTitre())) {
                System.out.println("Erreur : Ce stage existe déjà !");
                return;
            }}
        stages.add(stage);
        System.out.println("Stage ajouté avec succès !");}
    @Override
    public void supprimer(String titre) {
        Stage aSupprimer = null;
        for (Stage s : stages) {
            if (s.getTitre().equalsIgnoreCase(titre)) {
                aSupprimer = s;
                break;
            }}
        if (aSupprimer != null) {
            stages.remove(aSupprimer);
            System.out.println("Stage supprimé avec succès !");
        } else {
            System.out.println("Erreur : Aucun stage trouvé avec ce titre.");
        }}
    @Override
    public void afficher() {
        if (stages.isEmpty()) {
            System.out.println("Aucun stage à afficher.");
            return;}
        System.out.println("Liste des stages :");
        for (Stage s : stages) {
            s.afficherStage();}}
    public ArrayList<Stage> getStages() {
        return stages;}}
