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
    public void newCaesarCipher_replaceLetter_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals("b",testCaesarCipher.isEncrypted());
    }

    @Test
    public void newCaesarCipher_replaceLetterByUsingKey_c(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals("c",testCaesarCipher.isActuallyEncrypted("a",2));
    }

    @Test
    public void newCaesarCipher_replaceMultipleLettersByUsingKey_cde(){
        CaesarCipher testCaesarCipher = new CaesarCipher("abc",2);
        assertEquals("cde",testCaesarCipher.isActuallyEncrypted("abc",2));
    }

    @Test
    public void newCaesarCipher_decryptAStringUsingAKey_abc(){
        CaesarCipher testCaesarCipher = new CaesarCipher("cde",2);
        assertEquals("abc",testCaesarCipher.toDecrypt("cde",2));
    }

    @Test
    public void newCaesarCipher_decryptAStringWithASpaceUsingAKey_a_bc(){
        CaesarCipher testCaesarCipher = new CaesarCipher("c de",2);
        assertEquals("a bc",testCaesarCipher.toDecrypt("c de",2));
    }

    @Test
    public void newCaesarCipher_decryptAStringUsingAKey_ab(){
        CaesarCipher testCaesarCipher = new CaesarCipher("yz",2);
        assertEquals("ab",testCaesarCipher.isActuallyEncrypted("yz",2));
    }

}