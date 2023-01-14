import java.util.*;

//import javax.sound.sampled.SourceDataLine;
public class segregate {
    public static void main(String a[]) {
        int n=5;
        int arr[]={1,0,1,0,1};
        int left=0,right=n-1;
        while(true) {
            if (left>=right)
            break;
            if (arr[left]==0)
            left++;
            else if(arr[right]==1)
            right--;
            else {
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;

            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    } 
    }
