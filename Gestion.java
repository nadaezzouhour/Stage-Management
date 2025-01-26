package stagess;
public interface Gestion<T> {
    void ajouter(T element);
    void supprimer(String critere);
    void afficher();}
