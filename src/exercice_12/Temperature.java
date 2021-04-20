package exercice_12;

import java.util.Arrays;

public class Temperature {

	public static void main(String[] args) {
		/*
		Vous disposez d'une liste de températures (°C).
		Parcourez cette liste et affichez la température la plus proche de 0°C. 
		Si une température négative est aussi proche de 0 qu'une température positive,
		la valeur négative prend le dessus.
		*/
		
		// Liste de température
		int[] temperatures = {5, -5 , 12 , 24, -273, 1200};
		
		//int indexTemperatureProcheZero = 0;
		
		// Parcourrir la liste des températures
		
		//indexTemperatureProcheZero = trouverTemperature(temperatures, indexTemperatureProcheZero);
		// Afficher le résultat
		//afficherTemperature(temperatures, indexTemperatureProcheZero);
		System.out.println(Arrays.toString(temperatures));
		Arrays.sort(temperatures);
		System.out.println(Arrays.toString(temperatures));
	}

	public static int trouverTemperature(int[] temperatures, int indexTemperatureProcheZero) {
		for(int i = 1; i < temperatures.length ; i++) {
			// Trouver la température la plus proche de 0°C
			if( temperaturePlusProcheZero(temperatures, indexTemperatureProcheZero, i)) {
				// Vérifier si la valeur n'a pas un équivalent négatif
				if(aEquivalentNegatif(temperatures, indexTemperatureProcheZero, i)) {
					// si c'est le cas cette valeur est celle qu'on recherche
					// remplacement de l'index
					indexTemperatureProcheZero = i;
				}
			}
		}
		return indexTemperatureProcheZero;
	}

	private static void afficherTemperature(int[] temperatures, int indexTemperatureProcheZero) {
		System.out.println("La température la plus proche de 0°C est "
			+ temperatures[indexTemperatureProcheZero]
			+ " à la position :"
			+indexTemperatureProcheZero);
	}

	private static boolean aEquivalentNegatif(int[] temperatures, int indexTemperatureProcheZero, int i) {
		return (Math.abs(temperatures[i]) == Math.abs(temperatures[indexTemperatureProcheZero]))
			&& (temperatures[i] < temperatures[indexTemperatureProcheZero]);
	}

	private static boolean temperaturePlusProcheZero(int[] temperatures, int indexTemperatureProcheZero, int i) {
		return Math.abs(temperatures[i]) <= Math.abs(temperatures[indexTemperatureProcheZero]);
	}

}
