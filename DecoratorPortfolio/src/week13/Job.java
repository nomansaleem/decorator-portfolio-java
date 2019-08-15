package week13;

import java.util.ArrayList;

public class Job
{
    float HourlyRate;
    ArrayList<Room> roomList;

    public Job (float H)
    {
        this.HourlyRate = H;
        //Initialise the array list
        roomList = new ArrayList<Room>();
    }

    public void AddRoom(Room r)
    {
        roomList.add(r);
    }

    public float CalculateCost()
    {
        // return (TheRoom.CalculateCost(HourlyRate));
        float totalCost = 0.0f;
        for (int i = 0; i < roomList.size(); i++)        // (Room r : roomList )
        {
            //totalCost = (float) (0.0 + r.CalculateCost(HourlyRate));
            totalCost = totalCost + roomList.get(i).CalculateCost(HourlyRate);
        }
        return totalCost;
    }

}
