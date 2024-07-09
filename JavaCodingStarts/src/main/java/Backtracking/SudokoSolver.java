package Backtracking;

public class SudokoSolver
{
    public static void main(String[] args)
    {
        int board[][] = {
                            {5,3,0,0,7,0,0,0,0},
                            {6,0,0,1,9,5,0,0,0},
                            {0,9,8,0,0,0,0,6,0},
                            {8,0,0,0,6,0,0,0,3},
                            {4,0,0,8,0,3,0,0,1},
                            {7,0,0,0,2,0,0,0,6},
                            {0,6,0,0,0,0,2,8,0},
                            {0,0,0,4,1,9,0,0,5},
                            {0,0,0,0,0,0,0,7,9},

                        };
            sudokoSolver(board,0,0);

            for (int a[]:board)
            {
                for (int e:a)
                {
                    System.out.print(e+" ");
                }
                System.out.println();
            }

    }

    static boolean sudokoSolver(int a[][],int row,int col)
    {
        if (row == 9) return true;
        if(col == 9) return sudokoSolver(a,row+1,0);
        if (a[row][col] != 0) return sudokoSolver(a,row,col+1);

        for (int i=1;i<=9;i++)
        {
            if(isSafeSudoko(a,row,col,i))
            {
                a[row][col] =i;
                if (sudokoSolver(a,row,col+1)) return true;
                a[row][col] = 0;//backtracking
            }
        }
        return false;
    }

    private static boolean isSafeSudoko(int[][] a, int row, int col, int num)
    {
        for(int i=0;i<9;i++)
        {
            if(a[row][i] == num) return false;
            if (a[i][col] == num)return false;
        }
        int gridRow = row/3;
        int gridCol = col/3;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                int cellRow = gridRow*3+i;
                int cellCol = gridCol*3+j;

                if (a[cellRow][cellCol] == num) return false;
            }
        }
        return true;
    }


}
