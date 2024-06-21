package strBuilder;

import java.util.*;
public class reverseSentence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        StringBuilder sb= new StringBuilder(sc.nextLine());

        int n=sb.length();
        
      int i=0;
      int j=0;

      while(j<n){
        if(sb.charAt(j)!=' ') j++;
        else{
            reverse(sb, i, j-1);
            i=j+1;
            j=i;
        }
      }
      reverse(sb, i, j-1);
      System.out.print(sb+" ");
    }


    static void reverse(StringBuilder sb, int i,int j) {

        while(i<=j){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;

        }
       
    }
    
}
