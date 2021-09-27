class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int r1=mat.length;
        int c1=mat[0].length;
        if((r1==r && c1==c) || (r*c != r1*c1)){
            return mat;
        }
        
        int[][] ans=new int[r][c];
        Queue<Integer> q1=new LinkedList<>();
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                q1.add(mat[i][j]);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=q1.remove();
            }
        }
        return ans;
    }
}