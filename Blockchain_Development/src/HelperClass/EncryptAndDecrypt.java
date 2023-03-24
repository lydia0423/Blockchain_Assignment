package HelperClass;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncryptAndDecrypt {
    public static String encryptPassword(String password){
        Encoder encoder = Base64.getEncoder();
        String encryptedPassword = encoder.encodeToString(password.getBytes());
        
        return encryptedPassword;    
    }
    
    public static String decryptPassword(String password){
        Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(password);
        
        return new String(bytes);
    }
}
