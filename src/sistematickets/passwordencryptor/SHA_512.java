package passwordencryptor;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SHA_512 {
    public String getSHA512(String textoPlanoContrasenia){
        String hexadecimalContrasenia= null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(textoPlanoContrasenia.getBytes("utf8"));
            hexadecimalContrasenia = String.format("%0128x", new BigInteger(1, digest.digest())); 
        } catch (NoSuchAlgorithmException nsaException) {
            Logger.getLogger(SHA_512.class.getName()).log(Level.SEVERE, null, nsaException);
        } catch (UnsupportedEncodingException ueException) {
            Logger.getLogger(SHA_512.class.getName()).log(Level.SEVERE, null, ueException);
        }
        return hexadecimalContrasenia;
    } 
}
