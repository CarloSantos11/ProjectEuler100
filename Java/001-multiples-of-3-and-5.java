class Solution
{
  public static long multiples()
  {
    long sum = 0 ;
      
      for(long i = 1 ; i < 1000 ; i++) 
    {
    	if((i % 3 == 0 || i % 5 == 0))
        sum+=i;
    }
    
    return sum;
  }
	public static void main(String[] args) 
  {
      long ans = multiples();
      System.out.println(ans);
  }
}
