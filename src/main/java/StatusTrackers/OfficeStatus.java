package main.java.StatusTrackers;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class OfficeStatus
        {
            public static void main(String[] args) 
            {
                boolean inOffice = isInOfficeToday();
                System.out.println("Office status today: " + inOffice);
            }

            public static boolean isInOfficeToday()
            {
                DayOfWeek today = LocalDate.now().getDayOfWeek();
                DayOfWeek[] officeDays = new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY
                };

                for(DayOfWeek twt : officeDays)
                {
                    if (today == twt)
                    {
                        return true;
                    }
                }

                return false;
            }
        }