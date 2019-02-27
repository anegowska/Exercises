package edabit;

public class ReverseString {

    public static String reverse(String s) {
        String[] array = s.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= 5) {
                StringBuilder input = new StringBuilder();
                input.append(array[i]);
                array[i] = input.reverse().toString();
            }
        }
        return String.join(" ", array);
    }
}
