package week13;

public class TiledRoom extends Room
{
    public TiledRoom (int A, float U, int T)
    {
        super(A, U, T);
    }
    public float CalculateCost(float hourlyRate)
    {
        // implement new CalculationCost calling super calculateCost
        return super.CalculateCost( hourlyRate * 1.5f ) + Area;
    }
}