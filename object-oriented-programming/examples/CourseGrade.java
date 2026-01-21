
/**
 * Compute the final grade as a weighted sum of the scores obtained in exam, lab and homework
 *
 * @author (massoudhaamd)
 * @version (010120251115)
 */
import java.util.*;
public class CourseGrade
{
  public static void main(String[] args){
      final int examWeight=70;
      final int labWeight=20;
      final int hwWeight=10;
      
      double examScore;
      double labScore;
      double hwScore;
      double finalGrade;
      
      //ask student to input scores for exam, lab and homework.
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your exam grade: ");
      examScore=input.nextDouble();
      System.out.print("Enter your lab grade: ");
      labScore=input.nextDouble();
      System.out.print("Enter your hw grade: ");
      hwScore=input.nextDouble();
      
      examScore=examScore*(examWeight/100.0);
      labScore=labScore*(labWeight/100.0);
      hwScore=hwScore*(hwWeight/100.0);
      
      finalGrade=examScore+labScore+hwScore;
      
      System.out.println("Your final grade is: "+finalGrade);
      
  }
}