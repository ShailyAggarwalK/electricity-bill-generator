import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BillGeneratorTest {

    @Test
    public void shouldReturnCorrectBill() {
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(new Appliance(ApplianceUnit.FAN, 2, 4));
        appliances.add(new Appliance(ApplianceUnit.LIGHT, 1, 4));

        Home home = new Home(appliances);
        home.addAppliance(new Appliance(ApplianceUnit.AC, 1, 12));
        home.addAppliance(new Appliance(ApplianceUnit.FRIDGE, 1, 5));

        String bill = BillGenerator.generateElectricityBill(home);

        assertEquals("200000 INR\n" +
                "Units Per Day : (2*4*4 + 1*4*2 +1*12*10 + 1*5*8) = 200\n" +
                "unitsPerMonth = 6000\n" +
                "totalBill = 1000*20 + 2000*30 + 3000*30 + 3000*50 = 200000", bill);
    }
}
