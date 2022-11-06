
/**
 * CSCI 282 Lab 1
 *8/22/2022
 *Ethan Campbell and Justin Delgado
 */
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ChooseaPrize {
    public static void main(String[] args) {
       
        String[] islands = { "Bermuda", "Bahama", "Jamaica", "Aruba",
                             "Martinique", "Antigua" };
        String[] activities = { "parasailing", "surfing", "snorkeling", 
                                "DeepSeaFishing", "sailBoarding", "sharkSpotting",
                                "JetSkiing", "scubaing", "shipwreck"};
        String[] intro = {"This program will randomly generate a grand prize"
                + "\nthat includes a trip to a carribean island and a two day"
                + "\npass for a specific island related activity.\n\n"
                + "Click on Ok to see your prize!!"};
        String[] termination = {"Enjoy your prize!\n"
                + "Program ending."};
        String[] options = {"Get another trip!", "Quit"};
        
        int choice = 0;
        
        Random randGen = new Random();
        
        String termTrip = "icons/Trip.png";
        ImageIcon termIcon = new ImageIcon(termTrip);
        
        String introPrize = "icons/prize.png";
        ImageIcon introIcon = new ImageIcon(introPrize);
        
        JOptionPane.showMessageDialog(null, intro, "Welcome to the prize chooser hosted by Ethan Campbell and Justin Delgado",
                JOptionPane.PLAIN_MESSAGE, introIcon);
                
        while (choice == 0){
            int island = randGen.nextInt(islands.length);
            int active = randGen.nextInt(activities.length);
        
            String activityFile = "icons/" + activities[active]+".png";
            File iconFile = new File(activityFile);
        
            if( ! iconFile.exists())
                 JOptionPane.showMessageDialog(null, "Cannot see file!", "Warning!", JOptionPane.ERROR_MESSAGE);
            else
                System.out.print("\nCan see the file -" + activityFile);
        
            ImageIcon icon = new ImageIcon(activityFile);
            String text = "\n<html><h1> on "+islands[island]+"</h1>";
      
            choice = JOptionPane.showOptionDialog(null, text, 
                "Your prize presented by Ethan and Justin ",
                0, 1, icon, options, options[0]);
        }
        if(choice == 1)
             JOptionPane.showMessageDialog(null, termination, "Thank you for playing!", JOptionPane.PLAIN_MESSAGE, termIcon);          
}
}

