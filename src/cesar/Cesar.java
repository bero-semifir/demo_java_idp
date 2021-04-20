package cesar;

public class Cesar {

	public static void main(String[] args) {

		// code de césar
		
		// encoder une phrase en décalant l'ordre des lettres dans l'alphabet
		// avec une clé d'encodage
		
		char[] alphabet = initAlphabet();
		String phrase = "Bonjour Poulet";

		// encoder la phrase
		
		
		// décoder la phrase
		
		phrase = encoder(5, phrase);
		System.out.println(phrase);
		
	}
	
	/**
	 * Génere l'alphabet en minuscule
	 * @return alphabet généré
	 */
	private static char[] initAlphabet() {
		// initilisation de l'alphabet
		
		char[] alphabet = new char[26];
		
		for(int i = 0; i< 26 ; i++) {
			alphabet[i] = (char)(97+i);
		}
		
		return alphabet;
	}


	
	private static String encoder(int cle,String phrase) {
		String phraseEncodee = "";
		
		for(char carac: phrase.toCharArray()) {
			phraseEncodee += decaler(carac, cle);
		}
		
		return phraseEncodee;
	}
	
	/**
	 * Décalage de caractère en se basant sur la table ASCII
	 * @param caractere
	 * @param offset
	 * @return caractère encodé
	 */
	private static char decaler(char caractere, int offset) {
		// convertit mon caractère en ascii
		int charAscii = (int)caractere;
		if(charAscii != 32) {
			// décaler mon caractére dans la table ascii
			// si on sort de l'aphabet de la table Ascii retour au début
			if(estMinuscule(charAscii + offset) || estMajuscule(charAscii + offset)) {
				charAscii = charAscii + offset;			
			}else {
				offset -= 26;	
				charAscii = charAscii + offset;
			}	
		}
		// reconvertion en char et retour de la valeur
		return (char) charAscii;
	}
	
	private static boolean estMinuscule(int ascii) {
		return ascii >= 97 && ascii <= 122;
	}
	
	private static boolean estMajuscule(int ascii) {
		return ascii >= 65 && ascii <= 90;
	}
}
