import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print((n & 0x1) == 0 ? n + " is even" : n + " is odd");
        sc.close();
    }
}