
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

        for (int i = 0; i < statement.length(); i++) {
            if (alphabet.charAt(i) == statement.charAt(i)) {
                encrypted += alphabet.charAt(i + key);

            }
        }

        return encrypted;
    }

    public  String toDecrypt(String statement, int key) {
        String result = "";
        StringBuffer decrypted = new StringBuffer();


        for (int i = 0; i < statement.length(); i++) {
            int decrypt = statement.charAt(i);



                if(decrypt == 32){

                    decrypted.append(" ");
                }else {
                    char decrypts = (char) (decrypt - (key % 26));
                    decrypted.append(decrypts);

                }



        }
        result += decrypted;
        return result;
    }
}


