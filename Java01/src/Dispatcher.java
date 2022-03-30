import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.security.*;
import java.util.*;
import java.nio.file.*;

public class Dispatcher {
    public static void main (String[] args) throws NoSuchAlgorithmException{
      try{

        BufferedReader input = new BufferedReader(new FileReader(args[0]));
        String str;

        while ((str = input.readLine()) != null) {
            System.out.println( UnHash.unhash(str));
          }
          input.close();
        
    } catch (IOException e) {

    }
}
}
