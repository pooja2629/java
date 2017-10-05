package variablesAndData;

import java.util.Scanner;

public class SwitchCaseEvenOdd {
    int a,b,result,casenumber;
    void show(){
    Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a");

    a=s.nextInt();
        System.out.println("enter the value of b");
    b=s.nextInt();
        System.out.println("1. add\n"+"2. sub\n"+"3. mul\n"+"4. div\n");
        System.out.println("enter your choice");
    casenumber=s.nextInt();

        switch(casenumber){
        case 1:
            result=a+b;
            System.out.println("in case 1");
            System.out.println(result);
            break;
        case 2:
            result=a-b;
            System.out.println("in case 2");
            System.out.println(result);

            break;
        case 3:
            result=a*b;
            System.out.println("in case 3");
            System.out.println(result);
            break;
        case 4:
            result=a/b;
            System.out.println("in case 4");
            System.out.println(result);
            break;

    }

}
    void check()
    {

        if(a%2==0){
            System.out.println("no is even");
        }
        else {
            System.out.println("no is odd");
        }
    }


    public static void main(String[] args) {
        SwitchCaseEvenOdd sc=new SwitchCaseEvenOdd();
        sc.show();
        sc.check();

    }

}
