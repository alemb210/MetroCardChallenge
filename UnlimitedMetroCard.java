public class UnlimitedMetroCard extends MetroCard{
    private int remainingDays;

    public UnlimitedMetroCard()
    {
        super(0);
        remainingDays = 30;
    }

   public UnlimitedMetroCard(double balance, int days)
    {
        super(balance);
        remainingDays = days;
    }

    @Override
    public boolean swipe()
    {
        if(remainingDays > 0)
        {
            return true;
        }
        else
        {
            super.swipe();
        }
        return false;
    }

    public void setRemainingDays(int days)
    {
        remainingDays = days;
    }

    public void newDay()
    {
        setRemainingDays(remainingDays - 1);
    }

    public void addTime(int remainingDays)
    {
        remainingDays += 7;
    }

    public int getRemainingDays()
    {
        return remainingDays;
    }
}
