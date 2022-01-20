package com.company;

public class Main {

    public static String getDurationString(int minutes,int seconds)
    {
        if(minutes<0 || seconds<0 ||seconds>59)
        {
            return  "Invalid value";
        }
        int hour=minutes/60;
        int m=minutes%60;
        String ans=Integer.toString(hour);
        ans+="hh";
        ans+=Integer.toString(m);
        ans+="mm";
        ans+=Integer.toString(seconds);
        ans+="ss";
        return ans;
    }
    public  static String getDurationString(int seconds)
    {
        if(seconds<0)
        {
            return "Invalid Value";
        }
        int m=seconds/60;
        seconds=seconds%60;
       return(getDurationString(m,seconds));
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(125,30));
        System.out.println(getDurationString(196));
    }
}
