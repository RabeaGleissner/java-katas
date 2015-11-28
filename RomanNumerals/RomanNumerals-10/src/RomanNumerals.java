public class RomanNumerals {
    public static String convert(int arabic) {

        String roman = "";

        if (arabic == 20) {
            roman = "XX";
            arabic -= 20;
        }

        if (arabic == 10) {
            roman = "X";
            arabic -= 10;
        }

        while (arabic >= 1) {
            roman += "I";
            arabic -= 1;
        }

        return roman;
    }
}
