public class VutureTask2 {
    public static void main(String[] args) {
    	System.out.println(palindromeTest("I have some cheese"));
    	System.out.println(palindromeTest("God saved Eva's dog"));
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