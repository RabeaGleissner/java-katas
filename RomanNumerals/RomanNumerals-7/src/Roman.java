public class Roman {
    public static String convert(int arabic) {
        String roman = "";

       while (arabic >= 10) {
            roman += "X";
            arabic -= 10;
        }

        while (arabic >= 1) {
            roman += "I";
            arabic -= 1;
        }
        return roman;
    }
}
