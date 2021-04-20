package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoListes {

	public static void main(String[] args) {
		
		// il faut connaitre la taille du table à l'avance
		double[] nombres = new double[10];
		String str = "Poulet";
		
		List<Float> flotants = new ArrayList<Float>();
		
		flotants.add(2F);
		// insertion de -2.5 à l'indice 0
		flotants.add(0, 1F);
		
		System.out.println(Arrays.toString(nombres));
		
		// erreur à la compilation, on sort de l'espace mémoire reservé
		//double[10] = 0.1;
	
		// autre méthode pour itérer sur un liste
		// ça prend un Consumer en paramètre (ici on met une lambda expression, aussi appelé fonction annonyme)
		// cette fonction est appliqué sur chaques éléments de la liste
		flotants.forEach((Float elem)->{
			System.out.println(elem);
		});
		
//		System.out.println(flotants.get(1));
		
		/////////////////////////////////////////////////////////////
		
		Iterator<Float> iterateur = flotants.listIterator(0);
		
		//"indices"	|0|1|
		// valeurs	|1|2|
		//		   Î
		//hasNext() -> true
		//next()	-> 1
		//"indices"	|0|1|
		// valeurs	|1|2|
		//		     Î
		//hasNext() -> true
		//next()	-> 2
		//"indices"	|0|1|
		// valeurs	|1|2|
		//		       Î
		//hasNext() -> false
		
		// hasNest vérifie qu'un élement suit l'element sur lequel je suis en train d'itérer
		// next() retourne l'élement suivant (au départ le curseur de l'itérateur n'est pas à l'indice 0)
//		while(iterateur.hasNext()) {
//			System.out.println(iterateur.next());
//		}
//		
for (Iterator iterator = flotants.iterator(); iterator.hasNext();) {
	Float float1 = (Float) iterator.next();
	
}
		

	}

}
