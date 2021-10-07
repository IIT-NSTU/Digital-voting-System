/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

//this class helps to crop the the face part of an image and save the croped image

public class Croppping_of_image {
    
    //constructor
    public Croppping_of_image(){
    //calling the method 
    components();
    }
    
    // creating the components method 
    public  void components ()
    {
        //loading the opencv libraryS
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        //creating object of the Cascade Classifier
        CascadeClassifier faceDetector = new CascadeClassifier();
        
        //loading the xml file to detect face
        faceDetector.load("C:\\opencv\\sources\\data\\haarcascades\\haarcascade_frontalface_alt.xml");
        System.out.println ( "Working" );
        
        // Input image
       Mat image = Imgcodecs.imread("E:\\Face recognition test\\image.jpg");

        // Detecting faces
        MatOfRect faceDetections = new MatOfRect();
        faceDetector.detectMultiScale(image, faceDetections);
        
        // Creating a rectangular box showing faces detected
        Rect rectCrop=null;
        for (Rect rect : faceDetections.toArray())
        {
            Imgproc.rectangle(image, new Point(rect.x, rect.y),
             new Point(rect.x + rect.width, rect.y + rect.height),
                                           new Scalar(0, 255, 0));
            rectCrop = new Rect(rect.x, rect.y, rect.width, rect.height);
        }

       
        // Saving cropped part of image in Mat
        Mat markedImage = new Mat(image,rectCrop);
        
        //Resize of cropped photo
        Mat resizeimage = new Mat();
        Size size = new Size(250,250);
        Imgproc.resize( markedImage, resizeimage, size );
        //writing the cropped photo
        Imgcodecs.imwrite("E:\\Face recognition test\\image1.jpg",resizeimage );
    }
}
