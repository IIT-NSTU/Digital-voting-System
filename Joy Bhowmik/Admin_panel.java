
package Spl_project;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//this class shows the admin panel 
//whre the election commissioner will have to give the necessary information on voting
//after giving all the necessary information the election commissioner will press the next button
//then the election commissioner will come to the starting page
public class Admin_panel extends JFrame{
    //Container variable to store the whole frame
    Container c;
    //Jlabel variables for printing the text lines
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,nullLabel;
    //JtextField variables for the textbox
    JTextField textbox1,textbox2,textbox3,textbox4,textbox5;
    //Jpanel varibales for storing multiple portion of the whole frame
    JPanel outputPanel,innerpanel;
    //Font variables to create various types of fonts 
    Font f,f2,f3;
    //String varibales to store strings
    String str1,str2,str3,str4,str5,str6="G:\\output.jpg",str7="G:\\output1.jpg",str8="G:\\output2.jpg";
    // This varibales helps to see if all the information is given correctly
    int test_number=0;
    // Constructor of the class
    public  Admin_panel()
    {
        //calling the component function in the constructor
         components();
    
    }
    
    //components functions contains all components as well as logic for the entire class
    public void components()
    {
        //String the frame in the container
        c=this.getContentPane();
        c.setBackground(Color.white);
        //Setting up the layout of the whole container
        c.setLayout(new BorderLayout(150,45));
        
        //Creating null label and adding to container to show  empty space in east side
        nullLabel = new JLabel();        
        c.add(nullLabel,BorderLayout.EAST);
        
        //Creating null label and adding to container to show  empty space in east side
        JLabel nullLabel = new JLabel();
        c.add(nullLabel,BorderLayout.WEST);
        
        //Null label to print a text line at the upper side of frame
        nullLabel = new JLabel("Hello Election Commissioner");
        nullLabel.setFont(new Font("Arial",Font.BOLD,25));
        //Setting the horizontal allignment  of the JLabel 
        nullLabel.setHorizontalAlignment(JLabel.CENTER);
        //Adding the JLabel to the container
        c.add(nullLabel,BorderLayout.NORTH);
        
        //Null label to show empty space  at the lower side of frame
        nullLabel = new JLabel();
        //Adding the JLabel to the container
        c.add(nullLabel,BorderLayout.SOUTH);
        
        //Creating a Jpanel to store the JLabel which prints Hello commissioner text line
        outputPanel = new JPanel();
        //setting up the layout of the Jpanel
        outputPanel.setLayout(new GridLayout(9,2,6,6));
        outputPanel.setBackground(Color.white);
        //Adding this JPanel to the container
        c.add(outputPanel,BorderLayout.CENTER);
    
        //Setting the icon the frame 
        ImageIcon icon1=new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon1.getImage());
        
        //creating the objects of font class
        f=new Font("Arial", Font.BOLD, 18);
        f2=new Font("Arial", Font.BOLD, 15);
        f3=new Font("Arial", Font.BOLD, 15);
    
        //Creating the label for printing  (Image folder location) text line
        label3=new JLabel("Image folder location : ");;
        label3.setOpaque(true);
        //Setting up the font of the text of the JLabel
        label3.setFont(f2);
        //Setting up foreground and the background colour of the JLabel
        label3.setBackground(Color.white);
        label3.setForeground(Color.black);
        //Storing the Jlabel in outputPanel
        outputPanel.add(label3);
        
        //creating a textbox for the above JLabel
        textbox1=new JTextField();
        textbox1.setForeground(Color.black);
        //setting up the border colur of the textbox
        textbox1.setBorder(BorderFactory.createLineBorder(Color.black));
        //Adding the textbox in the outputPanel
        outputPanel.add(textbox1);

        //Creating a Jlabel to print ("Password : ") text line
        label4=new JLabel("Password : ");
        label4.setOpaque(true);
        //setting up the font
        label4.setFont(f2);
        //Settng up the foreground and background colour
        label4.setBackground(Color.white);
        label4.setForeground(Color.black);
        //Storing the JLabel in outputPanel
        outputPanel.add(label4);

        //creating a JPasswordField  for the label4
        JPasswordField textbox2=new JPasswordField();
        //Setting up the background and foreground colour
        textbox2.setBackground(Color.white);
        textbox2.setForeground(Color.black);
         //setting up the border colur of the textbox
        textbox2.setBorder(BorderFactory.createLineBorder(Color.black));
        //storing the textbox in the outputPanel
        outputPanel.add(textbox2);

