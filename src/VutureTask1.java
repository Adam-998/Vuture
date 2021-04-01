public class VutureTask1 {
	
	public static void main(String[] args) {
		System.out.println(countLetter('e', "I have some cheese"));
		System.err.println(countLetter('a', "How many of the letter a are in this sentence?"));
	}
	
	public static int countLetter(char letter, String sentence) {
		int count = 0;
		
		for (int i = 0; i < sentence.length(); i++) {
			char a = sentence.charAt(i);
			if (a == letter) {
				count++;
			}
		}
		return count;
	}
}



