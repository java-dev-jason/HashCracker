package Cracker;

import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		AlphabetBruteForce force = new AlphabetBruteForce();
		String hashCode = force.bruteForceNumberLetters(Hash.Hashing("Th3x"));
		System.out.println("The word was: " + hashCode);
	}

}
