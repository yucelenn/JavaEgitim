package javaapplication35;

public class JavaApplication35 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz"); 
                continue;
            }
            else if(i%3 == 0) System.out.println("Fizz");
            else if(i%5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }  
}
