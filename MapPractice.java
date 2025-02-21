import java.util.*;

class MapPractice {
    public static void main(String[] args) {
        String sampleWord = "Hello World";
        
        int i = 0;
        Map<Integer, Character> mapChar = new HashMap<Integer, Character>();

        for (Character c : sampleWord.toCharArray()) {
            mapChar.put(i, c);
            i++;
        }

        System.out.println(mapChar.entrySet().toString());

        if(mapChar.containsValue('W')) {
            int index = sampleWord.indexOf('W');
            System.out.println(
                index  + " = " + mapChar.get(index) 
            );
        }
    }
}
