public enum ApplianceUnit {
    FAN(4),
    LIGHT(2),
    AC(10),
    FRIDGE(8);

    private int value;

    private ApplianceUnit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
