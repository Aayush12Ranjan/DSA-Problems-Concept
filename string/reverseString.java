package string;

public class reverseString {
    public static void main(String[] args) {
        String str="Aayush Ranjan";
        int n=str.length();
        for(int i=n-1; i>=0 ;i--){
            System.out.print(str.charAt(i));
        }
    }
    
}