        //Creating a null label to fulfil the layout of outputPanel
        nullLabel=new JLabel();
        outputPanel.add(nullLabel);
        
        //Creating a null label to fulfil the layout of outputPanel
        nullLabel=new JLabel();
        outputPanel.add(nullLabel);
        
        //creating JLabel to print the ("Location of photos") text
        nullLabel=new JLabel("Location of photos");
        //Setting the font of the JLabel
        nullLabel.setFont(new Font("Arial",Font.BOLD,20));
        //Storing the JLabel in the outputPanel
        outputPanel.add(nullLabel);

        //Creating a null label to fulfil the layout of outputPanel
        nullLabel=new JLabel();
        outputPanel.add(nullLabel);
        
        //creating a JLabel for printing ("Candidate 1:") text line
        label5=new JLabel("Candidate 1:");
        //setting up the font of the JLabel
        label5.setFont(f2);
        label5.setOpaque(true);
        //Setting up the background and foreground colour
        label5.setBackground(Color.white);
        label5.setForeground(Color.black);
        //Storing the JLabel in the outputPanel 
        outputPanel.add(label5);

       //creating a JTextbox for the label5
       textbox3=new JTextField();
       //setting up the background and foregroung colour
       textbox3.setBackground(Color.white);
       textbox3.setForeground(Color.black);
       //Setting up the border colour of the textbox
       textbox3.setBorder(BorderFactory.createLineBorder(Color.black));
       //Storing the textbox in the outputPanel
       outputPanel.add(textbox3);

       //creating a JLabel to print ("Candidate 2:") text line 
       label5=new JLabel("Candidate 2:");
       label5.setOpaque(true);
       label5.setFont(f2);
       //Setting the background and foreground colour
       label5.setBackground(Color.white);
       label5.setForeground(Color.black);
       //Storing the JLabel in the outputPanel
       outputPanel.add(label5);
       
       //creating textbox for the above JLabel
       textbox4=new JTextField();
       //Setting p the banckground and foreground colour
       textbox4.setBackground(Color.white); 
       textbox4.setForeground(Color.black);
       //setting up the border colour
       textbox4.setBorder(BorderFactory.createLineBorder(Color.black));
       //storing the textbox in the outputpanel
       outputPanel.add(textbox4);
       
       //Creating a JLabel to print the ("Candidate 3:") text line
       label5=new JLabel("Candidate 3:");
       label5.setOpaque(true);
       //setting up the font of the JLabel
       label5.setFont(f2);
       //Setting up the background and foreground colour
       label5.setBackground(Color.white);
       label5.setForeground(Color.black);
       //storing the label in outputpnael
       outputPanel.add(label5);

       //creating textbox for the above JLabel
       textbox5=new JTextField();
       //setting up the background and the foreground colour
       textbox5.setBackground(Color.white);
       textbox5.setForeground(Color.black);
       //setting up the colour of border
       textbox5.setBorder(BorderFactory.createLineBorder(Color.black));
       //storing the textbox in the outputpanel
       outputPanel.add(textbox5);
       
       //creating a nullLabel to fullfill the layout of the outputpanel
       nullLabel = new JLabel();
       nullLabel.setOpaque(true);
       //setting thr background colour
       nullLabel.setBackground(Color.white);
       //storing the JLabel
       outputPanel.add(nullLabel);
       
       //creating a nullLabel to fullfill the layout of the outputpanel
       nullLabel = new JLabel();
       nullLabel.setOpaque(true);
       //setting thr background colour
       nullLabel.setBackground(Color.white);
       //storing the JLabel
       outputPanel.add(nullLabel);

       //creating a nullLabel to fullfill the layout of the outputpanel     
       nullLabel = new JLabel();
       nullLabel.setOpaque(true);
       //setting thr background colour
       nullLabel.setBackground(Color.white);
       //Storing the JLabel
       outputPanel.add(nullLabel);

       //creating a new JPanel to show the next Button in the perfect place of JFram 
       innerpanel = new JPanel();
       //setting up the layout of the panel
       innerpanel.setLayout(new GridLayout(1,3));
       //Setting up the background colour
       innerpanel.setBackground(Color.white);
       //soting the JPanel in Outputpanel
       outputPanel.add(innerpanel); 

