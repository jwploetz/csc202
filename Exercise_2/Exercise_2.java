import java.util.*;

public class Exercise_2 {

    public static void main(String[] args) {
        // user in
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an int array list: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true)
        {
            int n = keyboard.nextInt();

            if(n==0)
                break;
            
            list.add(n);
        }

            //test methods
            System.out.println("The max value in the list is: " + max(list));
            System.out.println("The sum of the list is: " + sum(list));
    }


    public static int max(ArrayList<Integer> list)
    {
        int highest = list.get(0);
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i)>highest)
                highest=list.get(i);
        }
        return highest;
    }

    public static int sum(ArrayList<Integer> list)
    {
        int total=0;
        for(int i=0; i<list.size(); i++)
        {
            total += list.get(i);
        }
        return total;
    }

}