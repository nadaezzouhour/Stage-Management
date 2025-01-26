package stagess;
import java.util.Scanner;
public class App {
    private GestStagiaire gestionStagiaires;
    private GestStage gestionStages;
    public App() {
        gestionStagiaires = new GestStagiaire();
        gestionStages = new GestStage();}
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un stagiaire");
            System.out.println("2. Supprimer un stagiaire");
            System.out.println("3. Afficher tous les stagiaires");
            System.out.println("4. Ajouter un stage");
            System.out.println("5. Associer un stagiaire à un stage");
            System.out.println("6. Afficher tous les stages");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1 -> ajouterStagiaire(scanner);
                case 2 -> supprimerStagiaire(scanner);
                case 3 -> gestionStagiaires.afficher();
                case 4 -> ajouterStage(scanner);
                case 5 -> associerStagiaire(scanner);
                case 6 -> gestionStages.afficher();
                case 7 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide.");
            }
        } while (choix != 7);
        scanner.close();}
    private void ajouterStagiaire(Scanner scanner) {
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Niveau d'étude : ");
        String niveau = scanner.nextLine();
        gestionStagiaires.ajouter(new Stagiaire(nom, prenom, niveau));}
    private void supprimerStagiaire(Scanner scanner) {
        System.out.print("Nom du stagiaire à supprimer : ");
        String nom = scanner.nextLine();
        gestionStagiaires.supprimer(nom);}
    private void ajouterStage(Scanner scanner) {
        System.out.print("Titre : ");
        String titre = scanner.nextLine();
        System.out.print("Durée : ");
        int duree = scanner.nextInt();
        scanner.nextLine();
        gestionStages.ajouter(new Stage(titre, duree));}
    private void associerStagiaire(Scanner scanner) {
        System.out.print("Titre du stage : ");
        String titre = scanner.nextLine();
        System.out.print("Nom du stagiaire : ");
        String nom = scanner.nextLine();
        Stage stage = gestionStages.getStages().stream().filter(s -> s.getTitre().equalsIgnoreCase(titre)).findFirst().orElse(null);
        Stagiaire stagiaire = gestionStagiaires.getStagiaires().stream().filter(s -> s.getNom().equalsIgnoreCase(nom)).findFirst().orElse(null);
        if (stage == null) {
            System.out.println("Stage non trouvé !");
        } else if (stagiaire == null) {
            System.out.println("Stagiaire non trouvé !");
        } else {
            stage.associerStagiaire(stagiaire);
            System.out.println("Stagiaire associé au stage !");}}
    public static void main(String[] args) {
        App app = new App();
        app.menu();}
}
