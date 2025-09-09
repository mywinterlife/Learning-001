package InputLogicOutput;

public class ILO1
{
    public static void main(String[] args) {
        // Create variables for a study schedule
        // INPUT: Raw data about your study plan
        String subject = "Programming";
        int hoursPerWeek = 10;
        //int for days remain *whole numbers
        double hoursPerDayDouble = hoursPerWeek / 7.0; // Why 7.0 instead of 7?
        //When you divide an int by a double, the result is a double. We are saving it as a double.
        //int hoursPerDayCastInt = hoursPerWeek / 7.0;
        //The above line gives an error because you cannot store a double value in an int variable without explicit casting.
        //This is because Java doesn't want to set a default method of rounding (up or down), in the event that someone inadvertantly loses data.
        int hoursPerDayInt = hoursPerWeek / 7;  // Why 7 instead of 7.0?
        double hoursPerDayCast = hoursPerWeek / 7; // Why 7 instead of 7.0?
        //When you divide an int by an int, the result is an int. We are saving it as a double, so the int is cast to a double, but still doesn't contain the proper division decimals.
        boolean isWeekend = false;
        char difficultyLevel = 'B';  // A=Easy, B=Medium, C=Hard

        System.out.println("double " + hoursPerDayDouble);
        System.out.println("This divided an int by a double, so the result is a double.");
        System.out.println("int " + hoursPerDayInt);
        System.out.println("This divided an int by an int, so the result is an int.");
        System.out.println("cast " + hoursPerDayCast);
        System.out.println("This divided an int by an int, so the result is an int, then cast to a double. This is why it doesn't have the decimal precision.");

// QUESTIONS:
// 1. What type is hoursPerDay after the division?
//  Answer: double
// 2. What happens if you use 7 instead of 7.0?
//  Answer: Integer division: 10 ÷ 7 = 1 - It truncates, and you lose Data!
// 3. Why char for difficulty instead of String?
//Notes:
//#1
//#2
//What happens if you use 7 instead of 7.0?
//Integer division: 10 ÷ 7 = 1 (truncates)
//Then 1 gets converted to 1.0 for storage
//You lose the decimal precision!
//Division type depends on operands, not storage variable!
//inPractice
//int hoursPerWeek = 10;
//double method1 = hoursPerWeek / 7;    // Why does this give 1.0?
//double method2 = hoursPerWeek / 7.0;  // Why does this give 1.428...?
//// Answer: Integer division vs decimal division happens BEFORE storage!
//#3
    }
}
