package dynamicProgramming;

public class KthPalindrome {


static int lcs( String X, String Y, int m, int n )
{
    int L[][] = new int[m+1][n+1];
 
    /* Following steps build L[m+1][n+1] in bottom up
        fashion. Note that L[i][j] contains length of
        LCS of X[0..i-1] and Y[0..j-1] */
    for (int i = 0; i <= m; i++)
    {
        for (int j = 0; j <= n; j++)
        {
            if (i == 0 || j == 0)
                L[i][j] = 0;
            else if (X.charAt(i - 1) == Y.charAt(j - 1))
                L[i][j] = L[i - 1][j - 1] + 1;
            else
                L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
        }
    }
    // L[m][n] contains length of LCS for X and Y
    return L[m][n];
}
 
// find if given string is K-Palindrome or not
static boolean isKPal(String str, int k)
{
    int n = str.length();
 
    // Find reverse of string
   
    String revStr = new StringBuffer(str).reverse().toString();
 
    // find longest palindromic subsequence of
    // given string
    int lps = lcs(str, revStr, n, n);
 
    // If the difference between longest palindromic
    // subsequence and the original string is less
    // than equal to k, then the string is k-palindrome
    return (n - lps <= k);
}
 
// Driver program
public static void main(String[] args)
{
    String str = "qnnn";
    int k = 2;
   String res = isKPal(str, k) ? "Yes" : "No";
   System.out.println("res"+res);

}
}