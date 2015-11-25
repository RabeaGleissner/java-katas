import java.util.*;

public class Roman {

    public static String convert(int arabic) {
        Map<Integer, String> arabicToRoman = new LinkedHashMap<>();
        arabicToRoman.put(10, "X");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(1, "I");

        String roman = "";
        for (Map.Entry<Integer, String> arabicRomanPair: arabicToRoman.entrySet()) {
            while (arabic >= arabicRomanPair.getKey()){
                roman += arabicRomanPair.getValue();
                arabic -= arabicRomanPair.getKey();
            }
        }
        return roman;
    }



}
