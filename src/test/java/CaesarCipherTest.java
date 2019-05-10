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
}