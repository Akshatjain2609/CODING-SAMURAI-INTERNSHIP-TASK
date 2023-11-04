
import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args)
   {
      float[] marks = new float[5];
      float sum=0; float avg;
      int i;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Marks Obtained in 5 Subjects: ");
      for(i=0; i<5; i++)
         marks[i] = scan.nextFloat();
      
      for(i=0; i<5; i++)
         sum = sum + marks[i];
      avg = sum/5;
      System.out.println("percentage = " + avg);
      
      System.out.print("\nGrade = ");
	  
      if(avg>=90)
         System.out.println("A+");
      else if(avg>=85 && avg<90)
         System.out.println("A");
      else if(avg>=80 && avg<85)
         System.out.println("B+");
      else if(avg>=75 && avg<80)
         System.out.println("B");
      else if(avg>=70 && avg<75)
         System.out.println("C+");
      else if(avg>=65 && avg<70)
         System.out.println("C");
      else if(avg>=60 && avg<65)
         System.out.println("D+");
      else if(avg>=55 && avg<60)
         System.out.println("D");
      else if(avg>=50 && avg<55)
         System.out.println("E+");
      else if(avg>=45 && avg<50)
         System.out.println("E");
      else if(avg>=40 && avg<45)
         System.out.println("F+");
      else
         System.out.println("F");
   }
}
    
