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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// this class shows the ending page of voting
public class Ending_page extends JFrame
{
    //container variable for storing frame
    Container c;
    //creating JPanel variables  
    JPanel outputPanel,innerpanel1;
    //creating the JLabel
    JLabel label1,nullLabel;
    //creating the JButton
    JButton button; 
    //constructor
    public Ending_page()
    {
        //calling the method
        components();
    }
    //components method
    public void components()
    {
        //storing the frame in the container
        c=this.getContentPane();
        //setting the background colour
        c.setBackground(Color.white);
        //setting the layout of the container
        c.setLayout(new BorderLayout(150,100));
        
        //setting the icon of the frame
        ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon1.getImage());
        
        //creating the JLabel to show empty place at east side
        nullLabel = new JLabel();         
        c.add(nullLabel,BorderLayout.EAST);
        
        //creating the JLabel to show empty place at west side
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.WEST);
        
        //creating the JLabel to show empty place at north side
        nullLabel = new JLabel(); 
        c.add(nullLabel,BorderLayout.NORTH);
        
        //creating the JLabel to show empty place at south side
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.SOUTH);
        
        //creating a JPanel to store the contents of the frame
        outputPanel = new JPanel();
        //setting the layout of the Jpanel
        outputPanel.setLayout(new GridLayout(5,1));
        //setting the backgroung colour
        outputPanel.setBackground(Color.white);
        //adding the JPanel in container
        c.add(outputPanel,BorderLayout.CENTER);
        
        // creating a JLabel to print the ("Vo text lineting is  started")
        label1=new JLabel("Voting is  started");
        label1.setOpaque(true);
        //setting the font of the text of JLabel
        label1.setFont(new Font("Arial",Font.BOLD,18));
        //setting the alignment of the text
        label1.setHorizontalAlignment(JLabel.CENTER);
        //setting foreground and background colour
        label1.setBackground(Color.white);
        label1.setForeground(Color.black);
        //adding the label1 with outputPanel
        outputPanel.add(label1);
        
        //nulllabel creating for outpanel
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        outputPanel.add(nullLabel);
        
        //creating a innerpanel as a part of outputpanel
        innerpanel1=new JPanel();
        //setting the layout of innerpanel
        innerpanel1.setLayout(new GridLayout(1,3));
        innerpanel1.setBackground(Color.white);
        //adding the innerpanel with the outputpanel
        outputPanel.add(innerpanel1);
        
        //creating null label
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the label with innerpanel1
        innerpanel1.add(nullLabel);
        
        //creating a button
        button=new JButton("End");
        //setting the background and foreground colour
        button.setForeground(Color.YELLOW);
        button.setBackground(Color.blue);
        //setting the font of button
        button.setFont(new Font("Arial",Font.BOLD,15));
        //adding the button
        innerpanel1.add(button);
        
        //creating a label
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the label with innerpanel
        innerpanel1.add(nullLabel);
        
        //creating a label
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the panel with outputpanel
        outputPanel.add(nullLabel);
        
        //creating a label
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the panel with outputpanel
        outputPanel.add(nullLabel);
        
        //actionlistener for the button end
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
               //disposing the current frame 
               dispose();
               //creating a object for the Password_check class
               Password_check frame=new Password_check();
               frame.setVisible(true);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setSize(280,150);
               frame.setLocationRelativeTo(null);
               frame.setResizable(false);
               //setting the title of the frame
               frame.setTitle("Password Check"); 
                
 

            }
        });
        
    }
    
   
}
