/* Maximum of all subarrays of size k
We have an array arr[] of size N and an integer K. Find the maximum for each and every
contiguous subarray of size K.
Sample Input 1 : N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
Sample Output 1 : 3 3 4 5 5 5 6 */

import java.util.Deque;
import java.util.LinkedList;
public class Solution {
static void printMax(int arr[], int n, int k){
Deque<Integer> Qi = new LinkedList<Integer>();
int i;
for (i = 0; i < k; ++i) {
while (!Qi.isEmpty() && arr[i] >=
arr[Qi.peekLast()])
Qi.removeLast();
Qi.addLast(i);
}
for (; i < n; ++i) {
System.out.print(arr[Qi.peek()] + " ");
while ((!Qi.isEmpty()) && Qi.peek() <=

i - k)
Qi.removeFirst();
while ((!Qi.isEmpty()) && arr[i] >=
arr[Qi.peekLast()])
Qi.removeLast();
Qi.addLast(i);
}
System.out.print(arr[Qi.peek()]);
}

poojadhiman69424@gmail.com

public static void main(String[] args){
int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
int k = 3;
printMax(arr, arr.length, k);
}
}
