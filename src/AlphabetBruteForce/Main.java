package AlphabetBruteForce;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Hash hash = new Hash();
		AlphabetBruteForce force = new AlphabetBruteForce();
		WordsBruteForce wordsForce = new WordsBruteForce();
		
		System.out.print("Word: ");
		String input = scan.next();
		String inputHashed = hash.Hashing(input);
		
		force.setHashCode(inputHashed);
		force.start();
		
		String word = wordsForce.brute(inputHashed);
		if(word != "NotFound") {
			if(force.isAlive()) {
				force.StopThread();
			}
			System.out.println("The word is: " + word);
			System.out.println("Your word was: " + input);
			System.out.println("Your word Hashed: " + inputHashed);
		}
		
		while(force.getWord() == "") {
			Thread.sleep(100);
		}
		System.out.println("The word is: " + force.getWord());
		System.out.println("Your word was: " + input);
		System.out.println("Your word Hashed: " + inputHashed);
	}

}