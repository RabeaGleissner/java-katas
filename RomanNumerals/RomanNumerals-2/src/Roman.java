import java.util.HashMap;

public class Roman {

    public static String convert(int arabic) {
        HashMap<Integer, String> arabicToRoman = new HashMap<Integer, String>();
        arabicToRoman.put(1, "I");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(10, "X");

        String roman = "";
        if (arabic >= 10) {
            roman += arabicToRoman.get(10);
            arabic -= 10;
        }
        if (arabic >= 5) {
            roman += arabicToRoman.get(5);
            arabic -= 5;
        }
        for (int i=0; i < arabic; i++) {
            roman += arabicToRoman.get(1);
        }
        return roman;
    }



}
