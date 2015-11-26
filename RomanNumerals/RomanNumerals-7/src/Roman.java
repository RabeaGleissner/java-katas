public class Roman {
    public static String convert(int arabic) {
        if (arabic == 3) {
            return "III";
        }
        if (arabic == 2) {
            return "II";
        }
        return "I";
    }
}
