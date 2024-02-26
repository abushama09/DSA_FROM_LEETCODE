import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string ");
        String s = sc.nextLine();
        int Flag =0;
        String ab = new String();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== 'a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U'){
                Flag +=1;
                
            }
            else{
                ab += s.charAt(i);
            } 
       }
       System.out.println(ab);
       System.out.println( "no of vowels :"+ Flag );
       
    }
       

    
    
    
}
