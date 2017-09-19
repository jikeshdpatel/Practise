package net.array;

//import org.junit.Assert;
//import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumberToWords {
    private static Map<Long, String> lookup = new HashMap<>();
    static{
        lookup.put((long)0,"Zero");
        lookup.put((long)1,"One");
        lookup.put((long)2,"Two");
        lookup.put((long)3,"Three");
        lookup.put((long)4,"Four");
        lookup.put((long)5,"Five");
        lookup.put((long)6,"Six");
        lookup.put((long)7,"Seven");
        lookup.put((long)8,"Eight");
        lookup.put((long)9,"Nine");
        lookup.put((long)10,"Ten");
        lookup.put((long)11,"Eleven");
        lookup.put((long)12,"Twelve");
        lookup.put((long)13,"Thirteen");
        lookup.put((long)14,"Fourteen");
        lookup.put((long)15,"Fifteen");
        lookup.put((long)16,"Sixteen");
        lookup.put((long)17,"Seventeen");
        lookup.put((long)18,"Eighteen");
        lookup.put((long)19,"Nineteen");
        lookup.put((long)20,"Twenty");
        lookup.put((long)30,"Thirty");
        lookup.put((long)40,"Fourty");
        lookup.put((long)50,"Fifty");
        lookup.put((long)60,"Sixty");
        lookup.put((long)70,"Seventy");
        lookup.put((long)80,"Eighty");
        lookup.put((long)90,"Ninty");
        lookup.put((long)100,"Hundred");
        lookup.put((long)1000,"Thousand");
        lookup.put((long)1000000,"Million");
        lookup.put((long)1000000000,"Billion");
    }

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            while(!(s=in.readLine()).equals("q")){
                long l = Long.valueOf(s);
                System.out.println(convertNumberToWords(l));
            }
        } catch (IOException e) {
            System.out.println("Invalid input!!!");
            e.printStackTrace();
        }
    }

    private static String convertNumberToWords(long l){
        //System.out.print(l + " - "); //uncomment for debug
        String text = "";
        int factor = 1; //Factor identifies whether it's thousand, million or billion
        if(l < 20){
            if(l == 1 || l == 0){
                //If it's 0 or 1 no need to convert and it's not plural
                text += lookup.get((long)l);
                text += "Dollar";
            }else{
                //If it's 0 or 1 no need to convert and it's plural
                text += lookup.get((long)l);
                text += "Dollars";
            }
        }else{
            //For any amount > 20 convert it.
            while(l > 0){
                int i = (int) (l%1000);
                String curText = "";
                if(i > 0)
                    curText = gt100le1000(i);

                l = l/1000;

                if(factor > 1 && i > 0){
                    curText += lookup.get((long) factor);
                }
                factor *= 1000;

                text = curText + text;
            }
            text += "Dollars";
        }
        return text;
    }
    //Simply lookup no need to convert as amount is less than 20
    private static String le20(int i){
        return lookup.get((long)i);
    }

    //Divide the two digits to hundred factor
    private static String le100(int i){
        if(i <= 20)
            return le20(i);

        if(i == 100)
            return lookup.get((long)i);

        int a0 = i % 10;
        int a1 = (i / 10)*10;

        StringBuilder strb = new StringBuilder();
        strb.append(lookup.get((long)a1)).append(a0 > 0 ? lookup.get((long)a0) : "");
        return strb.toString();
    }

    //Divide the three digits to thousadn factor which utlimately uses le100(int) to further divide and convert to hundred factor
    private static String gt100le1000(int i){
        if(i <= 100)
            return le100(i);

        if(i == 1000)
            return lookup.get((long)1) + lookup.get((long)i);

        int a0 = i % 100;
        int a1 = (i/100);

        StringBuilder strb = new StringBuilder();
        strb.append(lookup.get((long)a1)).append(lookup.get((long)100)).append(le100(a0));

        return strb.toString();
    }

    //@Test
    public void test() {
        long[] inputs = new long[]{0, 1, 19, 21, 99, 100, 101, 899, 999, 1000, 1123, 9999, 10000, 97000, 999000, 1000000, 1123045, 9998887, 99988870, 1000000000, 2123456789};
        String[] expectedOutput = new String[]{"ZeroDollar","OneDollar","NineteenDollars","TwentyOneDollars","NintyNineDollars","HundredDollars","OneHundredOneDollars","EightHundredNintyNineDollars","NineHundredNintyNineDollars","OneThousandDollars",
                "OneThousandOneHundredTwentyThreeDollars","NineThousandNineHundredNintyNineDollars","TenThousandDollars",
                "NintySevenThousandDollars","NineHundredNintyNineThousandDollars","OneMillionDollars","OneMillionOneHundredTwentyThreeThousandFourtyFiveDollars",
                "NineMillionNineHundredNintyEightThousandEightHundredEightySevenDollars","NintyNineMillionNineHundredEightyEightThousandEightHundredSeventyDollars",
                "OneBillionDollars","TwoBillionOneHundredTwentyThreeMillionFourHundredFiftySixThousandSevenHundredEightyNineDollars"};
        for (int i=0; i< inputs.length; i++) {
            String actualOutput = convertNumberToWords(inputs[i]);
            //Assert.assertEquals("Invalid conversion!!!", expectedOutput[i], actualOutput);
        }
    }

}
