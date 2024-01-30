package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class numCoversions {
    public static void main(String[] args) {

        ////////////-NUMBER cast ,casting -----------------
        double numDouble = 3.4465;
        //"Conversion of double to int with data loss of .4465"


        System.out.println((int)numDouble);
         ////////////-NUMBER cast ,casting -----------------

        //--------------------------number to String
        int num43 = 57474;
        String intToString = Integer.toString(num43);
        System.out.println(intToString);//now number int type is String

        //-------------decimalFormat-------- control number formatting-----------------------
        //use this to remove 000 after . and put numbers if there are
        //https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html
        double num4536 = 34525.567777657;
        double num4537 = 34525.00000;
        DecimalFormat df343= new DecimalFormat("0.###");//12.0000 ->12 12.3454 ->12.346
        System.out.println(df343.format(num4536));//34525.568
        System.out.println(df343.format(num4537));//34525
        //-------------decimalFormat-------------------------------

        ////////////////////////////- NUMBER cas double to integer-
        double years = 100;
        int intYears =(int)years;
        System.out.printf("\nDouble : %s " +
                          "\nInt conversion : %d " +
                          "\n",years,intYears);

        ////////////////////////////- NUMBER cas double to integer-

        ////////////////-BigDecimal calculation for finances , high precision , very high numbers ,sum of big numbers-----------
        double bigNumber = 787685.65 * 34325235 *60;
        BigDecimal extremelyBigNumber = new BigDecimal(bigNumber); //normal
        BigDecimal extremelyBigNumberCast = new BigDecimal((int)bigNumber); // cast double to int here
        System.out.printf("\nbigNumber with errors : %s " +
                "\nNormal big number conversion precise : %s " +
                "\nCasted big number conversion to int  : %s",bigNumber,extremelyBigNumber,extremelyBigNumberCast);
        BigInteger firstNum = new BigInteger("4563465476547776575683463452352353643");
        BigInteger secondNum = new BigInteger("675856856756987696745656");
        BigInteger sum34 = firstNum.add(secondNum);
        ////////////////-BigDecimal calculation for finances , high precision , very high numbers-----------

        /////////////// -- Print float or double like a normal number like decimal float ot int print
        double doublebig = 4534656 * 34352;
        float floatbig   = 4534656 * 34352;
        System.out.printf("\ndoublebig : %.0f \nfloatbig : %.0f \n",doublebig,floatbig);
        /////////////// -- Print float or double like a normal number like decimal float ot int print

        /////------take numbers from last position of saved int number --------
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (inputNumber>0){

            int lastDigit = inputNumber % 10;       //how to get the last digit from a number
            int sumAndLastDigit = sum + lastDigit ;
            inputNumber = inputNumber / 10;        //How to remove the last digit from and int number
        }
        /////------take numbers from last position of saved int number --------

        //-----------see or get ASCII code number from table for a Number
        int number = 65;
        System.out.println((char) number); // we get A
        //-----------see or get ASCII code number from table for a Symbol

    }
}
