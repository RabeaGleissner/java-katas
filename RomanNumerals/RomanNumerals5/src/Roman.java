public class Roman {

    public static String convert(int arabic) {
        String roman = "";
        while (arabic >= 50) {
            roman += "L";
            arabic -= 50;
        }
        while (arabic >= 10) {
            roman += "X";
            arabic -= 10;
        }
        while (arabic > 0) {
            roman += "I";
            arabic --;
        }
        return roman;
    }
}
