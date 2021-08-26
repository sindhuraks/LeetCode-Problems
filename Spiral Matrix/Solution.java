class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        int k = 0,l = 0,m = matrix.length,n = matrix[0].length,i;
        
        while(k<m && l<n) {
            
            for(i=l;i<n;i++) {
                ans.add(matrix[k][i]);
            }
            k++;
            
            for(i=k;i<m;i++) {
                ans.add(matrix[i][n-1]);
            }
            n--;
            
            if(k<m){
                
                for (i = n - 1; i >= l; --i) {
                    ans.add(matrix[m-1][i]);
                }
                
                m--;
            }
            if(l<n) {
                
                for (i = m - 1; i >= k; --i) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
            
        }
        
        return ans;
    }
}
