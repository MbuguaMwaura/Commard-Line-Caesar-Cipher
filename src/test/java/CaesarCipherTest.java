import org.junit.*;
import static org.junit.Assert.*;

public class CaesarCipherTest{

    @Test
    public void newCaesarCipher_instantiateCorrectly(){
        CaesarCipher testCaesarCipher = new CaesarCipher();
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }

}