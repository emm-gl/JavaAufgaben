package assignment_8;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Assignment_8 {

    public static void main(String[] args) {
        
        //Set the parameters here:
        int v1 = 60;
        String s1 = "days";
        int v2 = 25;
        String s2 = "hours";

       timeAdder(v1,s1,v2,s2);
    }

    //Time adder:
    public static Object[] timeAdder(Object val1, Object lab1, Object val2, Object lab2)      
    {
            long m1 = 0;
            long m2 = 0;
            long mt = 0;
            Object[] res = {0, "Invalid"};     //"void result"
            
            //Check Type of the parameter:
             if(checkType(val1, lab1, val2, lab2))
             {
                 //Check Positive Integers
                 if(checkPosIntegers(val1, val2))
                 {
                     //Check coherency
                     if(checkCoeh(val1, lab1, val2, lab2))
                     {
                        //Convert all to seconds:
                        switch(lab1.toString().toLowerCase()) {
                            case "seconds": case "second":
                            m1 =(int) val1;
                            break;
                        case "minutes": case "minute":
                            long minutes = (int) val1;
                             m1 = TimeUnit.SECONDS.convert( minutes, TimeUnit.MINUTES);
                            break;
                        case "hours": case "hour":
                            long hours = (int) val1;
                            m1 = TimeUnit.SECONDS.convert(hours, TimeUnit.HOURS);
                            break;
                        case "days": case "day":
                            long days = (int) val1;
                            m1 = TimeUnit.SECONDS.convert(days, TimeUnit.DAYS);
                            break;
                        default:
                            break;
                        }
                        
                        switch(lab2.toString().toLowerCase()) {
                        case "seconds": case "second":
                            m2 =(int) val2;
                            break;
                        case "minutes": case "minute":
                            long minutes = (int) val2;
                             m2 = TimeUnit.SECONDS.convert( minutes, TimeUnit.MINUTES);
                            break;
                        case "hours": case "hour":
                            long hours = (int) val2;
                            m2 = TimeUnit.SECONDS.convert(hours, TimeUnit.HOURS);
                            break;
                        case "days": case "day":
                            long days = (int) val2;
                            m2 = TimeUnit.SECONDS.convert(days, TimeUnit.DAYS);
                            break;
                        default:
                            break;
                        }
                        
                        //add time, mt in seconds:
                        mt = m1 + m2; 
                        
                        int modd = (int) mt % 86400;
                        int modh = (int) mt % 3600;
                        int modm = (int) mt % 60;

                        if(modd == 0)
                        {
                            res[0] = TimeUnit.DAYS.convert(mt, TimeUnit.SECONDS);
                            res[1] = "Day(s)";
                        }else if(modh == 0)
                        {
                            res[0] = TimeUnit.HOURS.convert(mt, TimeUnit.SECONDS);
                            res[1] = "Hour(s)";
                        }else if(modm == 0)
                        {
                            res[0] = TimeUnit.MINUTES.convert(mt, TimeUnit.SECONDS);
                            res[1] = "Minute(s)";   
                        }else
                        {
                            res[0] = mt;
                            res[1] = "Secoond(s)";
                        }
                            

                        
                     }else
                         return res;
                 }else  
                     return res;  
             }else
                 return res;

             
             System.out.print(res[0] + " ");
             System.out.println(res[1]);
             return res;
             
        }

    //Private function to check type of data:
    private static boolean checkType(Object value1, Object label1, Object value2, Object label2)
    {
        boolean e = false;
        if(!(value1 instanceof Integer)){
            System.out.println("This is invalid because the first argument is wrong type");
            e = true;
        }   
        if(!(label1 instanceof String)) {
            System.out.println("This is invalid because the second argument is wrong type");
            e = true;
        } 
        if(!(value2 instanceof Integer)) {
            System.out.println("This is invalid because the third argument is wrong type");
            e = true;
        }
        if(!(label2 instanceof String)) {
            System.out.println("This is invalid because the fourth argument is wrong type");
            e = true;
        }
        if(e)
            return false;
        else
            return true;
    }
    //Private function to check Positive Integers
    private static boolean checkPosIntegers(Object value1,Object value2)
    {
        boolean e = false;
        if((int) value1 < 0) {
            System.out.println("This is invalid, the first argument only accepts positive integers.");
            e = true;
        }
        if((int) value2 < 0) {
            System.out.println("This is invalid, the third argument only accepts positive integers.");
            e = true;
        }
        if(e)
            return false;
        else
            return true;             
    }
    //Check coeherency
    private static boolean checkCoeh(Object value1, Object label1, Object value2, Object label2)
    {
        boolean e = false;
        int p1 = label1.toString().indexOf('s', 2);
        int p2 = label2.toString().indexOf('s', 2);
        if(((int)value1 > 1) && p1 < 0) {
            System.out.println("This is impossible because " + label1.toString() + " is singular and " + value1.toString() + " is plural");
            e = true;
        }
        if(((int)value2 > 1) && p2 < 0) {
            System.out.println("This is impossible because " + label2.toString() + " is singular and " + value2.toString() + " is plural");
            e = true;
        }
        if(e)
            return false;
        else
            return true;
    }
}
