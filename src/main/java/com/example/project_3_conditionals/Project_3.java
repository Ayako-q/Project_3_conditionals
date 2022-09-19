package com.example.project_3_conditionals;
import java.util.Scanner;
public class Project_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi, welcome, 1 to continue, 2 to exit");
        boolean ingame = false;
        while(ingame != true){ //demonstrating usage of != , == , @@ || statements
            System.out.println("Enter your answer:");
            int userinput = in.nextInt();
            System.out.println("Your answer is " + userinput + ", is that correct? Y or N");
            String answer = in.next();
            if(userinput == 1 && answer.equals("Y")){
                System.out.println("Ok, lets continue!");
                ingame = true;
            }
            else if(userinput == 2){
                if(answer.equals("Y")){
                    System.out.println("Bye!");
                    break;
                }
                else{
                    System.out.println("Error, try again");//nested conditionals
                }
            }
            else if (userinput > 2 || userinput < 1){ //using || statement to prevent user from entering wrong numbers
                System.out.println("Sorry, wrong number, try again, 1 to continue, 2 - exit");
            }
        }
    }
}
