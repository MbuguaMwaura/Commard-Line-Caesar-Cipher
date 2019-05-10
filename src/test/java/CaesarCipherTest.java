import org.junit.*;
import static org.junit.Assert.*;

public class CaesarCipherTest{

    @Test
    public void newCaesarCipher_instantiateCorrectly(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void newCaesarCipher_readsAString_a(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals("a",testCaesarCipher.getStatement());
    }

    @Test
    public void newCaesarCipher_readKey_2(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals(2,testCaesarCipher.getKey());
    }

    @Test
    public void newCaesarCipher_replaceLetterUsingKey_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals("b",testCaesarCipher.isEncrypted());
    }
}