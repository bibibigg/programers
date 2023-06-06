import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isLowerCase(c)) {
                b += Character.toUpperCase(c);
            } else {
                b += Character.toLowerCase(c);
            }
        }
        System.out.print(b);
    }
}