public class Roman {
    public static String convert(int arabic) {
        String roman = "";

        int[] ARABIC = {10, 5, 1};
        String[] ROMAN = {"X", "V", "I"};

        for (int i = 0; i < ARABIC.length; i++) {
            while (arabic >= ARABIC[i]) {
                roman += ROMAN[i];
                arabic -= ARABIC[i];
            }
        }

        return roman;
    }
}
