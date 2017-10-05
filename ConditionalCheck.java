package variablesAndData;

import java.util.Scanner;

public class ConditionalCheck {
    int a,b;
    Scanner scanner=new Scanner(System.in);
    void get(){
        System.out.println("Enter A");
        a=scanner.nextInt();
        System.out.println("Enter B");
        b=scanner.nextInt();

    }
    void check(){
        if(a==b){
            System.out.println("Correct");
        }
        else {
            System.out.println("incorrect");
        }

    }

    public static void main(String[] args) {
        ConditionalCheck conditionalcheck =new ConditionalCheck();
        conditionalcheck.get();
        conditionalcheck.check();
    }
}