       //creating nulllabel to fulfill the layout of the innerpanel
       nullLabel = new JLabel();
       nullLabel.setOpaque(true);
       //setting the backgroung colour
       nullLabel.setBackground(Color.white);
       //Storing the JLabel
       innerpanel.add(nullLabel);


       //creating a JButton
       JButton button=new JButton("NEXT");
       //setting up the background and foreground colour
       button.setForeground(Color.YELLOW);
       button.setBackground(Color.blue);
       //Storing the JButton
       innerpanel.add(button);

    //file keeping the image file location and password
        try
        {
        File Voting_info= new File("E:\\voting_info.txt");
        // checking if the file is present in the desktop
        if(!Voting_info.createNewFile())
        {  
            //delete the file
            Voting_info.delete();
            //create the file
            Voting_info.createNewFile();
        }
        else
        {
            //create the new file
            Voting_info.createNewFile();
        }


        }
        //catching the IOException
        catch(Exception e)
        {
            System.out.println("An error is occured.");
        }
        
    //file keeping the number of webacme image
        try
        {
            File image_number_file= new File("E:\\web_image_number.txt");
            //check the file is present or not
            if(!image_number_file.createNewFile())
            {
                //delete the file
                image_number_file.delete();
                //create the file
                image_number_file.createNewFile();
            }
            else
            {
                //create the file
                image_number_file.createNewFile();
                        }    
        }
        //catcing the IOException
        catch(Exception e)
        {
            System.out.println("An error is occured.");
        }

        //Checking the webcame image folder
        try{
        File folder= new File("E:\\webcame images");
        // checking the folder is it present or not 
             if(!folder.isDirectory())
             {
                 //if not present  then create one 
                 folder.mkdir();
             }
             else
             {
                 //if folder is present  then delete all the files present in the folder
                 for (File file: folder.listFiles()) 
                  {
                      //deleting files
                     file.delete();         
                  }
             }

        }
        //catching the Exception
        catch(Exception e){
                System.out.println("An error is occured.");

                }
        //Checking the face_recognition test image folder
        try{
        File folder2= new File("E:\\Face recognition test");
        // checking the folder is present or not 
             if(!folder2.isDirectory())
             {
                 //if not present then create the folder
                 folder2.mkdir();
             }
             else
             {
                 //if the folder is present then delete all the files of the folder
                 for (File file: folder2.listFiles()) 
                  {
                      //deleting files
                     file.delete();         
                  }
             }

        }
        //catching the exception
        catch(Exception e){
                System.out.println("An error is occured.");

                }


        //deleting vote_end file    
        File Vote_End= new File("E:\\Vote_End.txt");
        // checking is the file is present  
            if(Vote_End.isFile())
            {
                //if the file is present then delete the file
                Vote_End.delete();
            }  

            //deleting vote_start file    
            File Vote_Start= new File("E:\\Vote_start.txt");
            //checking if the the file is present or not  
            if(Vote_Start.isFile())
            {
                //if the file is present then delete the file
                Vote_Start.delete();
            }  


        //file of votes of candidate 1
        try{
        File newfile= new File("E:\\file1.txt");
        //checking the file file is present or not 
        if(!newfile.createNewFile())
         { 
             //if present then delete the file
             newfile.delete();
             //creating the file
             newfile.createNewFile();    
         }
        else
        {
            //creating the file
            newfile.createNewFile();}
        }
       //Catching the IOException
        catch(IOException e){
                System.out.println("An error is occured.");
                }
        
        //file of votes of candidate 2
        try{
        File newfile2= new File("E:\\file2.txt");
        //checking the file is present or not 
        if(!newfile2.createNewFile())
         { 
             //if present then delete the file
            newfile2.delete();
            //creating the file
            newfile2.createNewFile();      
         }
        else
        {
             //creating the file
             newfile2.createNewFile();}
        }
        //catching the IOException
        catch(IOException e){
                System.out.println("An error is occured.");
                }
       //file of votes of candidate 2
        try{
        File newfile3= new File("E:\\file3.txt");
        //checking the file is present or not 
        if(!newfile3.createNewFile())
         { 
             //if present then delete the file
            newfile3.delete();
            //creating the file
            newfile3.createNewFile();   
         }
        else
        {
            //creating the file
            newfile3.createNewFile();}
        }
        //catching the IOException 
        catch(IOException e){
                System.out.println("An error is occured.");
                }
        
