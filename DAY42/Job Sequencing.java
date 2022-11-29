//QUESTION- Job Sequencing Problem
/*We have an array of jobs where every job has a deadline and associated profit if the job is
finished before the deadline. It is also given that every job takes a single unit of time, so the
minimum possible deadline for any job is 1. Maximize the total profit if only one job can be
scheduled at a time.
Sample Input 1 :
JobID Deadline Profit
a 4 20
b 1 10
c 1 40
d 1 30
Sample Output 1 : c, a*/

//Time Complexity : o(nlogn)
//Space Complexity: o(n)
  
import java.util.*;
class Solution {
static class Job {
char job_id;
int deadline;
int profit;

poojadhiman69424@gmail.com

Job(char job_id, int deadline, int profit){
this.deadline = deadline;
this.job_id = job_id;
this.profit = profit;
}
}
static void printJobScheduling(ArrayList<Job> arr){
int n = arr.size();
Collections.sort(arr, (a, b) -> {
return a.deadline - b.deadline;
});
ArrayList<Job> result = new ArrayList<>();
PriorityQueue<Job> maxHeap = new PriorityQueue<>(
(a, b) -> { return b.profit - a.profit; });
for (int i = n - 1; i > -1; i--) {
int slot_available;
if (i == 0) {
slot_available = arr.get(i).deadline;
}
else {
slot_available = arr.get(i).deadline

- arr.get(i - 1).deadline;

}
maxHeap.add(arr.get(i));
while (slot_available > 0
&& maxHeap.size() > 0) {
Job job = maxHeap.remove();
slot_available--;
result.add(job);
}
}
Collections.sort(result, (a, b) -> {
return a.deadline - b.deadline;
});
for (Job job : result) {
System.out.print(job.job_id + " ");
}

poojadhiman69424@gmail.com

System.out.println();
}
public static void main(String[] args){
ArrayList<Job> arr = new ArrayList<Job>();
arr.add(new Job('a', 2, 100));
arr.add(new Job('b', 1, 19));
arr.add(new Job('c', 2, 27));
arr.add(new Job('d', 1, 25));
arr.add(new Job('e', 3, 15));
System.out.println("Following is maximum "

+ "profit sequence of jobs");

printJobScheduling(arr);
}
}

