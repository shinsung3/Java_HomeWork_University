import java.io.*;
import java.security.*;
import java.util.*;
import java.nio.file.*;

public class UnHash {
    public static int unhash(String to_unhash) throws NoSuchAlgorithmException {

        boolean exists = false;
        int numb = 0;
        while(!exists){
            if (to_unhash.equals(Hash.hash(numb))){
                exists = true;
                break;
            }

            numb ++;

            }
            return numb;

    }

    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        String unhashing = args[0];

        UnHash dehasher = new UnHash();

        System.out.println(dehasher.unhash(unhashing));
    }
}
