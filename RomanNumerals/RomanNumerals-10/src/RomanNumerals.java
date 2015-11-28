public class RomanNumerals {
    public static String convert(int arabic) {

        String roman = "";

        while (arabic >= 1) {
            roman += "I";
            arabic -= 1;
        }

        return roman;
    }
}
