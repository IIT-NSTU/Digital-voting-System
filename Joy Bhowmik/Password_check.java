/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/*
this class helps to check the password 
*/

public class Password_check extends JFrame
{
    //variable for the container
    Container c;
    //variable for the JLabel
    JLabel label;
    //variables for the button
    JButton button_cancel,button_ok;
    //varibale for the JPasswordField
    JPasswordField password;
    //string varibale to store the password from the JPasswordField
    String Text_password;
    
    //constructor
    public Password_check() 
    {
        //calling the components method
        components();
    }
    //components method contains all the capability of the class
    public void components() 
    {
        //storing the whole frame in the container
        c=this.getContentPane();
        //setting the layput of the container
        c.setLayout(null);
        //setting the ico of the frame
        ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon1.getImage());
        
        //creating a JLabel to shoe=w the ("Password :")text
        label=new JLabel("Password :");
        //setting the location and the size of the JLabel
        label.setBounds(15,20,90,30);
        //setting the font of the JLabel
        label.setFont(new Font("Arial",Font.BOLD,15));
        //adding the JLabel
        c.add(label);
        
        //creating a JPasswordField to give the password
        password=new JPasswordField();
        //setting the location and the  size of the JPasswordField
        password.setBounds(110,20,150,30);
        password.setBackground(Color.white);
        //adding the JPasswordField
        c.add(password);
        
        
        //creating a button named Cancel
        button_cancel=new JButton("Cancel");
        //setting the font
        button_cancel.setFont(new Font("Arial",Font.BOLD,15));
        //setting the location and size of the button
        button_cancel.setBounds(40,60,85,30);
        //setting the background nad foreground colour
        button_cancel.setBackground(Color.blue);
        button_cancel.setForeground(Color.yellow);
        //adding the button
        c.add(button_cancel);
        
        //creating a button name ok
        button_ok=new JButton("Ok");
        //setting the font
        button_ok.setFont(new Font("Arial",Font.BOLD,15));
        //setting the location and the size of the button
        button_ok.setBounds(148,60,85,30);
        //setting the background nad foreground colour
        button_ok.setBackground(Color.blue);
        button_ok.setForeground(Color.yellow);
        //adding the button
        c.add(button_ok);
        
        // reading the  given password line(2nd line)
        
        try{
         Text_password=Files.readAllLines(Paths.get("E:\\voting_info.txt")).get(1);
        }
        catch(Exception e)
        {
            System.out.println("error in reading password");
        }
        
        
        //actionlistener of the button named OK
        button_ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //getting text from jpasswordfield
                 String text=password.getText();
                //checking the given password i ok or not
                if(text.equals(Text_password))
                {
                    //diposing the current frame
                    dispose();
                    
                   try{
                   //the presence of this file means vote taking is ended    
                   File newfile3= new File("E:\\Vote_End.txt");
                   //checking if the file is present or not 
                   if(!newfile3.createNewFile())
                   { 
                      //file delete 
                      newfile3.delete();
                      //file create
                      newfile3.createNewFile();        }
                   else
                   {
                       //file create
                   newfile3.createNewFile();}
                    }
                    catch(IOException ex){
                      System.out.println("An error is occured.");
                    }
                    
                    
                    // showing the result panel if password is ok
                    Result_panel frame2=new Result_panel(); 
                    frame2.setVisible(true);
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.setSize(700,500);
                    frame2.setLocationRelativeTo(null);
                    //setting the title
                    frame2.setTitle("Result panel");
                    
                }
                else
                {
                    //showing the error message if the password is not ok
                    JOptionPane.showMessageDialog(null, "Password is wrong", "Error", JOptionPane.ERROR_MESSAGE);
                    text="";
                }
        
 

            }
        });
        
        //actionlistener of the cancel button 
        button_cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               //dispose the current frame 
                dispose();
                //creating the object of the Ending_page
                Ending_page frame=new Ending_page();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(700, 500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                //setting the title of the frame
                frame.setTitle("Ending Page");  
                
 

            }
        });
    }
   
}
