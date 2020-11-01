import java.util.Scanner; 
import java.util.*;
public class Main {

     public static void main(String[] args)
     {
		
		Fichier monfichier = new Fichier() ;
		System.out.println("Le nom de mon fichier est:");
		System.out.println(monfichier.getNom());
		System.out.println("size");


		Repertoire repertoire = new Repertoire() ;
		repertoire.add(monfichier);
		repertoire.remove(monfichier);
		
	 }
}


