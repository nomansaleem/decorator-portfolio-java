package week13;

public class Room
{
    int Area;
    float UnitPrice;
    int TimeRequired;

    public Room (int A, float U, int T )
    {
        this.Area = A;
        this.UnitPrice = U;
        this.TimeRequired = T;
    }

    public float CalculateCost (float HourlyRate )
    {
        return ( (UnitPrice * Area ) + (float)(HourlyRate * TimeRequired) );
    }
}
