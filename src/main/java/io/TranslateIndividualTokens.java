import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class TranslateIndividualTokens{
    public static void main(String[] args){
        Scanner scanner = null;
        double sum = 0;

        try{
            scanner = new Scanner(new BufferedReader(new FileReader("usnumbers.txt")));
            scanner.useLocale(Locale.US);

            while(scanner.hasNext()){
                if (scanner.hasNextDouble()){
                    sum += scanner.nextDouble();

                }else{
                    s.next();
                }
            }
        }finally{
            s.close();
        }
        System.out.println(sum);
    }
    
}