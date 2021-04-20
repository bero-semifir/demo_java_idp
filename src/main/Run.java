package main;

import exercice_12.Temperature;

public class Run {

 // visibilité [options...] type de retour, nom de la fonction (arguments..)
	public static void main(String[] args) {
		
		int truc = calculer(5, 2);	
		
		int[] temperatures = {5, -5 , 12 , 24, -273, 1200};
		
		int indexTemperatureProcheZero = 0;
		
		int indexTemp = Temperature.trouverTemperature(temperatures, indexTemperatureProcheZero);
		System.out.println(temperatures[indexTemp]);
	}
	
	// déclaration d'un fonction "calculer" qui retourne un int
	// et prend en paramètre deux entiers (nombre1 et nombre2)
	public static int calculer(int nombre1, int nombre2) {
		return nombre1 + nombre2;
	}
	
	/**
	 * Surcharge de la fonction calculer
	 * @param nb1
	 * @param nb2
	 * @return
	 */
	public static double calculer(double nb1, double nb2) {
		return nb1 + nb2;
	}

}
