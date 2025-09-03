import java.util.*;

public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter for how many numbers you want to check: ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++)
        {
            int count = 0;

            System.out.println("Enter a number: ");
            int x = input.nextInt();

            while (x > 0)
            {
                x /= 10;
                count += 1;
            }
            System.out.println(count);
        }
    }
}



