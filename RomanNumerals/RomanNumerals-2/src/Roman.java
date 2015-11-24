public class Roman {

    public static String convert(int arabic) {
        String roman = "";
        if (arabic >= 5) {
            roman += "V";
            arabic -= 5;
        }
        for (int i=0; i < arabic; i++) {
            roman += "I";
        }
        return roman;
    }
}
