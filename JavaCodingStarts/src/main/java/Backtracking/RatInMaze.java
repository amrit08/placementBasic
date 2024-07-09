package Backtracking;

public class RatInMaze
{
    public static void main(String[] args)
    {
        int mat[][]= {
                    {1,1,1,0},
                    {1,1,0,1},
                    {1,1,0,0},
                    {1,1,1,1},
        };

        int n = mat.length;
        int m = mat[0].length;
        boolean vis[][] = new boolean[n][m];
        vis[0][0] = true;
        ratInMaze(mat,vis,0,0,"",n,m);


    }

    static boolean isValid(int i, int j,int mat[][],boolean vis[][], int n, int m)
    {
        if(i<n && i>=0 &&j<m &&j>=0 && mat[i][j] ==1&&vis[i][j] == false)
        {
            return true;
        }

        return false;
    }

    static void ratInMaze(int mat[][],boolean vis[][],int i, int j,String path,int n, int m)
    {
        if(i == n-1 && j == m-1) //bottom corner reached
        {
            System.out.println(path);
            return;
        }
        if(isValid(i+1,j,mat,vis,n,m))//Going Down
        {
            vis[i+1][j] = true;
            ratInMaze(mat,vis,i+1,j,path +'D',n,m);
            vis[i+1][j] = false;
        }
        if (isValid(i,j-1,mat,vis,n,m))//Going Left
        {
            vis[i][j-1] = true;
            ratInMaze(mat,vis,i,j-1,path+'L',n,m);
            vis[i][j-1] = false;
        }
        if (isValid(i,j+1,mat,vis,n,m))//Going Right
        {
            vis[i][j+1] = true;
            ratInMaze(mat,vis,i,j+1,path+'R',n,m);
            vis[i][j+1] = false;
        }
        if(isValid(i-1,j,mat,vis,n,m))//Going Up
        {
            vis[i-1][j] = true;
            ratInMaze(mat,vis,i-1,j,path +'U',n,m);
            vis[i-1][j] = false;
        }

    }

}
