import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplianceTest {
    Appliance appliance = new Appliance(ApplianceUnit.FAN, 2, 4);

    @Test
    public void shouldReturnCorrectUnitPerDay() {
        assertEquals(appliance.unitsPerDay(), 32);
    }

    @Test
    public void shouldReturnCorrectUnitPerDayText() {
        assertEquals(appliance.unitsPerDayText(), "2*4*4");
    }
}
