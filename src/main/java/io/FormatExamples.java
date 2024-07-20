package main.java.io;

public class FormatExamples{
    public static void main(String[] args){
        //print and println
        int i = 2; 
        double r = Math.sqrt(i);

        System.out.print("The sqaure root of  " );
        System.out.print(i);
        System.out.print(" is : ");
        System.out.print(r);
        System.out.println(".");

        i = 5; 
        r = Math.sqrt(i);

        System.out.println("The square root of " + i + " is: " + r + ".");

        //format method
        i = 93;
        r = Math.sqrt(i);
        /* %d -> formats integer value as a decimal value
         * %f -> formats floating point value as a decimal value
         * %n -> outputs a platform-specific line terminator.
         */
        System.out.format("The square root of %d is %f.%n", i, r);

        //another format example:
        /* % -> format specifier
           1$ -> argument index
           +0 -> flags : additional formatting options, the + specfies that the number
           should always be formatted with a sign, the 0 specifies 0 is the
           padding character
           2 0 -> width: minium width of the formatted value (padded if necessary)
           .10 -> precision: mathematical precision of the formatted value
           f -> conversion
         * 
         */
        System.out.format("%f, %1$+020.10f %n", Math.PI);


    }
  


}