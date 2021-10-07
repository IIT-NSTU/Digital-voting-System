
package Spl_project;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//this class contains the voter interface where voters can give votes
public class Voter_panel extends JFrame{
    //variable of Container
    Container c;
    //variable of JPanel
    JPanel outputPanel,innerpanel1;
    //variable of JLabel
    JLabel label,label1,label2,label3,nullLabel;
    //variable of JButton
    JButton button1,button2,button3,button4;
    
   
    //constructor
     public Voter_panel(){
         //calling the method
     components();
    }
     //this methos contains all the capabilities of the class
    public void components()
    {
        //storing the frame in the container
        c=this.getContentPane();
        //setting the background colour
        c.setBackground(Color.white);
        //setting the layout of the container
        c.setLayout(new BorderLayout(50,100));
    
        //creating a nulllabel to show empty space in the east side
        nullLabel = new JLabel();        
        c.add(nullLabel,BorderLayout.EAST);
        
        //creating a nulllabel to show empty space in the west side
        nullLabel = new JLabel();        
        c.add(nullLabel,BorderLayout.WEST);
        
        //creating a nulllabel to show empty space in the south side
        nullLabel = new JLabel();        
        c.add(nullLabel,BorderLayout.SOUTH);
        
        
        
        
        //creating a JPanel to store the contents of the frame
        outputPanel = new JPanel();
        //setting the layout of the JPanel
        outputPanel.setLayout(new GridLayout(3,1));
        //setting the backgroung colour
        outputPanel.setBackground(Color.white);
        //adding the JPanel in the container
        c.add(outputPanel,BorderLayout.CENTER);
    
        //creating a font object
        Font f=new Font("SansSerif", Font.BOLD, 18);

        //setting the icon of frame
        ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon1.getImage());
    

   
 
        //creating a JLabel to show "Candidates of voting" text
          label=new JLabel("Candidates of voting");
          label.setOpaque(true);
          //setting the font 
          label.setFont(new Font("SansSerif", Font.BOLD, 20));
          //setting the backgroung colour
          label.setBackground(Color.white);
          //setting the horizontal alignment
          label.setHorizontalAlignment(JLabel.CENTER);
          //adding the JLabel 
          outputPanel.add(label); 
   
   
   
        //creating a Jpanel as a part of the outputpanel  
        innerpanel1 =new JPanel();
        //setting the layout of the Jpanel
        innerpanel1.setLayout(new GridLayout(1,3));
        //setting the background colour
        innerpanel1.setBackground(Color.white);
        //adding the Jpanel
        outputPanel.add(innerpanel1);
   
        //creating jlabel to show the photo of candidate 1
        label1=new JLabel();
        label1.setOpaque(true); 
        //giving the location of the image 
        label1.setIcon(new ImageIcon("G:/output.jpg"));
        label1.setBackground(Color.white);
        //adding the JLabel 
        innerpanel1.add(label1);
  
  
  
        //creating a JLabel to show the photo of candidate 2
        label2=new JLabel();
        label2.setOpaque(true); 
        //giving the location of the image
        label2.setIcon(new ImageIcon("G:/output1.jpg"));
        label2.setBackground(Color.white); 
        //adding the JLabel
        innerpanel1.add(label2);
  
        //creating a JLabel to show the photo of candidate 2
        label3=new JLabel();
        label3.setOpaque(true);
        //giving the location of the image
        label3.setIcon(new ImageIcon("G:/output2.jpg"));
        label3.setBackground(Color.white);
        //adding the JLabel
        innerpanel1.add(label3);
  
        //creating a JPanel as a part of outputpanel
        JPanel innerpanel2=new JPanel();
        //setting the layout 
        innerpanel2.setLayout(new GridLayout(3,6));
        //setting the background colour
        innerpanel2.setBackground(Color.white);
        //adding the JPanel
        outputPanel.add(innerpanel2);
  
  
  
        //creating button named vote
        button1=new JButton(" vote");
        button1.setOpaque(true); 
       //adding button
        innerpanel2.add(button1);

        //creating null label to fulfill the layout of the innerpanel2 
        nullLabel=new JLabel();
        innerpanel2.add(nullLabel);

        //creating button named vote        
        button2=new JButton(" vote");
        button2.setOpaque(true);  
        //adding button
        innerpanel2.add(button2);
  
  
         //creating null label to fulfill the layout of the innerpanel2 
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);

      //creating button named vote
      button3=new JButton("vote");
      button3.setOpaque(true);
      //adding button
      innerpanel2.add(button3);
      

          //creating null label to fulfill the layout of the innerpanel2 
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);


      //creating null label to fulfill the layout of the innerpanel2 
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);

      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);
      
      //creating null label to fulfill the layout of the innerpanel2
      nullLabel=new JLabel();
      innerpanel2.add(nullLabel);

      //creating a button named back
      button4=new JButton("back");
      button4.setOpaque(true);
      button4.setEnabled(false);
      //setting background and foreground colour
      button4.setForeground(Color.yellow);
      button4.setBackground(Color.blue);
      //adding the button
      innerpanel2.add(button4);

  
   
  
      //actionlistener of vote button of candidate 1
      button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
           
                 //setting all the vote button false   
                 button1.setEnabled(false);
                  button2.setEnabled(false);
                 button3.setEnabled(false);
                 //setting the back button true
                  button4.setEnabled(true);



              try{

                  //writing a line for each vote
                 Writer output;
                 output = new BufferedWriter(new FileWriter("E:\\file1.txt", true));
                 output.append("1\n");
                 output.close();
              }

              catch(IOException ex){}
               }




            });
      //actionlistener for vote button of candidate 2

       button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    //setting all the vote button false
                 button1.setEnabled(false);
                 button2.setEnabled(false);
                 button3.setEnabled(false);
                 //setting the back button true
                 button4.setEnabled(true);
                      try{

                          //writing a line for eac vote
                       Writer output;
                       output = new BufferedWriter(new FileWriter("E:\\file2.txt", true));
                       output.append("1\n");
                       output.close();
                        }

              catch(IOException ex){}

                }
            });

       //actionlistener for vote button of candidate 3
        button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    //setting all the vote button false
                 button1.setEnabled(false);
                 button2.setEnabled(false);
                 button3.setEnabled(false);
                 //setting the back button true
                 button4.setEnabled(true);
                   try{
                      //writing a line for each vote                       
                    Writer output;
                    output = new BufferedWriter(new FileWriter("E:\\file3.txt", true));
                    output.append("1\n");
                    output.close();
                  }

              catch(IOException ex){}

                }

            });
        
        //actionlistener for the back button
        button4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    //disposing the current frame
                   dispose();
                   //creating object of the User_panel
                   User_panel frame=new User_panel();
                   frame.setVisible(true);
                   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   //setting the size of frame
                   frame.setSize(700,500);
                   frame.setLocationRelativeTo(null);
                   //setting the title
                   frame.setTitle("User panel");

                }
            });
    }
    
}
