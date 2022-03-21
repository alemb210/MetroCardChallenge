public class MetroCardTester
{
    public static void main(String [] args)
    {                                             // EXPECTED OUTPUT
        // SHOWN BELOW:
        MetroCard card1 = new MetroCard();
        System.out.println("New MetroCard (empty):");
        System.out.println(card1.swipe());          // false
        System.out.println(card1.getBalance());     // 0.0
        card1.addValue(5.00);
        System.out.println(card1.swipe());          // true
        System.out.println(card1.getBalance());     // 2.25
        System.out.println("---------\n");

        System.out.println("New MetroCard with $10.00 balance:");
        MetroCard card2 = new MetroCard(10.00);
        System.out.println(card2.getBalance());     // 10.0
        System.out.println(card2.swipe());          // true
        System.out.println(card2.getBalance());     // 7.25
        System.out.println(card2.swipe());          // true
        System.out.println(card2.getBalance());     // 4.5
        System.out.println(card2.swipe());          // true
        System.out.println(card2.getBalance());     // 1.75
        System.out.println(card2.swipe());          // false
        System.out.println(card2.getBalance());     // 1.75
        System.out.println("---------\n");

        // UNCOMMENT TO TEST EACH NEW CLASS

    System.out.println("New SingleRideMetroCard:");
    SingleRideMetroCard card3 = new SingleRideMetroCard();
    System.out.println(card3.swipe());          // true
    System.out.println(card3.swipe());          // false
    System.out.println("---------\n");


    System.out.println("New ReducedFareMetroCard with $4.00 balance:");
    ReducedFareMetroCard card4 = new ReducedFareMetroCard(4.00);
    System.out.println(card4.getBalance());     // 4.0
    System.out.println(card4.swipe());          // true
    System.out.println(card4.getBalance());     // 2.65
    System.out.println(card4.swipe());          // true
    System.out.println(card4.getBalance());     // 1.3
    System.out.println(card4.swipe());          // false
    System.out.println(card4.getBalance());     // 1.3
    System.out.println("---------\n");

    System.out.println("New StudentMetroCard (with 3 swipes):");
    StudentMetroCard card5 = new StudentMetroCard();
    System.out.println(card5.swipe());          // true
    System.out.println(card5.swipe());          // true
    System.out.println(card5.swipe());          // true
    System.out.println(card5.swipe());          // false
    System.out.println("yay it's a new day! 3 more swipes:");
    card5.resetSwipes();
    System.out.println(card5.swipe());          // true
    System.out.println(card5.swipe());          // true
    System.out.println(card5.swipe());          // true
    System.out.println(card5.swipe());          // false

        System.out.println("new UnlimitedMetroCard with 30 days");
        UnlimitedMetroCard card6 = new UnlimitedMetroCard();
        System.out.println(card6.getBalance());         //0
        System.out.println(card6.getRemainingDays());   //30
        System.out.println(card6.swipe());              //true
        card6.setRemainingDays(0);
        System.out.println(card6.getRemainingDays());   //0
        System.out.println(card6.swipe());              //false
    }
}
