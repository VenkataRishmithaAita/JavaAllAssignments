package com.company;
import java.io.*;
import java.util.*;
public class Main
{

    public static void getFrequencyCharacter(String filepath,HashMap<Character,Integer> charFreq) {
        File file = new File(filepath);
        try {
            FileReader fr = new FileReader(file);
            int temp;
            while ((temp = fr.read()) != -1) {
                char ch = (char) temp;
                if (charFreq.containsKey(ch)) {
                    charFreq.put(ch, charFreq.get(ch) + 1);
                } else {
                    charFreq.put(ch, 1);
                }

            }

        }
        catch(IOException msg)
        {
            msg.printStackTrace();
        }
        /*for(char ch:charFreq.keySet())
        {
            System.out.println(ch+" "+charFreq.get(ch));
        }*/

    }
    public static void writingToFile(String filename,HashMap<Character,Integer>charFreq)
    {
        try
        {
            FileWriter fw=new FileWriter(filename);
            for(char ch:charFreq.keySet())
            {
                fw.write(ch+"\t"+charFreq.get(ch)+"\n");
            }
            fw.close();
        }
        catch(IOException msg)
        {
            msg.printStackTrace();
        }
    }
    public static void readingFromFile(String filename,HashMap<Character,Integer> charFreq)
    {
        try {
            FileReader fr= new FileReader(filename);
            int temp;
            while ((temp = fr.read()) != -1) {
                System.out.print((char) temp);
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }    }
    public static void main(String[] args) {
        HashMap<Character, Integer> charFreq =new HashMap<Character,Integer>();

        Main m1=new Main();
        getFrequencyCharacter(args[0],charFreq);
        //System.out.println(args[0]);
        writingToFile(args[1],charFreq);
        readingFromFile(args[1],charFreq);

    }
}
