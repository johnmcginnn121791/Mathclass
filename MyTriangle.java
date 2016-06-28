
import java.util.Scanner;

import java.text.*;

public class MyTriangle

{

   public static void main(String[] args)

   {

        Scanner input = new Scanner(System.in);

           boolean valid = true;

           double side1, side2, side3, area, s;

   

      System.out.print("Please enter side1: ");

        side1 = input.nextDouble();

       

        System.out.print("Please enter side2: ");

        side2 = input.nextDouble();

             

        System.out.print("Please enter side3: ");

     side3 = input.nextDouble();

 

        valid = isValid(side1, side2, side3);

         

             

        if(valid)

        {

           double typeof = triangleType(side1,side2,side3);

              
      

        System.out.print("The type of the triangle is:" + typeof);

        }

        else             

        System.out.println("The input is not valid");

     }

 

     public static boolean isValid(double side1, double side2, double side3)

     {

          return(((side1 + side2) >side3) && ((side2 + side3) > side1) && ((side3 + side1) >side2));

     }

 

     public static double triangleType(double side1, double side2, double side3)

     {

       if (side1 == side2 && side2 == side3)
            {
                System.out.println("Equilateral");
            }

       else
       {
            if (side1 != side2 && side2 == side3)
            {
                System.out.println("Isoceles");
            }
            else if (side2 != side3 && side1 == side2) {
                
                System.out.println("Isoceles");
            }
       
       if (side1 == side2 && side2 == side3)
           {
                System.out.println("Equilateral");
           }

       else  
            {
                
                System.out.println("Scalene");
            }

     }

} 




