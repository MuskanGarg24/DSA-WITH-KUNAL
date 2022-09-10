public class Code13 {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int m = image.length;
        int n = image[0].length;
        
        int[][] invertImage = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=n-1; j>=0; j--){
               invertImage[i][n-j-1] = image[i][j];
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(invertImage[i][j]==1){
                    invertImage[i][j]=0;
                }
                else if(invertImage[i][j]==0){
                    invertImage[i][j]=1;
                }
            }
        }
        
        return invertImage;
    }
}