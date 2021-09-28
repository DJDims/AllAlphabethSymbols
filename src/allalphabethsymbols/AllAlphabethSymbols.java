
package allalphabethsymbols;

public class AllAlphabethSymbols {

    public static void main(String[] args) {
        String phrase = "the quick brown fox jumps over the lazy dog";

        phrase = phrase.toLowerCase();
        
        int symbolcounter = 0;
        
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < phrase.length(); j++) {
                if (alphabet[i] == phrase.charAt(j)) {
                    symbolcounter++;
                    break;
                }
            }
        }

        if (symbolcounter == 26) {
            System.out.println("Строка является панграммой");
        }else{
            System.out.println("Строка не является панграммой");
        }
    }
}

