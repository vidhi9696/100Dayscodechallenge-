public class Main
{
    public static void main(String[] args) {
        
        int n=4;
        //taking 2nd alphabet as a starting pattern
        char ch='B';
        //outer loop
        for(int i =1;i<=n;i++){
            //Inner loop 
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }


    }
}
