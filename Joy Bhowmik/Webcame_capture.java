/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spl_project;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.imageio.ImageIO;

//this class will help to capture the image 
public class Webcame_capture {
    //this method contains all the capabilities of the class
    public  void web() throws IOException{
        //creating variable of th webcam
    Webcam webcame=Webcam.getDefault();
    //setting the size of capture
    webcame.setViewSize(new Dimension(640,480));
    //starting the webcame
    webcame.open();
    //storing the image in the BufferedImage
    BufferedImage Image=webcame.getImage();
    int number=0;
    //taking the image number
    try (BufferedReader br = new BufferedReader(new FileReader("E:\\web_image_number.txt"))) {
			
                        Writer output;
                        output = new BufferedWriter(new FileWriter("E:\\web_image_number.txt", true));
                        output.append("1\n");
                        output.close();
                        
			while (( br.readLine()) != null) {
				number=number+1;
			}
                        number+=10000;
                        
                        //adding the the image number and image to get the name
                         String str="image"+number +".jpg";
                         //writing the image
                         ImageIO.write(Image, "JPG",new File("E:\\webcame images\\"+str));
                         //closing the webcame
                         webcame.close();
		} 
     catch (IOException e) {
            e.printStackTrace();
     }
  
    }
}
