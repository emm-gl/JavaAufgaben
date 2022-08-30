/*
HW Assignment #4 Java Fundamentals by Pirple
Autor: Emmanuel González

//Instructions
1. Return to your 2nd homework assignments, when you described your favorite song.
2. Refactor that code so all the variables are held as in a single data structure as keys and values.
3. Refactor your print statements so that you have a single loop that passes through each item in the data structure and prints out it's key and then it's value.
*/

package assignment_4;

import java.util.*;

public class Assignment_4 {

    public static void main(String[] args) {
        
        String[] allInfo = 
                //<editor-fold desc="Raw data">
                {
                    "Song", "Take Five",
                    "Artist", "The Dave Brubeck Quartet",
                    "Composer", "Paul Desmond",
                    "Album", "Time Out",
                    "Year_release", "1959",
                    "Genre", "Jazz",
                    "Key", "Eb minor",
                    "Tempo", "174 bpm",              
                    "Bar", "5/4",
                    "Duration", "2.55"       
                };
                //</editor-fold>
        
        String[] Keys = new String[allInfo.length/2];
        String[] Values = new String[allInfo.length/2];
        
        //Adjust all the keys and values in differents Arrays
        for(int i = 0; i < allInfo.length; i++)
        {
            //Key in even positions
            if(i % 2 == 0)
            {
                Keys[i/2] = allInfo[i]; 
            }
            else
                
            //Associated values in odd positions
            {
                Values[i/2] = allInfo[i];
            }
        }
        
        //Map all the info
        Map<String, String> SongData = new HashMap<>();
        for(int i = 0; i < Keys.length; i++)
        {
            SongData.put(Keys[i],Values[i]);
        }
        
        //Print the values, the key to solve this was the foreach!!! and the method keyset()
        for(String mkeys: SongData.keySet())
        {
            System.out.println(mkeys + " => " + SongData.get(mkeys));
        }

    }
    
}
