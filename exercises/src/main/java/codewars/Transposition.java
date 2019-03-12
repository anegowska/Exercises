package codewars;

/*Simple transposition is a basic and simple cryptography technique. We make 2 rows and put first a letter in the Row 1,
 the second in the Row 2, third in Row 1 and so on until the end. Then we put the text from Row 2 next to the Row 1 text
 and thats it.
Complete the function that recieves a string and encrypt it with this simple transposition.
For example if the text to encrypt is: "Simple text", the 2 rows will be:

Row 1	S	m	l		e	t
Row 2	i	p	e	t	x

So the result string will be: `"Sml etipetx"`*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Transposition {

    public static String simpleTransposition(String text) {
        List<Character> charList = new ArrayList<>();
        char[] charArray = text.toCharArray();

        charList.add(charArray[0]);
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < charArray.length; j++) {
                if (i == 1) {
                    if (j % 2 == 0) {
                        charList.add(charArray[j]);
                    }
                }else if (j % 2 != 0) {
                    charList.add(charArray[j]);
                }
            }
        }
        return charList.stream()
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining(""));
    }
}
