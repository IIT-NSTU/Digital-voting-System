
package Spl_project;

import javax.swing.JFrame;







/*
This class contains the main fuction which is 
for the interface of election commissioner
*/

public class Main {
public static void main(String[]args) throws InterruptedException
   {
       
        // Welcome page is the 1st interface for the election commissioner
        Welcome_Page frame=new Welcome_Page();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting the size width 700,height 500
        frame.setSize(700, 500);
        //It will display the frame at the center of screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // Title of the welcome page
        frame.setTitle("Welcome Page");
         for(int i=0;i<50;i++)
         {
             //running the welcome page for a specific period of time 
             Thread.sleep(50);
             if(i==49)
             {
                 //Disposing the welcome page after speicific amount of time
                 frame.dispose();
                 
                 //creating object for admin_panel
                 Admin_panel frame2=new Admin_panel();
   
                 frame2.setVisible(true);
                 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 //setting the size width 700,height 500
                 frame2.setSize(700,500);
                 //It will display the frame at the center of screen
                 frame2.setLocationRelativeTo(null);
                 //Title of frame
                 frame2.setTitle("Admin Panel");
             }
             
         }

             }
                
    
    


             
             
         }
        
        
   
   
    

 