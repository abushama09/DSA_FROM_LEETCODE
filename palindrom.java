import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int x = n;
        
        int num = 0;
        while(n>0){
            num = num*10+(n%10);
            n = n/10;
        }
        System.out.print(num);
        if(num == x){
            System.out.println(" is palindrome");
        }else{
            System.out.println(" not palindrome");
        }
        


    }
}
