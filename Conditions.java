/*
Inside main(), complete the following steps:
Declare an int variable named age and assign it a value
Use an if statement with the >= operator to check if age is 18 or older
If the condition is true, print Allowed
Otherwise, print Not allowed
 */

public class Conditions{
    public static void main(String[] args){
        int age = 20;
        if (age >= 18){
            System.out.println("Allowed");
        }else{
            System.out.println("Not allowed");
        }
    }
}