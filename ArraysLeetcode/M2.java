import java.util.*;

// spiral matrix - 2

public class M2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter rows and cols: ");
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        int dir=0;
        
        int top=0;
        int down = n-1;
        int left = 0;
        int right = n-1;

        int i=1;
        int j;

        while(i<=n*n){
            while(top<=down && left<=right){
                if(dir==0){
                    for(j=top; j<=right; j++){
                        arr[top][j] = i;
                        i++;
                    }
                    top = top + 1;
                    dir = 1;
                }
                else if(dir==1){
                    for(j=top; j<=down; j++){
                        arr[j][right] = i;
                        i++;
                    }
                    right = right-1;
                    dir = 2;
                }
                else if(dir==2){
                    for(j=right; j>=left; j--){
                        arr[down][j] = i;
                        i++;
                    }
                    down = down-1;
                    dir = 3;
                }
                else if(dir==3){
                    for(j=down; j>=top; j--){
                        arr[j][left] = i;
                        i++;
                    }
                    left = left+1;
                    dir=0;
                }
                
            }
        }

        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        in.close();

    }
}
