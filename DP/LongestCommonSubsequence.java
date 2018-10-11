class LongestCommonSubsequence
{
  public static void main(String args[])
  {
    String input1 = "abcdf",
           input2 = "bcdabcgdf";
    char[] s1 = input1.toCharArray(),
           s2 = input2.toCharArray();
    
    String[][] res = new String[s1.length][s2.length];
    int[][] dp = new int[s1.length][s2.length];

    for(int i=0;i<s2.length;i++)
    {
      for(int j=0;j<s1.length;j++)
      {
        int c=0;
        String r="";
        if(s1[j] == s2[i])
        {
          if(i-1>=0 && j-1>=0)
          {
            r = res[j-1][i-1];
            c = dp[j-1][i-1];
          }
          r += s1[j];
          c++;
        }
        else
        {
          int c1=0, c2=0;
          String r1="", r2="";

          if(j-1>=0) { 
           c1 = dp[j-1][i];
           r1 = res[j-1][i];
          }
          if(i-1>=0) {
            c2 = dp[j][i-1];
            r2 = res[j][i-1];
          }
          
          if(c1>c2) {
            c = c1;
            r = r1;            
          }
          else {
            c = c2;
            r = r2;
          }           
        }

        dp[j][i] = c;
        res[j][i] = r;
      }
    }

    System.out.println(dp[s1.length-1][s2.length-1]);
    System.out.println(res[s1.length-1][s2.length-1]);

  }

  
}