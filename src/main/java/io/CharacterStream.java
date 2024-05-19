package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterStream {
    public static void main(String[] args){
        FileReader inputStream = null;
        FileWriter outputStream = null;

        System.out.println("files abput to be placed as input/output");
        try{
            inputStream = new FileReader("src/main/java/io/xanadu.txt");
            outputStream = new FileWriter("src/main/java/io/readagain.txt");

            int c;
            while((c = inputStream.read()) != -1){
                outputStream.write(c);

            }
            System.out.println("input sent to output");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (inputStream != null) {
                try{
                inputStream.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }


            }
            if (outputStream != null){
                try{
                outputStream.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
