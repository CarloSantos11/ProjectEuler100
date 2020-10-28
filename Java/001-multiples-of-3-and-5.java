class Solution
{
  public static long multiples()
  {
    long sum = 0 ;
      
    //Adding all multiples of 3
    for(long i = 3 ; i < 1000 ; i+=3)
    {
      sum+=i;
    }

    //Adding all multiples of 5
    for(long i = 5 ; i < 1000 ; i+=5)
    {
      sum+=i;
    }       

    //Removing all multiples of 3 AND 5 i.e 15
    for(long i = 15 ; i < 1000 ; i+=15)
    {
      sum-=i;
    }
    
    return sum;
  }
	public static void main(String[] args) 
  {
      long ans = multiples();
      System.out.println(ans);
  }
}
