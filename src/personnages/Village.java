package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois; // Tableau de villageois
    private int nbVillageois;     // Nombre de villageois dans le village
    

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum]; // Initialisation du tableau avec le nombre maximum de villageois
        this.nbVillageois = 0; // Initialisation du nombre de villageois � 0
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
    
    public String getNom() {
        return nom;
    }

    public int getNbVillageois() {
        return nbVillageois;
    }
    	// M�thode pour ajouter des habitants 
        public void ajouterHabitant(Gaulois gaulois) {
            if (nbVillageois < villageois.length) {
                villageois[nbVillageois] = gaulois;
                nbVillageois++;
            } else {
                System.out.println("Le village est plein. Impossible d'ajouter un nouveau villageois !");
            }
        }

        // M�thode pour trouver un habitant par son num�ro
        public Gaulois trouverHabitant(int numero) {
            if (numero >= 0 && numero < nbVillageois) {
                return villageois[numero];
            } else {
                System.out.println("Num�ro de villageois invalide !");
                return null;
            }
        }
        
        public void afficherVillageois() {
            if (chef != null) {
                System.out.println("Chef: " + chef.getNom());
            } else {
                System.out.println("Pas de chef dans ce village !");
            }
            for (int i = 0; i < nbVillageois; i++) {
                System.out.println("Villageois " + (i+1) + ": " + villageois[i].getNom());
            }
        }
            
            
            public static void main(String[] args) {
                // Cr�ation d'un Village
                Village village = new Village("Village des Irr�ductibles", 30);

                // Trouver un habitant avec un indice invalide
                //Gaulois gaulois = village.trouverHabitant(30);
                // Ce code provoque une exception car l'indice 30 est hors des limites du tableau
                // car les indices valides vont de 0 � 29. De plus, ce gaulois n'a pas encore �t� ajout� au village.
               
                // Cr�ation du chef et ajout au village
                Chef abraracourcix = new Chef("Abraracourcix" ,6 ,village);
                village.setChef(abraracourcix);

                // Cr�ation d'un gaulois et ajout au village
                Gaulois asterix = new Gaulois("Ast�rix",8);
                village.ajouterHabitant(asterix);

                // Trouver un habitant et l'afficher
                // Gaulois gaulois = village.trouverHabitant(1);
                // System.out.println(gaulois);
                // Ce code affiche la r�f�rence m�moire de l'objet Gaulois car la classe Gaulois
                // n'a pas de m�thode toString() d�finie. Pour afficher des informations pertinentes
                // sur le Gaulois, il faudrait ajouter une m�thode toString() � la classe Gaulois.
                System.out.println("Dans le village il y a :");
                
             // Cr�ation d'un autre gaulois et ajout au village
                Gaulois obelix = new Gaulois("Ob�lix",25);
                village.ajouterHabitant(obelix);

                // Affichage des habitants du village
                village.afficherVillageois();
            }
            
            
        
    }
