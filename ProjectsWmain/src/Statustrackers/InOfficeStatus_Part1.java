package Statustrackers;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class InOfficeStatus_Part1 {
    // office status method checks if Brian is in office today using the isInOfficeToday method.
    public static class OfficeStatus {
        public static void main (String[] args) {
            boolean inOffice = isInOfficeToday();
            System.out.println("Office status today: " + inOffice);
        }

        public static boolean isInOfficeToday() {
            //Should pull current day of week?
            DayOfWeek today = LocalDate.now().getDayOfWeek();

            // Should define which days are in schedule
            DayOfWeek[] officeDays =
                    {
                            DayOfWeek.TUESDAY,
                            DayOfWeek.WEDNESDAY,
                            DayOfWeek.THURSDAY
                    };

            for (DayOfWeek twt : officeDays) {
                if (today == twt) {
                    return true; // Matching OfficeDay Was Found
                }
            }

            // If no match found
            return false;
        }
    }
}

