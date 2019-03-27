package codewars;

/*This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z.*/

import java.util.ArrayList;
import java.util.List;

public class Mumbling {

    public static String accum(String s) {

        String[] split = s.split("");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            StringBuilder a = new StringBuilder(split[i].toUpperCase());
            for (int j = 0; j < i ; j++) {
                a.append(split[i].toLowerCase());
            }
            list.add(a.toString());
        }
        return String.join("-", list);
    }
}
