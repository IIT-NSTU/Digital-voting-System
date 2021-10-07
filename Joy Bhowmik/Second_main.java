/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import java.io.File;
import javax.swing.JFrame;

//this class contains the main method of the interface of user
public class Second_main 
{
    //main method
    public static void main(String[]args)
    {
        //creating object of the User_panel
       User_panel frame=new User_panel();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //setting the size of the frame
       frame.setSize(700,500);
       //displaying the frame at the center of the screen
       frame.setLocationRelativeTo(null);
       //setting the title
       frame.setTitle("User panel");
       
        
    }
    
}
