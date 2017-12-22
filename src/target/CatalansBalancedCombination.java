import java.io.*;
import java.util.*;

class Solution {

  static int numOfPathsToDest(int n) {
     if (n == 1)
        return 1;
    int[] c = new int[n+1];
   
     c[0]=1;
    c[1]=1;
    c[2]=2;
 
    int i,j;
 
    //now, using bottom up DP, we will implement the recursive formula of catalan number to find the required value
    for(i=3;i< n;i++)
    {
        c[i]=0;
 3
        for(j=0;j<i;j++)
        {
          //0-3 . --c[3] = c[o]*c[2] +c[1] *c[1]
            c[i]+=c[j] * c[(i-1)-j];
        }
    }
 
    return c[n-1];
    
   
  }
  
   static int numOfPathsToDest(int[][] numPath, int i, int j) {
     if(i<0 || j <0)
       return 0;
     else if (i < j)
       numPath[i][j] = 1;
     else if (i == 0 && j == 0)
        numPath[i][j] = 1;
     else
       numPath[i][j] =  numOfPathsToDest(numPath, i, j -1) + numOfPathsToDest(numPath, i-1, j);
     
     return numPath[i][j];
     
   }


  public static void main(String[] args) {
  }

}