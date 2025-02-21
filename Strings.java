import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Strings {
    public static void main(String[] args) {
        // printDistinctCharsWithCount("abc");
		// printDistinctCharsWithCount("abcab3");
		// printDistinctCharsWithCount("hi there, i am pankaj");

        // reverseInputString("abc");
		// reverseInputString("ç©∆˙¨˚ø"); //special chars

        // checkPalindromeString("abc");
		// checkPalindromeString("abcba");
		// checkPalindromeString("ç∂©∂ç");

        // removeCharFromString("abcbcdjfkd", 'c');
		// removeCharFromString("Pankaj", 'a');
		// removeCharFromString("ç∂©∂ç", '©');

        // countNumberOfWords("My name is Pankaj");
		// countNumberOfWords("I Love Java Programming");
		// countNumberOfWords(" This	is  not   properly formatted		line ");

        // sameCharsStrings("abc", "cba");
		// sameCharsStrings("aabbcc", "abc");

        String s1 = "abc";
        String s2 = "def";

        s1 = s1.concat(s2);
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());


    }

    public static void sameCharsStrings(String input, String ref) {
        Set<Character> set1 = input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        Set<Character> set2 = ref.chars().mapToObj(c-> (char) c).collect(Collectors.toSet());

        System.out.println(set1.equals(set2));
    }

    public static void countNumberOfWords(String inpuString) {
        inpuString = inpuString.trim();
        String[] list = inpuString.split(" ");

        System.out.println(list.length);
    }

    public static void removeCharFromString(String input, char ch) {
        System.out.println(input.replaceAll(String.valueOf(ch), ""));
    }


    public static void checkPalindromeString(String input) {
        //reverse the string

        String s = "";
        char ch;
        for(int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            s = ch + s;
        }

        System.out.println(s.equals(input));


        char[] charArr = input.toCharArray();

        for(int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }

    }

    public static void reverseInputString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);

        System.out.println(stringBuilder.reverse().toString());
    }

    public static void printDistinctCharsWithCount(String input) {
        Map<Character, Integer> mapChar = new LinkedHashMap<>();

        input = input.replaceAll("[^A-Za-z]", "");

        for(Character c : input.toCharArray()) {
            mapChar.put(c, mapChar.getOrDefault(c, 0) + 1);
        }

        System.out.println(mapChar);
    }
}
