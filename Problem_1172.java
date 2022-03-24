package Uri_online;

import java.util.Scanner;

public class Problem_1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        for(int i=19; i>=0; i--){
           arr[i] = sc.nextInt(); 
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("N["+i+"] = "+arr[i]);
        }
    }
}
