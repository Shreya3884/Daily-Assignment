class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int[] freq=new int[255];
        
        int ans=0;
        while(j<s.length()){
            freq[s.charAt(j)]++;

            while(freq[s.charAt(j)]>1 && i<s.length()){
              
                freq[s.charAt(i)]--;
                i++;
            }
           
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
        
    }
}