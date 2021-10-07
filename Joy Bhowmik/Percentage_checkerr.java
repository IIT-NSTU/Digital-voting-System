
package Spl_project;









//this class helps to get the percentage of matching of the two image 
public class Percentage_checkerr 
{
    //method to claculate the percentage of matching
    public Double  percentage_checking(int[][]mat1,int[][]mat2)
    {
        //initializing the count variable to count the match
        int count=0;
        //loop for traversing the matrix of 2 images
        for(int i=0;i<250;i++)
        {
          for(int j=0;j<250;j++)
          {
              //checks if the pixel value is matched or not
              if(mat1[i][j] == mat2[i][j])
              {
                  //if match is found then incrementing by 1
                  count=count+1;
              }
             
          }
   
        }
      //calculating the percentage 
      Double percentage=(count*100)/(250*250*1.0);  
      
      //returing the percentage
      return percentage;  
    }
    
}
