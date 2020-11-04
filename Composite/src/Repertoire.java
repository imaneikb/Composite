import java.util.ArrayList;
import java.util.Collection;

public abstract class Repertoire implements Composant {
	private Collection children;
	private List <Composant> listElement = new ArrayList<>();
	private String nom;
	private int taille;
	

    public void RepertoireComposite() {
        children = new ArrayList();
    }

  
    public void add(Composant composant){
     
        children.add(composant);
    }

  
    public void remove(Composant composant){
        children.remove(composant);
    }
    
    public int calculer(){
	    int taille=0;
	    for(Composant composant:listElement){
		    taille=taille+composent.getTaille();
	    }
	    return taille;
    }
		    

}
