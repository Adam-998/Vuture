import java.util.*;
import java.lang.*;

public class VutureTask3 {
	public static void main(String[] args) {
		System.out.println(partA("I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse."));
		System.out.println(partA("The CaT and dog were having a Large fight until the cat decided it was time to go to sleep. The dog was not happy with the ending"));
		System.out.println(partB("I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse."));
		System.out.println(partB("The cat called Meow goes meow while the dog called Woof goes woof."));
		System.out.println(partC("Anna went to vote in the election to fulfil her civic duty"));
		System.out.println(partC("Anna voted in the election for the first time this millenium"));
	}
	
	public static String partA(String sentence) {
		sentence = sentence.toLowerCase();
		String censoredWords[] = {"dog", "cat", "large"};
		String[] words = sentence.split(" ");
		int cat = 0, dog = 0, large = 0;
		for (int i = 0; i < words.length; i++) {
			for (String censored : censoredWords) {
				if (words[i].equals(censored) || words[i].contains(censored)) {
					if (censored == "cat") {
						cat++;
					} else if (censored == "dog") {
						dog++;
					} else {
						large++;
					}
				}
			}
		}
		int total = cat + dog + large;
		return ("cat: " + cat + ", dog: " + dog + ", large: " + large + ", total: " + total);
	}
	
	public static String partB(String sentence) {
		String tempSentence = sentence.toLowerCase();
		String censoredWords[] = {"woof", "meow"};
		String[] words = tempSentence.split(" ");
		String[] realWords = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
		 
			for (String censored : censoredWords) {
				if (words[i].contains(censored)) {
					realWords[i] = realWords[i].replaceAll("\\B\\w\\B", "*");
				}
			}
		}
		return (String.join(" ", realWords));
	}
	
	public static String partC(String sentence) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (palindromeTest(words[i])) {
				words[i] = words[i].replaceAll("\\B\\w\\B", "*");
			}
			
		}
		return (String.join(" ", words));
	}
	
	
	public static boolean palindromeTest(String sentence) {
		sentence = sentence.toLowerCase().replaceAll("\\W", "");
		
		int i = 0;
		int j = sentence.length() - 1;
		while (i < sentence.length() / 2) {
			if (sentence.charAt(i++) != sentence.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}
