
public class FizzBuzz
	{

		// This is  a working now for FizzBuzz Game. Does it need to be in separate modules?
		public static void main(String[] args)
			{
				
				for (int i = 1; i <= 100; i++)
				{
					if ((i % 5 == 0) && (i % 3 ==0))
					{
						System.out.println("FizzBuzz");
					}
					else if (i % 3 == 0)
					{
						System.out.println("Fizz");
					}
					else if (i % 5 == 0)
					{
						System.out.println("Buzz");
					}
					else
					{
						System.out.println(i);
					}
				}

			}

	}
