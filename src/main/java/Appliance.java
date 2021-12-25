public class Appliance {

    private final ApplianceUnit applianceType;
    private final int count;
    private final int usagePerDayInHours;

    public Appliance(ApplianceUnit applianceType, int count, int usagePerDayInHours) {
        this.applianceType = applianceType;
        this.count = count;
        this.usagePerDayInHours = usagePerDayInHours;
    }

    public int unitsPerDay() {
        return count * usagePerDayInHours * applianceType.getValue();
    }

    public String unitsPerDayText() {
        return count + "*" + usagePerDayInHours + "*" + applianceType.getValue();
    }
}
