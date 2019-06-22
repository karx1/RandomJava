public class random
{
  public static int randomInt(int low, int high)
  {
    int result = (int)(Math.random() * (high - low + 1)) + low;
    return result;
  }
}
