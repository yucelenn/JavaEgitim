import java.util.Scanner;   // Bir Cümlenin Palindrome olup olmadığını bulma
import java.util.Stack;     // baştan okunuşuyla sondan okunuşu aynı kelime - kasaylabalyasak - 

public class Main {
    
    public static void main(String[] args) {
               
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi Giriniz: ");
        String cumle = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>(); // harfleri içine atmak için bir stack oluşturduk.
        
        for (int i = 0 ; i < cumle.length() / 2 ;i++) {  //cümelenin-kelimenin yarısına kadar stack e atmak için döngü.
            stack.push(cumle.charAt(i));                                      // a    b    a
        }                                                                     // l   ==?   l
        if (isPalindrome(cumle, stack)) {                                     // y   ==?   y
            System.out.println("Bu cümle Palindromedur...");                  // a   ==?   a
        }                                                                     // s   ==?   s
        else {                                                                // a   ==?   a
            System.out.println("Bu cümle Palindrom değildir...");             // k   ==?   k
        }
    }
    
    public static boolean isPalindrome(String cumle,Stack<Character> stack) {  //metod
        
        for (int i = (cumle.length() / 2 ) + 1 ; i < cumle.length() ; i++) {
            if (cumle.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;        
    }
}
