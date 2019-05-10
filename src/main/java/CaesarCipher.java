public class CaesarCipher{

    private String mStatement;


    public CaesarCipher(String statement, int key){
        mStatement = statement;
    }
    public String getStatement(){
        return mStatement ;
    }
}