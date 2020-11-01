

public abstract class Fichier implements Composant {
		private int taille;
		private String nom;
		 public Fichier(String nom) {
				this.nom = nom;
		    }
	    public String getNom() {
	        return this.nom;
	    }
	    public Fichier(int taille) {
			this.taille = taille;
	    }
	    public int getTaille() {
	        return this.taille;
	    }
	    

	}


