package HelperClass;

import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;

public class Hasher {

    public static String sha256(String input) {
        return hash(input, "sha256");
    }

    private static String hash(String input, String algorithm) {
        String hashCode = "";

        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(input.getBytes());
            byte[] hashBytes = md.digest();
            hashCode = Hex.encodeHexString(hashBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hashCode;
    }  
}
