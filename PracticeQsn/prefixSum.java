package PracticeQsn;

public class prefixSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
       
        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]+arr[i];
           
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
