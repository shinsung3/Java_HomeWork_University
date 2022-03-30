import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.*;
import java.security.*;
import java.util.*;
import java.nio.file.*;

class Hash{
    public static String hash(int to_hash) throws NoSuchAlgorithmException {

        String temp = String.valueOf(to_hash);

        MessageDigest md5 = MessageDigest.getInstance("MD5");

        byte[] hash_bin = md5.digest(temp.getBytes());

        BigInteger hash_int = new BigInteger(1, hash_bin);


        String hash_txt = hash_int.toString(16);
        while (hash_txt.length() < 32) {
            hash_txt = "0" + hash_txt;
        }
        return hash_txt;

    }

}


