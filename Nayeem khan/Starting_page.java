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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * this class contain the starting page of the voter
 */
public class Starting_page extends JFrame 
{
    //variable of Container
    Container c;
    //variable of Jpanel
    JPanel outputPanel,innerpanel1;
    //variable of JLabel
    JLabel label1,nullLabel;
    //variable of JButton
    JButton button; 
    //constructor
    public Starting_page()
    {
        //calling the method
        components();
    }
    
    //components method ehich conatins all the capability of the class
    public void components()
    {
        //storing the whole frame in container
        c=this.getContentPane();
        c.setBackground(Color.white);
        //setting the icon of the frame
        ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon1.getImage());
        //setting the layout of the container
        c.setLayout(new BorderLayout(150,100));
        
        //creating nulllabel to show empty space in the EAST part of the frame
        nullLabel = new JLabel();         
        c.add(nullLabel,BorderLayout.EAST);
        
        //creating nulllabel to show empty space in the west part of the frame
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.WEST);
        
        //creating nulllabel to show empty space in the north part of the frame
        nullLabel = new JLabel(); 
        c.add(nullLabel,BorderLayout.NORTH);
        
        //creating nulllabel to show empty space in the south part of the frame
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.SOUTH);
        
        //creating a JPanel to show the contents of the frame
        outputPanel = new JPanel();
        //setting the layout of the JPanel
        outputPanel.setLayout(new GridLayout(5,1));
        //setting the background colour
        outputPanel.setBackground(Color.white);
        //adding the Jpanel
        c.add(outputPanel,BorderLayout.CENTER);
        
        // creating a Jlabel to shoe the text "Voting is not started yet"
        label1=new JLabel("Voting is not started yet");
        label1.setOpaque(true);
        //setting the font of the JLabel
        label1.setFont(new Font("Arial",Font.BOLD,18));
        //setting the horizontal alignment
        label1.setHorizontalAlignment(JLabel.CENTER);
        //setting the foreground and background colour
        label1.setBackground(Color.white);
        label1.setForeground(Color.black);  
        //adding the JLabel
        outputPanel.add(label1);
        
        //creating a null label to fulfill the layout of the outputpanel
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the nullLabel
        outputPanel.add(nullLabel);
        
        //creating a JPanel as a part of outputpanel
        innerpanel1=new JPanel();
        //setting the layput of the panel
        innerpanel1.setLayout(new GridLayout(1,3));
        //setting the background colour
        innerpanel1.setBackground(Color.white);
        //adding the innerpanel1
        outputPanel.add(innerpanel1);
        
        //nulllabel to fulfill the layout of the innerpanel1
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the nulllabel
        innerpanel1.add(nullLabel);
        
        //creating a button named start
        button=new JButton("Start");
        //setting the background and foreground colour
        button.setForeground(Color.YELLOW);
        button.setBackground(Color.blue);
        //setting the font
        button.setFont(new Font("Arial",Font.BOLD,15));
        //adding the button
        innerpanel1.add(button);
        
        //nulllabel to fulfill the layout of the innerpanel1
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the nulllabel
        innerpanel1.add(nullLabel);
        
         //nulllabel to fulfill the layout of the outputPanel
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the nulllabel
        outputPanel.add(nullLabel);
        
         //nulllabel to fulfill the layout of the outputPanel
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the nulllabel
        outputPanel.add(nullLabel);
        
        //actionlistener for the button start
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
               //disposing the current frame
                dispose();
               
               //creating an object of First_Password_check
               First_Password_check frame=new First_Password_check();
               frame.setVisible(true);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               //setting the size
               frame.setSize(280,150);
               frame.setLocationRelativeTo(null);
               frame.setResizable(false);
               //setting the title  
               frame.setTitle("Password Check"); 
                
 

            }
        });
        
    }
    
  
    
       
        
        
        
        
        
        
    
}
