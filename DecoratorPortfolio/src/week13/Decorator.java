package week13;
import java.util.Scanner;

public class Decorator
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter hourly rate: ");
        float HourlyRate = in.nextFloat();

        Job MyJob = new Job(HourlyRate);
        boolean keepGoing = true;

        while (keepGoing)    // Loop starting here
        {
            System.out.print("Please enter room's area: ");
            int Area = in.nextInt();

            System.out.print("Please enter room's unit cost: " );
            float Unitcost = in.nextFloat();

            System.out.print("Please enter room's decorating time: ");
            int TimeNeeded = in.nextInt();


            System.out.print("Is it a tiled room? (Yes(y)/No(N): ");
            char ans = in.next().charAt(0);
            Room MyRoom;
            if (ans == 'n')
                 MyRoom = new Room(Area, Unitcost, TimeNeeded);
            else
                 MyRoom = new TiledRoom(Area, Unitcost, TimeNeeded);
            MyJob.AddRoom(MyRoom);

            // Keep the program based on the n/y question below
            System.out.print("Add another room? (Yes(y)/No(N): ");
            ans = in.next().charAt(0);
            if ( ans == 'n' )
                keepGoing = false;
        }    // loop ends here

        System.out.println("The job will cost £" + MyJob.CalculateCost());

    }

}

