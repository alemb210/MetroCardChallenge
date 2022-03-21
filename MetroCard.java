public class MetroCard // the standard pay-per-ride yellow MetroCard
{
    // INSTANCE VARIABLES
    private double balance;
    private double fareCost;

    // CONSTRUCTORS

    // constructor for a new, empty MetroCard (with 0 balance)
    public MetroCard()
    {
        balance = 0.0;
        fareCost = 2.75; // standard MetroCard charge is 2.75 per ride
    }

    // constructor for a new MetroCard with an initial balance
    public MetroCard(double initialBalance)
    {
        balance = initialBalance;
        fareCost = 2.75;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getFareCost()
    {
        return fareCost;
    }

    public void setFareCost(double newFareCost)
    {
        fareCost = newFareCost;
    }

    // PUBLIC METHODS

    // adds dollar amount to balance
    public void addValue(double amount)
    {
        balance += amount;
    }

    // if the card has enough money on the card for a swipe, reduce
    // balance by fare and return true (to indicate a successful swipe);
    // otherwise, return false (to indicate an unsuccessful swipe)
    public boolean swipe()
    {
        if (balance >= fareCost)
        {
            balance -= fareCost;
            return true;
        }

        // not enough money or not activated
        return false;
    }
}