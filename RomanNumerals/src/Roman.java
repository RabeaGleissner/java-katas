public class Roman {
    public static String convert(int arabic) {
        int[] ARABIC = {10, 1};
        String[] ROMAN = {"X", "I"};

        String roman = "";
        for (int i = 0; i < ARABIC.length; i++) {
            while (arabic >= ARABIC[i]) {
                roman += ROMAN[i];
                arabic -= ARABIC[i];
            }
            if (arabic == 5) {
                return "V";
            }
        }
        return roman;
    }
}
