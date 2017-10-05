package variablesAndData;

import java.util.Scanner;

public class CheckGrade {

    void conditionCheck()
    {
        Scanner scanner= new Scanner(System.in);
         System.out.println("enter the value of a:");
         int a =scanner.nextInt();

        if (a<35)
        {
            System.out.println("fail");
        }
          else if (35<=a && a<60)
        {
            System.out.println("pass");
        }
        else if (60<=a && a<75)
        {
            System.out.println("first class");
        }
        else if (75<=a && a<100)
        {
            System.out.println("distinction");
        }
    }

    public static void main(String[] args) {
        CheckGrade checkGrade =new CheckGrade();
        checkGrade.conditionCheck();
    }

}
