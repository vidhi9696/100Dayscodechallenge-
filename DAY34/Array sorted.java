//Given array is sorted
// Explanation: Taking [1 2 3 4 5] an array is sorted but how we check by recursion this array is sorted or not.We taking array in assending order so [1 2] are already sorted so we 
check [3 4 5] by recursion.

public class RecursionBasic {
  public static int fib(int n){
    if (n == 0||n == 1){
        return n;
    }
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fn = fnm1 + fnm2;
    return fn;
}
public static boolean isSorted(int arr[], int i){
    if(i == arr.length-1){
        return true;
    }
    if(arr[i] > arr[i+1]){
        return false;
 
    }
    return isSorted(arr, i+1);

}
public static void main(String args[]) {
    int arr[] = {1,2,3,4};
    System.out.println(isSorted(arr,0));
}

}
