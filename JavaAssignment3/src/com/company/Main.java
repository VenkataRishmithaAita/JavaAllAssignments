package com.company;
import java.util.Scanner;
public class Main {

    public static void runSystemCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            Scanner sc=new Scanner(p.getInputStream());

            String s = "";
            int median_time=0;
            int x,y,count=0;
            // reading output stream of the command
            while (( sc.hasNext()) ) {
                s=sc.nextLine();
                x=s.indexOf("time=");
                System.out.println(s);

                if(x>0){
                    count+=1;
                    y=s.indexOf("ms");
                    x=x+5;
                    //System.out.println(s);
                    //System.out.printf("%d %d\n",x,y);
                    //System.out.println(Integer.parseInt(s.substring(x, y )));
                    median_time+=Integer.parseInt(s.substring(x,y));
                    x=0;
                    y=0;
                }
            }
            System.out.println("Average time of all pings is "+median_time/count+"ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String ip = "google.com";
        runSystemCommand("ping " + ip);


    }
}
