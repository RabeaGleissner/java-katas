public class Roman {
    public static String convert(int arabic) {
        String roman = "";
        while (arabic >= 1) {
            roman += "I";
            arabic--;
        }
        return roman;
    }
}
