package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {
        byte number = 4;
        String result = "";

        if(number>= 1 && number <= 18){  // 1 ~ 18

            switch (number){ // 1 ~ 18:  case: 6~18,  default: 1~5

                case 1: case2: case3: case4: case5:
                     result = "Elementary school";
                     break;

                case 6: case 7: case 8:
                    result = "Middle school";
                    break;

                case 9: case 10: case 11: case 12:
                    result = "High school";
                    break;

                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;

                case 17: case 18:
                    result = "Grad School";
                    break;

                default: // 1~5
                    result = "Elementary school";
            }

        }else{
            result = "Invalid Grade Level";
        }

        System.out.println(result);

    }

}

/*
     if(number>= 1 && number <= 18){  // 1 ~ 18

      switch (number){ // 1~18: case: 6~18, default: 1~5
          case 6: case 7: case 8:
              result = "Middle school":
              break;

          case 9: case 10: case11: case12:
              result = "High school
              break;

          case 13: case14: case 15: case 16:
               result = "Collage";
               break;
          case 17: case 18:
               result = "Grad School";



 */