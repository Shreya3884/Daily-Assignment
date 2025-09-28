import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int n = nums.length;
        int j=0;
        int arr[]=new int[n-k+1];
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        arr[j++]=nums[dq.getFirst()];
        for(int i=k;i<n;i++){
            if(dq.getFirst()<=(i-k)){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            arr[j++]=nums[dq.getFirst()];
        }
        return arr;
    }
}