class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int total=0;
        boolean server;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                server=false;
                if(grid[i][j]==1){
                    for(int k=0;k<n;k++){
                        if(k==j){
                            continue;
                        }
                        if(grid[i][k]==1){
                            server=true;
                            break;
                        }
                    }
                    if(!server){
                         for(int l=0;l<m;l++){
                        if(l==i){
                            continue;
                        }
                        if(grid[l][j]==1){
                            server=true;
                            break;
                        }
                     }
                    }
                }
                if(server==true){
                    total++;
                }
            }
        }
        return total;
    }
}