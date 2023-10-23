package personnages;

public class Humain {

    
    protected String nom;
    protected String boissonFavorite;
    protected int argent;

    
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    
    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (prix <= argent) {
            argent -= prix;
            parler("J'ai acheté " + bien + " pour " + prix + " unités d'argent.");
        } else {
            parler("Je n'ai pas assez d'argent pour acheter " + bien + ".");
        }
    }

    public void gagnerArgent(int gain) {
        argent += gain;
        parler("J'ai gagné " + gain + " unités d'argent. J'ai maintenant " + argent + " unités d'argent.");
    }

    public void perdreArgent(int perte) {
        argent -= perte;
        if (argent < 0) {
            argent = 0;  
        }
        parler("J'ai perdu " + perte + " unités d'argent. Il me reste " + argent + " unités d'argent.");
    }

    
    protected void parler(String texte) {
        System.out.println(texte);
    }
}
