public class Roman {

    public static String convert(int arabic) {
        String roman = "";
        int[] ARABIC = {50, 10, 4, 1};
        String[] ROMAN = {"L", "X", "IV", "I"};

        for (int i = 0; i < ARABIC.length; i++) {
            while (arabic >= ARABIC[i]) {
                roman += ROMAN[i];
                arabic -= ARABIC[i];
            }
        }

        return roman;
    }
}
