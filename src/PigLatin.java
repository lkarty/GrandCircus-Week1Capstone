import java.util.Scanner;

public class PigLatin {
	final static String vowels = "aeiouAEIOU";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String usrInput;
		String results;
		System.out.println("Welcome to Pig Latin Translator!");
		System.out.println("Enter a line to be translated: ");
		usrInput = scan.nextLine();
		usrInput = usrInput.toLowerCase();
		String[] usrWords = usrInput.split(" ");


		for (int i = 0; i < usrWords.length; i++) {

			if (isVowel(usrWords[i])) {
				results = convertToPigLatinForVowel(usrWords[i]);
			} else {
				results = convertToPigLatinForConsonant(usrWords[i]);
			}
			System.out.print(results + " ");
		}
		System.out.println();

		scan.close();
	}

	private static String convertToPigLatinForConsonant(String word) {
		int split = firstVowel(word);
		return word.substring(split) + word.substring(0, split) + "ay";
	}

	private static String convertToPigLatinForVowel(String word) {
		word += "way";
		return word;
	}

	private static int firstVowel(String usrWords) {
		usrWords = usrWords.toLowerCase();
		for (int i = 0; i < usrWords.length(); i++)
			if (usrWords.charAt(i) == 'a' || usrWords.charAt(i) == 'e' || usrWords.charAt(i) == 'i'
					|| usrWords.charAt(i) == 'o' || usrWords.charAt(i) == 'u')
				return i;
		return 0;
	}

	private static boolean isVowel(String word) {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
				|| word.charAt(0) == 'u') {
			return true;
		} else {
			return false;
		}
	}

}