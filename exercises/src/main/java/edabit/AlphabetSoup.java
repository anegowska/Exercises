package edabit;

//Create a method that takes a string and returns a string with its letters in alphabetical order (for example: "JavaScript" ➞ "aacijprstv", "bread" ➞ "abder")

public class AlphabetSoup {

    public static String alphabetSoup(String s) {
        char[] charArray = s.toCharArray();

        int largestChar;
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (charArray[j] < 97) {
                    charArray[j] = (char) (charArray[j] + 32);
                }
                if (charArray[j] > charArray[j + 1]) {
                    largestChar = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = (char) largestChar;
                }
            }
        }
        return new String(charArray);
    }
}
