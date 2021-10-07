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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// this class will shoe the result of the vote 
public class Result_panel extends JFrame{
    //varibales for JLabel
    JLabel label,label1,label2,label3,nullLabel;
    //varibales for Container
    Container c;
    //varibales for JPanel
    JPanel outputPanel,innerpanel1;
    //varibales for JTextArea
    JTextArea button1,button2,button3;
    //varibales for JButton 
    JButton button;
    //varibales to count the number of votes of the candidates
    int number1=0,number2=0,number3=0;
   
    //comstructor
   public Result_panel()
   {
       //calling the method
    components();
   } 
    
   //components method contains all the capabilities of the class 
    public void components()
    {
            //storing the whole frame in the container
            c=this.getContentPane();
            c.setBackground(Color.white);

           //setting the layout of the container
            c.setLayout(new BorderLayout(50,100));
            //creating the object of font class
            Font f=new Font("SansSerif", Font.BOLD, 18);
            
            //setting the icon of the frame
            ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
            this.setIconImage(icon1.getImage());

            //vote counting of candidate 1

                        try (BufferedReader br = new BufferedReader(new FileReader("E:\\file1.txt"))) {

                                while (( br.readLine()) != null) {
                                     //icrementing 1 for each vote
                                        number1=number1+1;
                                }
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                        //ends vote counting of candidate 1

            //vote counting of candidate 2

                        try (BufferedReader br = new BufferedReader(new FileReader("E:\\file2.txt"))) {

                                while (( br.readLine()) != null) {
                                    //incrementing 1 for 1 vote
                                        number2=number2+1;
                                }
                        } catch (IOException e) {
                                e.printStackTrace();
                        }//ends vote counting of candidate 2

            //vote counting of candidate 3

                        try (BufferedReader br = new BufferedReader(new FileReader("E:\\file3.txt"))) {

                                while (( br.readLine()) != null) {
                                    //incrementing 1 for 1 vote
                                        number3=number3+1;
                                }
                        } catch (IOException e) {
                                e.printStackTrace();


                        }//ends vote counting of candidate 3

                        //converting votes into string for printing
                        String str1=String.valueOf(number1);
                        String str2=String.valueOf(number2);
                         String str3=String.valueOf(number3);
                         //ends converting
               //nulllabel to show empty in the  EAST side of the frame         
               nullLabel = new JLabel();        
                c.add(nullLabel,BorderLayout.EAST);
                
                //nulllabel to show empty in the  west side of the frame    
                nullLabel = new JLabel();        
                c.add(nullLabel,BorderLayout.WEST);
                
                //nulllabel to show empty in the  south side of the frame    
                nullLabel = new JLabel();        
                c.add(nullLabel,BorderLayout.SOUTH);

                //creating a Jpanel to store the contents of the frame
                outputPanel = new JPanel();
                //setting the layout of the JPanel
                outputPanel.setLayout(new GridLayout(3,1));
                outputPanel.setBackground(Color.white);
                //adding the outputpanel 
                c.add(outputPanel,BorderLayout.CENTER);

                
          //creating JLabel to shoe the "Result of voting" text
          label=new JLabel("Result of voting");
          label.setOpaque(true);
          //setting the font of JLabel
          label.setFont(new Font("SansSerif", Font.BOLD, 20));
          //setting the backgroung colour
          label.setBackground(Color.white);  
          //setting the alignment
          label.setHorizontalAlignment(JLabel.CENTER);
          //adding the outputpanel
          outputPanel.add(label);
          
           //creating an JPAnel as a part of outputpanel
           innerpanel1 =new JPanel();
           //setting the layout of the Panel
           innerpanel1.setLayout(new GridLayout(1,3));
           //setting the background colour
           innerpanel1.setBackground(Color.white);
           //adding the panel
           outputPanel.add(innerpanel1);

          //creating a JLabel to show the image of candidate 1
          label1=new JLabel();
          label1.setOpaque(true); 
          //selecting the image of the candidate 1
          label1.setIcon(new ImageIcon("G:/output.jpg"));
          label1.setBackground(Color.white);
          //adding the JLabel
          innerpanel1.add(label1);

         //Creating the JLabel to show the photo of candidate 2
          label2=new JLabel();
          label2.setOpaque(true); 
          //selecting the image 
          label2.setIcon(new ImageIcon("G:/output1.jpg"));
          //setting the backgroung colour
          label2.setBackground(Color.white);
          //adding the JLAbel
          innerpanel1.add(label2);

          //creating JLabel to show the uimage of candidate 3
          label3=new JLabel();
          label3.setOpaque(true);
          //selecting the image
          label3.setIcon(new ImageIcon("G:/output2.jpg"));
          //setting the backgroung colour
          label3.setBackground(Color.white);
          //adding the JLabel
          innerpanel1.add(label3);
          
          //creating a JPanel as a part of the outoutpanel
          JPanel innerpanel2=new JPanel();
          //setting the layout  of the panel
          innerpanel2.setLayout(new GridLayout(3,6));
          innerpanel2.setBackground(Color.white);
          //adding the panel
          outputPanel.add(innerpanel2);
          


          //creating a JTextArea to show the result of votes of candidate 1
          button1=new JTextArea();
          //setting editable false
          button1.setEditable(false);
          button1.setOpaque(true);
          //printing the result in the textarea
          button1.setText(str1);
          //setting the font 
          button1.setFont(new Font("Arial",Font.BOLD,24));
          button1.setForeground(Color.red);
          button1.setBackground(Color.yellow);
          //adding the button
          innerpanel2.add(button1);

          //creating nulllabel to fulfill the layout of innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);

          //creating a JTextArea to show the result of votes of candidate 2
          button2=new JTextArea();
          //can not able to edit the textarea
          button2.setEditable(false);
          button2.setOpaque(true);
          //setting the font
          button2.setFont(new Font("Arial",Font.BOLD,24));
          //setting the foreground and background colour
          button2.setForeground(Color.red);
          button2.setBackground(Color.yellow);
          //setting the text
          button2.setText(str2);
          //adding the text area
          innerpanel2.add(button2);

          //creating null label to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);


          //creating a JTextArea to show the result of votes of candidate 3
          button3=new JTextArea();
          //can not edit the textarea
          button3.setEditable(false);
          button3.setOpaque(true);
          //setting the text
          button3.setText(str3);
          //setting the font
          button3.setFont(new Font("Arial",Font.BOLD,24));
          //setting the foregroung and backgroung colour
          button3.setForeground(Color.red);
          button3.setBackground(Color.yellow);
          //adding the textarea 
          innerpanel2.add(button3);

          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);

          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          
          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          
          //creating nulllabel to fulfill the layout of the innerpanel2
         
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          //creating nulllabel to fulfill the layout of the innerpanel2
          
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);

          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);
          //creating nulllabel to fulfill the layout of the innerpanel2
          nullLabel=new JLabel();
          innerpanel2.add(nullLabel);



          //creating button named back
          button=new JButton("back");
          button.setOpaque(true);
          //setting background nad foreground colour 
          button.setForeground(Color.yellow);
          button.setBackground(Color.blue);
          //setting the font
          button.setFont(f);
          //adding the button
          innerpanel2.add(button);

          //actionlistener for the button back
         button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                //disposing the current frame
                        dispose();   

                File Voting_info= new File("E:\\voting_info.txt");
                //file deleting
                Voting_info.delete();

                File folder= new File("E:\\webcame images");
                //folder deleting
                for (File file: folder.listFiles()) 
                  {
                      //file deleting
                     file.delete();         
                  }
                //folder deleting
                folder.delete();

                File image_number_file= new File("E:\\web_image_number.txt");
                //file deleting
                image_number_file.delete();

                File newfile= new File("E:\\file1.txt");
                //file deleting
                newfile.delete();

                File newfile2= new File("E:\\file2.txt");
                //file deleting
                newfile2.delete();

                File newfile3= new File("E:\\file3.txt");
                //file deleting
                newfile3.delete();


                       //creating the object of the admin panel
                        Admin_panel frame2=new Admin_panel();
                         frame2.setVisible(true);
                         frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                         frame2.setSize(700,500);
                         frame2.setLocationRelativeTo(null);
                         //seeting the title
                         frame2.setTitle("Admin Panel");


                    }
                });
    
    }
    
   
    
 
 
  
}

