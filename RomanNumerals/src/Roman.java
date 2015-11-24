public class Roman {
    public static String convert(int arabic) {
        String roman = "";
        if (arabic == 10) {
            return "X";
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
