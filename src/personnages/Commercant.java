package personnages;

public class Commercant extends Humain {

 
    public Commercant(String nom, int argent) {
        super(nom, "th�", argent);  
    }

   
    public int seFaireExtorquer() {
        int argentPerdu = getArgent();  // Solution 1: utiliser le getter pour acc�der � l'argent
        parler("Le monde est vraiment trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);  
        parler("Je vous remercie avec d�f�rence pour votre g�n�rosit�.");
    }
}