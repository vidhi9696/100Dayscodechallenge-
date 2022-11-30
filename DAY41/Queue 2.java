/*Connect n ropes with minimum cost
Given are N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
Sample Input 1 : N = 4, arr = [4 3 2 6]
Sample Output 1 : 29
Sample Input 2 : N = 2, arr = [1 2 3]
Sample Output 2 : 9 */
 
  Time Complexity : o(n)
Space Complexity: o(n)
import java.util.*;

class Solution{
static int minCost(int arr[], int n){
PriorityQueue<Integer> pq
= new PriorityQueue<Integer>();
for (int i = 0; i < n; i++) {
pq.add(arr[i]);
}
int res = 0;
while (pq.size() > 1) {
int first = pq.poll();
int second = pq.poll();
res += first + second;
pq.add(first + second);
}
return res;
}
public static void main(String args[]){
int len[] = { 4, 3, 2, 6 };
int size = len.length;
System.out.println("Total cost for connecting"
+ " ropes is "
+ minCost(len, size));

}
} 
