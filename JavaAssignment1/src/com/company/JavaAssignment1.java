package com.company;
import java.util.Arrays;
import java.util.regex.*;
import java.io.File;

public class JavaAssignment1
{
    public static void main(String[] args) {
       File home =new File("C:\\Users\\acer\\IdeaProjects");
       String Files[]=home.list();
       File allFiles[]=home.listFiles();
       for(int i=0;i<Files.length;i++)
       {
           if(Pattern.matches("Assignment[1-12]",allFiles[i].getName()));
           System.out.println(allFiles[i].getAbsolutePath());
       }
    }
}