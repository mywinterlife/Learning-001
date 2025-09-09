package InputLogicOutput;

public class ILO2
{
// LEARNING DISCOVERY:
// Division type depends on operands, not storage variable!
    int hoursPerWeek = 10;

    double method1 = hoursPerWeek / 7;    // Why does this give 1.0?
    double method2 = hoursPerWeek / 7.0;  // Why does this give 1.428...?
// Answer: Integer division vs decimal division happens BEFORE storage!
}