        //ActionListener for the next button
        button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
           test_number=0;
           //storing all the input given in all the textbox
           str1=textbox1.getText();
           str2=textbox2.getText();
           str3=textbox3.getText();
           str4=textbox4.getText();
           str5=textbox5.getText();

           //Condition for all textboxes are not empty 
           if(!" ".equals(str1) && !"".equals(str2) && !"".equals(str3) && !"".equals(str4) && !"".equals(str5) ){
           
           int scaledWidth =100;int scaledHeight=100;
            // if the folder of voter  is valid or not 
            File folder_of_voter_photo=new File(str1);
                if(folder_of_voter_photo.isDirectory())
                {
                    test_number++;
                }
                else
                {
                    //showing the error message
                    JOptionPane.showMessageDialog(null, "folder location is not right", "Error", JOptionPane.ERROR_MESSAGE);
                }



           try{  
              // resizing the photo of canditate 1 
              File input_file=new File(str3);
              BufferedImage image= ImageIO.read(input_file);
              test_number++;
               BufferedImage outputImage = new BufferedImage(scaledWidth,
                        scaledHeight, image.getType());

                // scales the input image to the output image
                Graphics2D g2d = outputImage.createGraphics();
                g2d.drawImage(image, 0, 0, scaledWidth, scaledHeight, null);
                g2d.dispose();

                // extracts extension of output file
                String formatName = str6.substring(str6
                        .lastIndexOf(".") + 1);

                // writes to output file
                ImageIO.write(outputImage, formatName, new File(str6));

              }
           //showing the error message
           catch(IOException ex){JOptionPane.showMessageDialog(null, "Give the address of photo of candidte 1 rightly", "Error", JOptionPane.ERROR_MESSAGE);}

           try{      
               //resizing the photo of canditate 2
               File input_file2=new File(str4); 
               BufferedImage image1= ImageIO.read(input_file2); 
               test_number++;
               BufferedImage outputImage1 = new BufferedImage(scaledWidth,
                        scaledHeight, image1.getType());

                // scales the input image to the output image
                Graphics2D g2d = outputImage1.createGraphics();
                g2d.drawImage(image1, 0, 0, scaledWidth, scaledHeight, null);
                g2d.dispose();

                // extracts extension of output file
                String formatName = str7.substring(str7
                        .lastIndexOf(".") + 1);

                // writes to output file
                ImageIO.write(outputImage1, formatName, new File(str7));

              }
           //showing the error message
           catch(IOException ex){JOptionPane.showMessageDialog(null, "Give the address of photo of candidte 2 rightly", "Error", JOptionPane.ERROR_MESSAGE);}

            try{ 
                //resizing the photo of canditate 1 
                File input_file3=new File(str5);
                BufferedImage image2= ImageIO.read(input_file3);
                test_number++;
                BufferedImage outputImage2 = new BufferedImage(scaledWidth,
                        scaledHeight, image2.getType());

                // scales the input image to the output image
                Graphics2D g2d = outputImage2.createGraphics();
                g2d.drawImage(image2, 0, 0, scaledWidth, scaledHeight, null);
                g2d.dispose();

                // extracts extension of output file
                String formatName = str8.substring(str8
                        .lastIndexOf(".") + 1);

                // writes to output file
                ImageIO.write(outputImage2, formatName, new File(str8));
               }
            //showing the error message
            catch(IOException ex){JOptionPane.showMessageDialog(null, "Give the address of photo of candidte 3 rightly", "Error", JOptionPane.ERROR_MESSAGE);}



            if( test_number == 4)
            {
               try
            {
                //storing the folder name of voters and the password in a text file
                FileWriter newfile= new FileWriter("E:\\voting_info.txt");
                newfile.write(str1+"\n");
                newfile.write(str2);
                newfile.close();
            }
            catch (IOException ex) {

               }


               test_number=0;
               //disposing the current frame
               dispose();
              // creating the object of the  Starting_page
                Starting_page frame=new Starting_page();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(700, 500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setTitle("Starting Page"); 

           }
            str1=""; str2=""; str3=""; str4=""; str5="";
           }
           //showing the error message
           else JOptionPane.showMessageDialog(null, "Fill all the information box rightly", "Error", JOptionPane.ERROR_MESSAGE);
           }

                });
    }
    
    
 
        
      
}