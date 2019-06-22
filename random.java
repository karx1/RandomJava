public class random
{
  public static int randint(int low, int high)
  {
    int result = (int)(Math.random() * (high - low + 1)) + low;
    return result;
  }
}
