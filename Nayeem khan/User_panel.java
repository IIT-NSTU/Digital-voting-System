
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//this class is the 1st interface for the voter 
//here face recognition of hte voters will take place
public class User_panel extends JFrame{
    //varibale of Container
    Container c;
    //varibale of JPanel
    JPanel outputPanel,innerpanel1,innerpanel2;
    //varibale of JLabel
    JLabel label1,label2,nullLabel,label3;
    //varibale of Font
    Font f,f1;
    
    //comstructor
    public User_panel()
    {
        //calling the method
       components();
    }

  //this method contents all the capabilities of the class
    public void components()
    {
        //storing the frame in the container
        c=this.getContentPane();
        //setting the backgroung colour
        c.setBackground(Color.white);
        //setting the icon of the frame
        ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon1.getImage());
        //setting the layout of the container
        c.setLayout(new BorderLayout(150,100));
    
       // creating nulllabel to show empty space in the east part of the frame
        nullLabel = new JLabel();         
        c.add(nullLabel,BorderLayout.EAST);
        
        // creating nulllabel to show empty space in the west part of the frame
        nullLabel = new JLabel();       
        c.add(nullLabel,BorderLayout.WEST);
        
        // creating nulllabel to show empty space in the north part of the frame
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.NORTH);
        
        // creating nulllabel to show empty space in the south part of the frame
        nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.SOUTH);
        
        //creating a jPnael to show the contents of the frame
        outputPanel = new JPanel();
        //setting the layout of the conatiner
        outputPanel.setLayout(new GridLayout(6,1)); 
        //setting the background colour
        outputPanel.setBackground(Color.white);
        //adding the outputPanel in the container
        c.add(outputPanel,BorderLayout.CENTER);
        
    
        //creating objects of font class
        f=new Font("SansSerif", Font.BOLD, 18);
        f1=new Font("SansSerif", Font.BOLD, 14);
     
        //creating JLabel to show the text "If you want to give vote then press "
        label1=new JLabel("If you want to give vote then press ");
        label1.setOpaque(true);
        //setting the font
        label1.setFont(f);
        //setting the horizontal alignment
        label1.setHorizontalAlignment(JLabel.CENTER);
        //setting the foreground and background colour
        label1.setBackground(Color.white);
        label1.setForeground(Color.black);
        //adding the JLabel
        outputPanel.add(label1);

    
    
        //creating a JLabel to show the text  "The following button "
        label2=new JLabel("The following button ");  
        label2.setOpaque(true);
        //setting the font
        label2.setFont(f);
        //setting the horizontal alignment
        label2.setHorizontalAlignment(JLabel.CENTER);
        //setting the foreground and background colour
        label2.setBackground(Color.white);
        label2.setForeground(Color.black);
        //adding the JLabel
        outputPanel.add(label2);

        //creating a JPanel as a part of outputpanel 
        innerpanel1=new JPanel();
        //setting the layout of the JPanel
        innerpanel1.setLayout(new GridLayout(1,3));
        //settting up the background colour
        innerpanel1.setBackground(Color.white);
        //adding the JPanel
        outputPanel.add(innerpanel1);
        
        //creating null label to fulfill the layout of innerpanel1
        nullLabel = new JLabel();
        nullLabel.setBackground(Color.white);
        //adding the nulllabel
        innerpanel1.add(nullLabel);
 

        //creating a button named vote
        JButton button=new JButton("Vote");
        //setting the fore ground and background colour
        button.setForeground(Color.YELLOW);
        button.setBackground(Color.blue);
        //setting the font 
        button.setFont(f1);
        //adding the button
        innerpanel1.add(button);

         //creating null label to fulfill the layout of innerpanel1
          nullLabel = new JLabel();
          nullLabel.setBackground(Color.white);
          //adding the nulllabel
          innerpanel1.add(nullLabel);

           //creating null label to fulfill the layout of outputPanel
          nullLabel = new JLabel();
          outputPanel.add(nullLabel);

           //creating null label to fulfill the layout of outputPanel
          nullLabel = new JLabel();
          outputPanel.add(nullLabel);

           //creating null label to fulfill the layout of outputPanel
          nullLabel = new JLabel();
          outputPanel.add(nullLabel);
  

  
          //actionlistener for the button named vote
         button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       // two file denote is the vote is started or ended 
                     File newfile3= new File("E:\\Vote_start.txt");
                     File newfile4= new File("E:\\Vote_End.txt");
                     //1stly checking if the voting is ended or not 
                       if(newfile4.isFile())
                       {
                           //disposing the current frame
                           dispose();
                           //showing an error message that the voting is ended
                           JOptionPane.showMessageDialog(null, "Voting is ended", "Error", JOptionPane.ERROR_MESSAGE);

                       }
                       else{


                           //checking if the voting is started or not
                          if(newfile3.isFile()){
                              //ift started then creating the object of Image_load_in_java
                           Image_load_in_java load= new Image_load_in_java();

                                try {     
                                    //storing the max percentage after comparing with all image 
                                    double count=load.work();
                                    //checking if the percentage is greater or equal to threesold
                                    if(count>=5.68){
                                    //disposing the current frame    
                                    dispose();

                                    //creating object of Voter_panel
                                     Voter_panel frame=new Voter_panel(); 
                                     frame.setVisible(true);
                                     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                     frame.setSize(700,500);
                                     frame.setLocationRelativeTo(null);
                                     //setting the title
                                     frame.setTitle("Voter panel");
                                    }
                                    else
                                    {
                                        //showing an error message if percentage is less than threesold
                                         JOptionPane.showMessageDialog(null, "Your image is not matched", "Error", JOptionPane.ERROR_MESSAGE);
                                    } 

                                } catch (IOException ex) {

                                }}

                          else
                          {
                              //showing the error  message Voting is not started
                         JOptionPane.showMessageDialog(null, "Voting is not started", "Error", JOptionPane.ERROR_MESSAGE);
                          }
                       }



                            }
                });
 
 
 
    }
    
            
  
}
