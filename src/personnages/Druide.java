package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le Druide " + nom + " et ma potion peut "
				+ "aller d'une force " + effetPotionMin + " � " + effetPotionMax +".");
		
	}
	public void preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax);
		
		
		
		System.out.println("Le druide pr�pare une potion de force...");
		if(forcePotion > 7) {
			System.out.println("J'ai pr�par� une super potion de force de "+ forcePotion + " .");
		}else{
			System.out.println("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force "+ forcePotion + "");
		}
		
	}
	
	public String getNom() {
		return nom;
	}
	private void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte +"�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

public static void main (String[] args) {
	Druide Panoramix = new Druide("Panoramix",5,10);
	Panoramix.preparerPotion();
}


}
