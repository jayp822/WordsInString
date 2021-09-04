import javax.swing.JOptionPane;

public class SentenceToNumberOfWords {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog(null, "Enter a sentence with correct grammar: ");
		int words = numberOfWords(sentence);
		JOptionPane.showInternalMessageDialog(null, "There are " + words + " words in your sentence.");
		System.exit(0);

	}

	public static int numberOfWords(String str) {

		str = str.trim();
		String[] tokenize = str.split(" ");
		int count = 0;
		for (@SuppressWarnings("unused")
		String words : tokenize) {
			count++;
		}
		return count;
	}

}
