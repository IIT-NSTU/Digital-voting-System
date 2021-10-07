
package Spl_project;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

//this class return the maximum percentage of match 
//after comparing with a single webcam image with all the images of folder of voters
public class Image_load_in_java  {
    String s;
    double max=0.0;
    
     //String folder= Files.readAllLines(Paths.get("E:\\voting_info.txt")).get(1);
    
     //folder for storing the images of the webcame
     static  File dir3 = new File("E:\\webcame images");
     
     // array of supported extensions (use a List if you prefer)
    static  String[] EXTENSIONS = new String[]{
        "gif", "png", "bmp" ,"jpg"// and other formats you need
    };
    // filter to identify images based on their extensions for supplied images
    static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

        @Override
        public boolean accept(final File dir, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };
    // filter to identify images based on their extensions for webcame captured images
    static final FilenameFilter IMAGE_FILTER2 = new FilenameFilter() {

        @Override
        public boolean accept(final File dir3, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };

   // this method contains all the logic and components of the class  
 public double work() throws IOException  {
  
     // webcame objcet
     Webcame_capture web= new Webcame_capture();
     //clicking the webcam image
     web.web();
     //Reading the last captured image using  the webcame
     int size=0,count=0;
     //reading the last image from the folder of voters
        if (dir3.isDirectory()) { // make sure it's a directory
            //fetching al the files from the folder
            File [] listoffiles=dir3.listFiles(IMAGE_FILTER2);
            size=listoffiles.length;
            
            //traversing all the files
            for (final File f : listoffiles) {
                BufferedImage img = null;
                count=count+1;
                try {
                    //checking the last image
                    if(count == size) 
                            { img = ImageIO.read(f);
                             System.out.println(f.getName());
                             //writing the last image in another folder
                             ImageIO.write(img, "jpg", new File("E:\\Face recognition test\\image.jpg"));
    
                            }
                 }
                catch (final IOException e) {
                    // handle errors here
                }
            }
        }
     
     
     try
     {
          //cropping of image
       Croppping_of_image crop=new Croppping_of_image();
       //histogram equilization
       Histo_equi hist=new Histo_equi("E:\\Face recognition test\\image1.jpg");
     
     }
     
     catch(Exception e)
     {
         //showing error message if the face is not detected perfectly
         JOptionPane.showMessageDialog(null, "Please give your image again", "Error", JOptionPane.ERROR_MESSAGE);
     }
     
     
     
     //Conversion of image to pixel matrix
     Image_to_pixel pixel=new Image_to_pixel();
     //storing the 2d matrix containing the lbp pixel values of the webcam image 
     int [][] mat1= pixel.Image_to_pixel_method();
     
   
   
   // cleaning the folder
    File dir2=new File("E:\\Face recognition test");
      
     for (File file: dir2.listFiles()) 
     {
         //file deleting
          file.delete();
         
      }
     
       //resing the folder name of voter
       String folder=Files.readAllLines(Paths.get("E:\\voting_info.txt")).get(0);
       //creating a object for the folder
       File dir = new File(folder);
     
       //checking if the given name of folder is valid or not
        if (dir.isDirectory()) { // make sure it's a directory
            //traversing the whole folder of voters to get the lbp pixel values of each
            for (final File f : dir.listFiles(IMAGE_FILTER)) {
                BufferedImage img = null;
                

                try {
                    //reading a n image
                   img = ImageIO.read(f);
                   System.out.println(f.getName());
                   //writing the image in another folder
                   ImageIO.write(img, "jpg", new File("E:\\Face recognition test\\image.jpg"));
                   //cropping the image
                   Croppping_of_image crop2 =new Croppping_of_image(); 
                   //normalizing the image with histogram quilization
                   Histo_equi hist2 =new Histo_equi("E:\\Face recognition test\\image1.jpg");
                   //creating  obk=ject of the Image_to_pixel class
                   Image_to_pixel pixel2 = new Image_to_pixel();
                   //storing the 2d matrix containing the lbl pixel values
                   int [][] mat2= pixel.Image_to_pixel_method();
                 
                   
                 
                    //cleaning hte folder
                     for (File file: dir2.listFiles())
                     {
                             file.delete();
                     }
                    //creating the object of the Percentage_checkerrclass 
                    Percentage_checkerr percentage =new Percentage_checkerr();
                    //storing the percentage of matching after comparision of images
                    double matched_number=percentage.percentage_checking(mat1, mat2);
                    System.out.println(matched_number);
                    
                    //cheking iff the matching is larger or equal to the threesold
                    if(max<matched_number)
                    {
                        max= matched_number;
                    }
                    
                 
                   
                } 
                catch (final Exception e)
                {
                    // handle errors here
                }
            }
            
        }
      System.out.println(max);  
      return max;   
    }

    
}
