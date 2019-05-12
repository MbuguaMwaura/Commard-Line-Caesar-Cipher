
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



        String alphabet = "abcdefghijklmnopqrstuvwxyz";
                    String encrypted = "";

                    for (int i = 0; i < statement.length(); i++){
                        if(alphabet.charAt(i)==statement.charAt(i)){
                            encrypted += alphabet.charAt(i+key);

                        }
                    }







        return encrypted;
    }
}