package io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream{
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("src/main/java/io/xanadu.txt");
            out = new FileOutputStream("src/main/java/io/outagain.txt");
            int c; 
            System.out.println("about to read from one file and write to another!");
            while((c = in.read()) != -1 ){
                out.write(c);

            }
            System.out.println("outagain.txt now has same information from xanadu");
            

        } catch  (IOException e) {
            throw new RuntimeException(e);

        }
        finally{

            if (in !=null){
                try{
                in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out!= null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }
        }

    }

}