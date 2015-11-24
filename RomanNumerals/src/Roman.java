public class Roman {
    public static String convert(int arabic) {
        String roman = "";
        while (arabic >= 10) {
            roman += "X";
            arabic -= 10;
        }
        if (arabic == 5) {
             return "V";
        }
        while (arabic > 0) {
            roman += "I";
            arabic --;
        }
        return roman;
    }
}
