package personnages;

public class Yakuza extends Humain {

    private String clan;
    private int reputation;

    public Yakuza(String nom, int argent, String clan) {
        super(nom, "whisky", argent);  
        this.clan = clan;
        this.reputation = 0;  
    }
    public int getReputation() {
        return reputation;
    }

    public int perdre() {
        int perte = this.getArgent();
        perdreArgent(perte);
        reputation--;
        parler("J�ai perdu mon duel et mes " + perte + " sous, snif... J'ai d�shonor� le clan de " + clan + ".");
        return perte;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai d�pouill� de ses " + gain + " sous.");
    }



  
    public void extorquer(Commercant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
        parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
       
        int montantExtorque = victime.seFaireExtorquer();
        gagnerArgent(montantExtorque);
       
        reputation++;
       
        parler("J�ai piqu� les " + montantExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }
}
