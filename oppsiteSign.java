package edyoda.assignment2;

public class oppsiteSign {

        static boolean oppositeSigns(int x, int y)
        {
            return ((x ^ y) < 0);
        }

        public static void main(String[] args)
        {
            int x = 25, y = -25;
            if (oppositeSigns(x, y) == true)
                System.out.println("Signs are opposite");
            else
                System.out.println("Signs are not opposite");
        }
    }
