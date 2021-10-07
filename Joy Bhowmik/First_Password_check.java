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

/**
 *
 * this class helps to check the password
 */
public class First_Password_check extends JFrame
{
    //varibales for the container
    Container c;
     //varibales for the JLabel
    JLabel label;
     //varibales for the JButton
    JButton button_cancel,button_ok;
     //varibales for the JPasswordField
    JPasswordField password;
    //variable to store the string from the JPasswordField
    String Text_password;
    
    //constructor
    public First_Password_check() 
    {
        //calling the method
        components();
    }
    
    //components method to show all the things in the frame
    public void components() 
    {
        //storing the frame in the container
        c=this.getContentPane();
        //setting the layout of the container
        c.setLayout(null);
        //setting the icon of the frame
        ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon1.getImage());
        
        //creating a JLabel for showing the ("Password :") text
        label=new JLabel("Password :");
        //setting the location of the JLabel
        label.setBounds(15,20,90,30);
        //Setting the font of the JLabel
        label.setFont(new Font("Arial",Font.BOLD,15));
        //Adding the Jlabel with the container
        c.add(label);
        
        //creating a JPasswordField foe giving the password
        password=new JPasswordField();
        //setting the location and the size of the JPasswordField
        password.setBounds(110,20,150,30);
        password.setBackground(Color.white);
        //adding the JPasswordField with the container
        c.add(password);
        
        
        //creating a button named cancel
        button_cancel=new JButton("Cancel");
        //setting the font of the button
        button_cancel.setFont(new Font("Arial",Font.BOLD,15));
        //setting the location and the size of the button
        button_cancel.setBounds(40,60,85,30);
        //setting the background and foreground colour of the JButton
        button_cancel.setBackground(Color.blue);
        button_cancel.setForeground(Color.yellow);
        //adding the JButton
        c.add(button_cancel);
        
        //creating a button named ok
        button_ok=new JButton("Ok");
        //setting the font of the button
        button_ok.setFont(new Font("Arial",Font.BOLD,15));
        //setting the location and size of the button
        button_ok.setBounds(148,60,85,30);
        //setting the background and foreground colour
        button_ok.setBackground(Color.blue);
        button_ok.setForeground(Color.yellow);
        //adding the button in the container
        c.add(button_ok);
        
        // reading the  given password line(2nd line)
        
        try{
         Text_password=Files.readAllLines(Paths.get("E:\\voting_info.txt")).get(1);
        }
        //catching the Exception
        catch(Exception e)
        {
            System.out.println("error in reading password");
        }
        
        
        
        //adding actionlistner with the button named button_ok
        button_ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //getting text from jpasswordfield
                String text=password.getText();
                
                //checking whether the given password is ok or not
                if(text.equals(Text_password))
                {
                    //if ok then dispose the current frame
                    dispose();
                    
                   try{
                       //the presence of this file means the voting is started 
                   File newfile3= new File("E:\\Vote_start.txt");
                   //checking is the file is present or not 
                   if(!newfile3.createNewFile())
                   { 
                       //file deleting
                      newfile3.delete();
                      //file creation
                      newfile3.createNewFile();        }
                   else
                   {
                       //file creating
                       newfile3.createNewFile();}
                    }
                    catch(IOException ex){
                      System.out.println("An error is occured.");
                    }
                    
                    
                   // showing the Ending page if password is ok
                   Ending_page frame=new Ending_page();
                   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   frame.setSize(700, 500);
                   frame.setLocationRelativeTo(null);
                   frame.setVisible(true);
                   frame.setTitle("Ending Page"); 
                    
                    
                }
                else
                {
                    //showing the error message if the password is not correct
                    JOptionPane.showMessageDialog(null, "Password is wrong", "Error", JOptionPane.ERROR_MESSAGE);
                    text="";
                }
        
 

            }
        });
        
        //cancel button dispose the current frame 
        button_cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                //disposing the current frame
                dispose();
                //creating the object of the Starting_page
                Starting_page frame=new Starting_page();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(700, 500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                //setting the title of the Starting_page
                frame.setTitle("Starting Page"); 
                
 

            }
        });
    }
    
    
    
    
    
}
