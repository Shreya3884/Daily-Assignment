
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int n = points.length;
        int ans = 1;
        int end = points[0][1];
        for(int i = 1;i<n;i++){
            if(end >= points[i][0]){
                end = Math.min(points[i][1],end);
            }
            else if(end < points[i][0]){
                end = points[i][1];
                ans++;
            }
        }
        return ans;
    }
}
