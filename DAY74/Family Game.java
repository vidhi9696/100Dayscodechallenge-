import java.util.*;
public class family {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int i,j=0;
        String a;
        System.out.println("enter the string");
        a=sc.nextLine();
        char ar[]=a.toCharArray();
        boolean[] ar1=new boolean[n];
        for(i=0;i<ar1.length;i++){
            ar1[i]=true;
        }

        while(n!=1){
        for(i=0;i<ar.length;i++){
            if(ar1[i]==true){
                     if(ar[j]=='y'){
                          ar1[j]=false;
                          j++;
                          n--;
                     }
                     else{
                        j++;
                     }
            }
            i++;
            if(i>=ar1.length){
                i=0;
            }
            if(j>=ar.length){
                j=0;
            }
        }
    }
     for(i=0;i<ar1.length;i++){
        if(ar1[i]==true){
            break;

        }
     } 
     System.out.println("the winner is  ="+(i+1));  
  }
}
