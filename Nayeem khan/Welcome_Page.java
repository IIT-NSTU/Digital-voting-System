/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * this class contain the welcome page comes after running the main class
 */
public class Welcome_Page extends JFrame {
    //variable for Container
   public Container container;
   //variable for JLabel
    public JLabel nullLabel,welcomeLabel,projectLabel;
    //variable for JPanel
    public JPanel outputPanel;
    
    //constructor
    public Welcome_Page()
    {
        //calling the components method
        components();
    }
    
    //this method contains all the capabilities of the class 
    public void components()
    {
        //storing the whole frzme in the container
         container = this.getContentPane();
         //setting the bavkgroung colour
         container.setBackground(Color.white);

         //setting the icon of the frame
         ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
         this.setIconImage(icon1.getImage());
         container.setLayout(new BorderLayout(150,50));
       
         //creating nulllabel for showing empty space at the east side of frame
        nullLabel = new JLabel();        
        container.add(nullLabel,BorderLayout.EAST);
        
        //creating nulllabel for showing empty space at the west side of frame
        nullLabel = new JLabel();        
        container.add(nullLabel,BorderLayout.WEST);
        
        
        
        //creating a Jpanel to store the contents of the frame 
        outputPanel = new JPanel();
        //setting the layout of the JPanel
        outputPanel.setLayout(new GridLayout(2,1));       
        outputPanel.setBackground(Color.white);
        //adding the outputpanel in the container
        container.add(outputPanel,BorderLayout.CENTER);
        
        //creating a JLabel to shoe the text "Welcome to Digital voting system"
        welcomeLabel = new JLabel("Welcome to Digital voting system");
        //setting the foreground colour
        welcomeLabel.setForeground(Color.blue);
        //setting the horozontal alignment
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        //setting the font
        welcomeLabel.setFont(new Font("Arial",Font.BOLD,20));
        //adding the outputpanel
        outputPanel.add(welcomeLabel);
        
        
        //creating a nulllabel to show an image of nirvachon commision      
        JLabel nulllaabel1= new JLabel();
        //setting the algnment 
        nulllaabel1.setHorizontalAlignment(JLabel.CENTER);
        
        //adding the nulllabel to outputpanel
        outputPanel.add(nulllaabel1);
        
    
    }
    
     }
    

