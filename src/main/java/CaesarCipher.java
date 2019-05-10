public class CaesarCipher {

    private String mStatement;
    private int mKey;

    public CaesarCipher(String statement, int key) {
        mStatement = statement;
        mKey = key;
    }

    public String getStatement() {
        return mStatement;
    }

    public int getKey() {
        return mKey;
    }

    public String isEncrypted() {
        mStatement = "b";
        return mStatement;
    }

    public String isActuallyEncrypted(String statement, int key) {


        char[] array = statement.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = alphabet.toCharArray();

        for (char eachChar : alphabetArray) {
            for (char eachStatementChar : array) {
                if (eachChar == eachStatementChar) {

                    char letter = alphabet.charAt(alphabet.indexOf(eachChar)+key);
                    String stringLetter = String.valueOf(letter);
                    mStatement = stringLetter;

                }
            }
        }

        return mStatement;
    }
}