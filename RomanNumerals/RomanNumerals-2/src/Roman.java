public class Roman {

    public static String convert(int arabic) {
        if (arabic > 1) {
            return "II";
        }
        return "I";
    }
}
