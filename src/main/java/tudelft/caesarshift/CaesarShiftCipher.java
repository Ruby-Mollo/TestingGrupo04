/*package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
            sb.append(currentChar);
            if (currentChar > 'z' || currentChar < 'a') {
                return "invalid";
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + 26);
            }
            sb.append((char) (currentChar + shift));
        }

        return sb.toString();
    }
}*/
package tudelft.caesarshift;

public class CaesarShiftCipher {
    public String caesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        shift = shift % 26;
        for (char currentChar : message.toCharArray()) {
            if (currentChar == ' ') {
                sb.append(' ');
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                char shiftedChar = (char) (((currentChar - 'a' + shift + 26) % 26) + 'a');
                sb.append(shiftedChar);
            } else {
                return "invalid";
            }
        }
        return sb.toString();
    }
}

