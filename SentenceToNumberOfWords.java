package WordsInString;

import javax.swing.JOptionPane;

public class SentenceToNumberOfWords {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog(null, "Enter a sentence with correct grammar: ");
		int words = wordCount(sentence);
		JOptionPane.showInternalMessageDialog(null, "There are " + words + " words in your sentence.");
		System.exit(0);

	}

	public static int wordCount(String str) {
		int count = 1;
		char[] spaces = str.toCharArray();
		for (int i = 0; i < spaces.length; i++) {
			if ((spaces[i] == ' ' && Character.isLetterOrDigit(spaces[i + 1]))){
				count++;
			}
		}
		return count;
	}
}
