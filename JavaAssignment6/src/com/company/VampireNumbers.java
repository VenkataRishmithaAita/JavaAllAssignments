package com.company;
import java.util.ArrayList;

public class VampireNumbers {
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void allPermutations(String str,int low,int high,ArrayList<String> res)
    {
        if(low==high)
         res.add(str);
        else
        {
            for(int i=0;i<=high;i++)
            {
                str = swap(str,low,i);
                allPermutations(str, low+1, high,res);
                str = swap(str,low,i);

            }
        }


    }
    public static boolean checkAllPermutations(String str,int len)
    {

        ArrayList<String> res= new ArrayList<>();
        String first_half,second_half;
        int half=len/2;
        allPermutations(str,0,len-1,res);
        for(String s:res)
        {
            first_half=s.substring(0,half);
            second_half=s.substring(half);
            if(first_half.charAt(half-1)=='0' && second_half.charAt(half-1)=='0')
                continue;
            if(Integer.parseInt(first_half)*Integer.parseInt(second_half)==Integer.parseInt(str))
                return true;
        }
        return false;

    }
public boolean checkIfVampire(long num)
{
String num_str=Long.toString(num);
int len=num_str.length();
if((len&1)==1)
{
    return false;
}
if(!checkAllPermutations(num_str,len))
{
    return false;
}
return true;

}
}
