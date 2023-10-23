package personnages;

public class Ronin extends Humain {

    private int honneur;

    
    public Ronin(String nom, int argent) {
        super(nom, "saké", argent);  
        this.honneur = 1;  
    }
    
    public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");

        if (force >= adversaire.getReputation()) {
            int gain = adversaire.perdre();
            gagnerArgent(gain);
            honneur++;
            parler("Je t’ai eu petit yakusa!");
        } else {
            int perte = adversaire.perdre();
            honneur--;
            this.argent = 0:
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            adversaire.gagner(perte);
        }

   
    public void donner(Commercant beneficiaire) {
        int montantDonne = getArgent() / 10;  
        perdreArgent(montantDonne);  
        beneficiaire.recevoir(montantDonne);  
       
        parler("J'ai donné " + montantDonne + " sous à " + beneficiaire.getNom() + " en signe de gratitude.");
    }
}