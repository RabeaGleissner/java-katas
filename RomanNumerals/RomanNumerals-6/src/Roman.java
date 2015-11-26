public class Roman {
    public static String convert(int arabic) {

        String roman = "";
        int[] ARABIC = {100, 10, 1};
        String[] ROMAN = {"C", "X", "I"};

        for (int i = 0; i < ARABIC.length; i ++) {
            while (arabic >= ARABIC[i]) {
                roman += ROMAN[i];
                arabic -= ARABIC[i];
            }
        }

        return roman;
    }
}
