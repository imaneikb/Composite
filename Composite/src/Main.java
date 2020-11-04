import java.util.Scanner; 
import java.util.*;
public class Main {

     public static void main(String[] args)
     {
		
		Fichier child1 = new Fichier(50);
		Fichier child2 = new Fichier(100);

		Repertoire rep= new Repertoire(50);
		rep.add(child1);
		rep.add(child2);

		System.out.println(child1.getTaille());      // output : 50
		System.out.println(root.Calculer());    // output : 150
	}
		
	 }
}


