package StatusTrackers;

public class OfficeStatusTracker_Part2
{
    public static void main(String[] args)
    {
        // This defines status progression in the array?
        String[] statuses =
        {
                "CaffeineDeficient",
                "Pending",
                "WaitforschoolBusToLoad + StandUpMeeting",
                "CommuteArrival",
                "AtDesk"
        };

        System.out.println("Office Status Progression:");

        // Loop through each status in SEQUENSIAL order
        for (int i = 0; i < statuses.length; i++) {
            System.out.println("Step " + (i + 1) + ": " + statuses[i]);
        }
    }
}
