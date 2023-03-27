package HelperClass;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;

public class Asymmetric {
    private Cipher cipher;
    
    public Asymmetric(String alg) {
        try {
            cipher = Cipher.getInstance(alg);
        } catch (Exception e) {}
    }
    
    public Asymmetric(){
        this("RSA");
    }
    
    public String publicKey(String data, Key key) throws Exception {
        String cipherText = null;
        cipher.init(Cipher.ENCRYPT_MODE, key);
        // encrypt
        byte[] cipherBytes = cipher.doFinal(data.getBytes());
        // convert to string 
        cipherText = Base64.getEncoder().encodeToString(cipherBytes);
        return cipherText;
    }
    
    public String privateKey(String cipherText, Key key) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key);
        // convert to bytes[]
        byte[] cipherBytes = Base64.getDecoder().decode(cipherText);
        // decrypt
        byte[] dataBytes = cipher.doFinal(cipherBytes);
        return new String(dataBytes);
    }
}
