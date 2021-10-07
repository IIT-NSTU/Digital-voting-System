 package Spl_project;


import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

 // this class helps in the histogram equilization of the image
public class Histo_equi {
  
  //constructor   
  public Histo_equi( String location){
  //calling the method
  components(location);
  }  
     //components method which contains all the works done by this class
      public  void components  (String location) {
    // Loading the OpenCV core library
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );

      // Reading the Image from the file and storing it in to a Matrix object
      String file =location;

      // Load the image
      Mat img = Imgcodecs.imread(file);

      // Creating an empty matrix
      Mat equ = new Mat();
      img.copyTo(equ);

      // Applying blur
      Imgproc.blur(equ, equ, new Size(3, 3));

      // Applying color
      Imgproc.cvtColor(equ, equ, Imgproc.COLOR_BGR2YCrCb);
      List<Mat> channels = new ArrayList<Mat>();

      // Splitting the channels
      Core.split(equ, channels);

      // Equalizing the histogram of the image
      Imgproc.equalizeHist(channels.get(0), channels.get(0));
      Core.merge(channels, equ);
      Imgproc.cvtColor(equ, equ, Imgproc.COLOR_YCrCb2BGR);
      
      // converting equalised image into gray image
     Mat gray = new Mat();
      Imgproc.cvtColor(equ, gray, Imgproc.COLOR_BGR2GRAY);
      
     String s=location;
     //writing the Processed image 
      Imgcodecs.imwrite("E:\\Face recognition test\\image2.jpg", gray);
      System.out.println("Image Processed");
   }
    
}


