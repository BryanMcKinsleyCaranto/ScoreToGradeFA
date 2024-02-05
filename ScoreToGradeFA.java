package ScoreToGradeFA;

import java.util.Scanner;

public class ScoreToGradeFA{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    String grade = "";
    score = scanner.nextInt();
    if(score <=100 && score >= 90){
      grade = "A";
    }else if(score <=89 && score >=80){
      grade = "B";
    }else if(score <=79 && score >=70){
      grade = "C";
    }else if(score <=69 && score >= 60){
      grade = "D";
    }else if(score <60){
      grade = "F";
    }
    
    System.out.println(grade);
  }

}