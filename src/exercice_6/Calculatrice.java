package exercice_6;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		
		/*
		 * Écrivez un programme qui simulera une calculatrice
		 * et demande à l'utilisateur de saisir un premier opérande,
		 * un opérateur et un second opérande.
		 * 
		 * Ce programme exécutera des opérations arithmétiques de base
		 * (addition, soustraction, multiplication et division)
		 * selon l'opérateur saisi.
		 */

		double nombre1;
		double nombre2;
		char operateur;

		nombre1 = demanderOperande();

		operateur = demanderOperateur();

		nombre2 = demanderOperande();

		System.out.println(calculer(nombre1, operateur, nombre2));

	}
	
	private static char demanderOperateur() {

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un operateur");
		// Lis ce que l'utilisateur a écrit
		char operateur = scanner.nextLine().charAt(0);

		// Fermeture du scanner pour libérer les ressources
		//scanner.close();

		return operateur;
	}

	private static double demanderOperande() {
		// initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez un nombre");
		// Lis ce que l'utilisateur a écrit
		double nombre = scanner.nextDouble();

		// Fermeture du scanner pour libérer les ressources
		//scanner.close();
		
		return nombre;
	}

	private static double calculer(double nombre1, char operateur, double nombre2) {
		
		// effectuer le calcul

		if(operateur == '+') {
			return nombre1 + nombre2;
		}else if (operateur == '-') {
			return nombre1 - nombre2;
		}else if (operateur == '*') {
			return nombre1 * nombre2;
		}else if (operateur == '/') {
			return nombre1 / nombre2;
		}else {
			System.out.println("Je ne connais pas cet operateur, je retourne donc 0");
			return 0;
		}
		
	}
}
