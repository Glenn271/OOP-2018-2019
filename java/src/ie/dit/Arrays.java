package ie.dit;

import processing.core.PApplet;

public class Arrays extends PApplet {

    float[] rainfall= {45,37,55,27,38,58,27,13,23,26,11,34};
    String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

   // float[] fa = {10,9};
    float[] fa = new float[2];

    public void settings(){
        size(500,500);
    
    }

    public void setup()
    {
        fa[0]= 10;
        fa[1] = 4;

        System.out.println(fa[0]);
      //  System.out.println(fa[2]); will raise exception
      
      //find total and average
      float sum = 0;
      for (int i = 0; i < rainfall.length; i++)
      {
          System.out.println(months[i]+ "\t" + rainfall[i]);
          sum = sum + rainfall[i]; 
      }

      System.out.println("Total = " + sum);

      float avg = sum/12;
      System.out.println("Avg = " + avg);

      //find lowest and highest months of rainfall
      float lowest = rainfall[0];
      //float min = Float.MAX_VALUE; FINDS MAX VALUE A FLOAT CAN BE
      float highest = rainfall[0];
      //float max = Float.MIN_VALUE; FINDS MINIMUM VALUE A FLOAT CAN BE
      String lowestMon = "Blank";
      String highestMon = "Blank";

      for (int i= 0; i < rainfall.length; i++)
      {
          if (rainfall[i] < lowest) 
          {
              lowest = rainfall[i];
              lowestMon = months[i];
          }

          if (rainfall[i] > highest)
         {
            highest = rainfall[i];
            highestMon = months[i];
         }
      }//end for

      System.out.println("Minimum Month is " + lowestMon + " with rainfall of " + lowest);
      System.out.println("Maximum Month is " + highestMon + " with rainfall of " + highest);


      //draw a barchart of results
      colorMode(HSB);
      float rectHeight = height/(float)12;
      float rectWidth = 0;
      
      for (int i = 0; i<rainfall.length; i++)
      {
         rectWidth = rainfall[i] * 5;
         noStroke();
         fill(random(0,255),255,255);
         rect(0, rectHeight*i, rectWidth, rectHeight);
         fill(0);
         textAlign(LEFT,CENTER);
         float textY = i*rectHeight + (rectHeight * 0.5f);
         text(months[i],5, textY);
      }



/*    for (float f:rainfall)
      {
        System.out.println(f);
      }
*/
    }

    public void draw()
    {
        
    }
}
