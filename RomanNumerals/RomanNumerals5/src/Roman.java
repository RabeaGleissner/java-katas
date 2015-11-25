public class Roman {

    public static String convert(int arabic) {
        String roman = "";
        if (arabic == 10) {
            return "X";
        }
        while (arabic > 0) {
            roman += "I";
            arabic --;
        }
        return roman;
    }
}
