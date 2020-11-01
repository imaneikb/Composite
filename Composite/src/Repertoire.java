import java.util.ArrayList;
import java.util.Collection;

public abstract class Repertoire implements Composant {
	private Collection children;
	private int taille;
	private String nom;
	

    public void RepertoireComposite() {
        children = new ArrayList();
    }

  
    public void add(Composant composant){
     
        children.add(composant);
    }

  
    public void remove(Composant composant){
        children.remove(composant);
    }

}
