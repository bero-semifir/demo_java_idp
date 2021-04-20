package exercice_12;

public class TemperatureSansIndex {

	public static void main(String[] args) {
		/*
		Vous disposez d'une liste de températures (°C).
		Parcourez cette liste et affichez la température la plus proche de 0°C. 
		Si une température négative est aussi proche de 0 qu'une température positive,
		la valeur négative prend le dessus.
		*/
		
		// Liste de température
		int[] temperatures = {5, -5 , 12 , 24, -273, 1200};
		
		int temperatureProcheZero = temperatures[0];
		
		// Parcourrir la liste des températures
		
		for(int i = 1; i < temperatures.length ; i++) {
			// Trouver la température la plus proche de 0°C
			if( Math.abs(temperatures[i]) <= Math.abs(temperatureProcheZero)) {
				// Vérifier si la valeur n'a pas un équivalent négatif
				if((Math.abs(temperatures[i]) == Math.abs(temperatureProcheZero))
					&& (temperatures[i] < temperatureProcheZero)) {
					// si c'est le cas cette valeur est celle qu'on recherche
					// remplacement de l'index
					temperatureProcheZero = temperatures[i];
				}
			}
		}
		// Afficher le résultat
		System.out.println("La température la plus proche de 0°C est "+ temperatureProcheZero);
	}

}
